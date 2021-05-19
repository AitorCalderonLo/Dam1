create table Dep
(numdep int primary key,
nomdep varchar(30) not null,
numemple int not null default 0);

create table Emp
(numemp int primary key,
nomemp varchar(40) not null,
salemp float not null,
numdep int not null,
foreign key(numdep) references Dep(numdep) on update cascade);

create trigger nuevoempleado
after insert on emp
for each row
update dep set numemple = numemple + 1
where numdep = new.numdep;

insert into Dep (numdep,nomdep)
values (1, 'Compras'), (2, 'Ventas');
insert into Emp values (1, 'Jose Gil', 1250.45, 1);

create trigger bajaEmpleado
after delete on emp
for each row
update dep set numemple = numemple -1
where numdep = old.numdep;

delete from Emp where numemp=1;

insert into Emp values (1, 'Ana Gil', 1350, 1);
insert into Emp values (2, 'Luisa Gómez', 2156.34, 1);
/*
delimiter //
create trigger modificarEmple
after update on emp
for each row
begin
	if old.numdep != new.numdep then
		update dep set numemple = numemple -1
			where numdep = old.numdep;
            
		update dep set numemple = numemple + 1
			where numdep = new.numdep;
    end if;
end;//
*/
/* 1 */
/*create table articulosAntiguos as select * from articulo;
delete from articulosAntiguos;*/

create trigger borradoArt
after delete on articulo
for each row
insert into articulosAntiguos values (old.codart,old.desart,old.pvpart);

delete from articulo where codart = 'a999';

/* 2 */

create table AuditoriaPrecios (
linea varchar(100));
/*
drop trigger auditar;
delimiter //
create trigger auditar
after update on articulo
for each row
begin
	if((old.pvpart - new.pvpart)>old.pvpart * 0.10) || (new.pvpart - old.pvpart)>old.pvpart * 0.10) then
    	insert into AuditoriaPrecios values (concat("El articulo ", old.desart ," ha cambiado su precio de ",old.pvpart," a ", new.pvpart));		
    end if;
    
end;
//
*/
update articulo set pvpart = pvpart *0.50 where codart = 'a0078';

/* 3 */
create table EmpleadosAntiguos as select * from emple;
delete from EmpleadosAntiguos;
alter table EmpleadosAntiguos 
add fecha_baja date;
alter table EmpleadosAntiguos 
add finiquito float;

drop trigger añadirEmpAnt;

delimiter //
create trigger añadirEmpAnt
after delete on emple
for each row
begin
	declare oficio varchar(30) default old.oficio;
    declare antiguedad int default timestampdiff(month, old.fecha_alt, current_date());
    declare finiquito float;
    
    if oficio = 'empleado' or oficio = 'vendedor' then
		set finiquito = old.salario * (antiguedad / 12);
	else
		set finiquito = (old.salario/30 * 20) * (antiguedad / 12) ;

    end if;

	insert into EmpleadosAntiguos values(old.emp_no, old.apellido,old.oficio,old.dir,old.fecha_alt,old.salario,old.comision,old.dept_no,
    current_date(),finiquito);
end;//

delete from emple where emp_no = 7521;

/* 4 */
create table CambiosSalariales
(emp_no int,
apellido varchar(40) not null,
SalAnt float,
SalNue float,
Porcen  float,
Fecha date);

delimiter //
create trigger cambiosSalariales
after update on emple
for each row
begin
	if old.salario != new.salario then
		insert into CambiosSalariales values(new.emp_no,new.apellido,old.salario,new.salario,(new.salario - old.salario) 
        / old.salario * 100, current_date());
    end if;
end;//

update emple set salario = salario + salario * 0.10;

/*EJERCICIO 5*/
create table comisionesantig(
	emp_no int primary key,
    trienios int,
    plus float
)

Delimiter //
create event calcularPlusesTrienios
on schedule every 3 month starts current_timestamp
do
begin
	declare numeroEmple int;
    declare fechaAlta date;
    declare numAnyos float;
    declare cantTri int;
    declare fin boolean default 0;
	declare c cursor for select emp_no, fecha_alt from emple where timestampdiff(year, fecha_alt, current_date()) >= 3;
    declare continue handler for not found set fin = 1;
	delete from comisionesantig;
    open c;
    fetch c into numeroEmple, fechaAlta;
    while fin = 0 do
		set numAnyos = timestampdiff(year, fechaAlta, current_timestamp());
		if numAnyos >=3 then
			set cantTri = format(numAnyos / 3,0);
            insert into comisionesantig values (numeroEmple, cantTri, cantTri*45);
		end if;
        fetch c into numeroEmple, fechaAlta;
    end while;
    close c;
end;//


/*EJERCICIO 6*/

create table EstadisticasArticulos
(CodArt char(5) not null,
DesArt varchar(30) not null,
PVPArt float,
UnidadesVendidas int,
Fecha date);

Delimiter //
create event generarEstadisticasArt
on schedule every 1 month starts current_timestamp
do
begin
	declare codigo char(5);
    declare descripcion varchar(30);
    declare precio float;
    declare unidades int;
    declare fin boolean default 0;
    declare c cursor for select CodArt, DesArt, PVPArt from articulo;
    declare continue handler for not found set fin = 1;
    open c;
    fetch c into codigo, descripcion, precio;
    while fin = 0 do
		select count(CodArt) into unidades from lineapedido where CodArt = codigo;
        insert into estadisticasarticulos values (codigo, descripcion, precio, unidades, current_date());
        fetch c into codigo, descripcion, precio;
    end while;
    close c;
end;//

/*EJERCICIO 7*/

create table articulosobsoletos
(CodArt char(5) not null,
DesArt varchar(30) not null,
PVPArt float,
FecBaja date);

Delimiter //
create event bajaArticulosObsoletos
on schedule every 1 month starts current_timestamp
do
begin
	declare codigo char(5);
    declare descripcion varchar(30);
    declare precio float;
    declare fechaUltimo date;
    declare fin boolean default 0;
    declare c cursor for select CodArt, DesArt, PVPArt from articulo;
    declare continue handler for not found set fin = 1;
    open c;
    fetch c into codigo, descripcion, precio;
    while fin = 0 do
		select Max(fecped) into fechaUltimo from pedido p join lineapedido lp on p.refped = lp.RefPed where lp.CodArt = codigo;
        if fechaUltimo is null or timestampdiff(year, current_date, fechaUltimo) > 5 then
			insert into articulosObsoletos values(codigo, descripcion, precio, current_date);
            delete from articulo where CodArt = codigo;
            delete from lineapedido where CodArt = codigo;
        end if;
        fetch c into codigo, descripcion, precio;
    end while;
    close c;
end;//






