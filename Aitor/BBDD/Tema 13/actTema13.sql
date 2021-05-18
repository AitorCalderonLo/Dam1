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
		insert into CambiosSalariales values(old.emp_no,old.apellido,old.salario,new.salario,(new.salario - old.salario) 
        / old.salario * 100, current_date());
    end if;
end;//

update emple set salario = salario + salario * 0.10;

