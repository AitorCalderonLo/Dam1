/* 1 */

delimiter //
create procedure mostrarDatosDepart(numDept int)
begin
	declare duplicado boolean default 0;
    declare localidad varchar(40);
    declare nombre varchar(40);
    declare continue handler for not found set duplicado = 1;
    
    // 	BUSCAR DEPARTAMENTO PRIMERO Y SI NO MOSTRAR ERROR
    select loc, dnombre into localidad, nombre from depart where dept_no = numDept;
    
    if duplicado = 1 then
		select concat('No existe ningun departamento con el numero: ', numDept) Mensaje;
    else
		select concat('El nombre del departamento es ', nombre, ' y su localidad es ',localidad) Mensaje;
	end if;
end //

call mostrarDatosDepart(50);

/* 2 */
delimiter //
create procedure cambiarNombreDepart(numDept int, nombreDepart varchar(40))
begin
	declare duplicado boolean default 0;
    declare localidad varchar(40);
    declare nombre varchar(40);
    declare continue handler for not found set duplicado = 1;
	update depart set dnombre = nombreDepart where dept_no = numDept;
    if duplicado = 1 then
		select concat('No existe ningun departamento con el numero: ', numDept) Mensaje;
    else
		select concat('El nombre del departamento es ', nombre, ' y su localidad es ',localidad) Mensaje;
	end if;
end //

call cambiarNombreDepart(50);

/* 3 */
/* 4 */
/* 5 */
/* 6 */
/* 7 */
/* 8 */