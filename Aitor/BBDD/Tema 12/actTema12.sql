/* 1 */

delimiter //
create procedure mostrarDatosDepart(numDept int)
begin
	declare duplicado boolean default 0;
    declare localidad varchar(40);
    declare nombre varchar(40);
    declare continue handler for not found set duplicado = 1;
	
    select loc, dnombre into localidad, nombre from depart where dept_no = numDept;
    
    if duplicado = 1 then
		select concat('No existe ningun departamento con el numero: ', numDept) Mensaje;
    else
		select concat('El nombre del departamento es ', nombre, ' y su localidad es ',localidad) Mensaje;
	end if;
end //

call mostrarDatosDepart(80);

/* 2 */
delimiter //
create procedure cambiarNombreDepart(numDept int, nombreDepart varchar(40))
begin
	declare duplicado boolean default 0;
    declare ndepartamento int;
    declare nombre varchar(40);
    declare continue handler for not found set duplicado = 1;
	declare continue handler for 1062 set duplicado = 2;

    
            /* 	BUSCAR DEPARTAMENTO PRIMERO Y SI NO MOSTRAR ERROR*/
	select dept_no into ndepartamento from depart where dept_no = numDept;
    
	update depart set dnombre = nombreDepart where dept_no = numDept;
    

    if duplicado = 1 then
		select concat('El nombre de dept ', numDept , ' no existe') Mensaje;
    elseif duplicado = 2 then
		select concat('No se ha podido realizar la operacion ya que el departamento ', nombreDepart, ' ya existe') Mensaje;
	else
		select concat('Operacion realizada correctamente') Mensaje;
	end if;
end //

call cambiarNombreDepart(20, "nasa");

/* 3 */
delimiter //
create procedure proc3(numDept int)
begin
	declare existenumdep int;
	declare duplicado int default 0;
    declare continue handler for not found set duplicado = 1;
	declare continue handler for 1451 set duplicado = 2;
    
    select dept_no into existenumdep from depart where dept_no = numDept;
    
    if duplicado = 1 then
		select concat('El nombre de dept ', numDept , ' no existe') Mensaje;
	else
		delete from depart where dept_no = numdept;
    
		if duplicado = 2 then
			select concat('No se puede borrar el dpto ' , numDept , ' por que tiene empleados trabajando en el') Mensaje;
		else
			select concat('Se ha borrado el dpto ' , numDept , ' correctamente') Mensaje;
		end if;
    end if;
    
    
    
end //
call proc3(99);


/* 4 */
delimiter //
create procedure AñadirLoc(idloc int, nombreLoc varchar(50), poblacionLoc int, nprovincia int)
begin
	declare duplicado boolean default 0;
    declare noexistefk boolean default 1;
	declare continue handler for 1062 set duplicado = 1;
    declare continue handler for 1452 set noexistefk = 0;
    
	insert into localidades values (idloc, nombreloc, poblacionloc, nprovincia);
    
    if duplicado = 1 then
		select concat('La localidad ' ,idloc, ' ya existe') Mensaje;
	else
		if noexistefk = 0 then
				select concat('La provincia ' ,nprovincia , ' no existe en la bd' ) Mensaje;
		else
				select concat('La localidad con el nº ', idloc, ' se ha añadido correctamente') Mensaje;
        end if;
	end if;
end; //
call AñadirLoc(11, "Localidad de prueba", 1, 6);

delimiter //
create procedure AñadirLoc2(idloc int, nombreLoc varchar(50), poblacionLoc int, nprovincia int)
begin
	declare notf boolean default 1; 
	declare continue handler for not found set notf = 0;
    
    select id_localidad into notf from localidades where id_localidad = idloc;
    
    if notf = 1 then
		select concat('Ya existe una localidad en la bd con el id ' ,idloc);
	else
		set notf = 1;
		select n_provincia into notf from provincias where n_provincia = nprovincia;
        if notf = 0 then
			select concat('La provincia ' ,nprovincia , ' no existe en la bd' ) Mensaje;
		else
        	insert into localidades values (idloc, nombreloc, poblacionloc, nprovincia);
			select concat('Se ha insertado la localidad con el id ',idloc, ' en la bbdd' ) Mensaje;
        end if;
    end if;
    
end; //
call AñadirLoc2(11, "hkk", 1, 6);

/* 5 */
/* 6 */
delimiter //
create procedure ejer6()
begin
	declare nomdep varchar(40);
	declare cantEmp int;
    declare salmedio double;
    declare fin int default 0;
	declare c cursor for select dnombre,count(emp_no),round(avg(salario),2) from depart natural join
		emple group by dept_no
		order by 2 desc;
		declare continue handler for not found set fin = 2;
        
	open c;
		fetch c into nomdep, cantEmp,salmedio;
		while fin<2 do
			select concat (fin ,' - Departartamento ' ,nomdep, ' cantidad de empleados ' , cantemp, ' Salario medio ',salMedio) "Datos";
			fetch c into nomdep, cantEmp,salmedio;
            set fin = fin+1;
		end while;
	close c;

end; //
call ejer6();

/* 7 */
delimiter //
create procedure ejer7(cantidad int)
begin
	declare ape varchar(40);
    declare ofi enum('EMPLEADO','VENDEDOR','DIRECTOR','ANALISTA','PROGRAMADOR','PRESIDENTE');
    declare sal float;
    declare com float;
	declare fin int default 1;

    
	declare c cursor for select apellido, oficio, salario, comision from emple
    order by salario asc
    limit cantidad;

	declare continue handler for not found set fin = 0;
    
    open c;
		fetch c into ape,ofi,sal,com;
		while fin=1 do
			select concat ("Apellido: " ,ape, " Oficio: ", ofi, " Salario: ", sal, " Comision: " ,com) "Datos";
			fetch c into ape,ofi,sal,com;
		end while;
	close c;


end; //
call ejer7(3);

/* 8 */ 
