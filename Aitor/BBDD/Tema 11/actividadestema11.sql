/* 1 */
delimiter //
create procedure EliminarPedido(referenciaPedido char(5))
begin
	declare desci date;
	select fecped into desci from pedido where refped = referenciaPedido;
    select concat('Codigo de articulo ', referenciaPedido, ' y su fecha es ' , desci) 'Datos Pedido';
    delete from pedido where refped = referenciaPedido;
    select concat('Pedido ', referenciaPedido, ' eliminado');
end //

call EliminarPedido('P0004');

/* 2 */
delimiter //
create function NumPedidos(descripcion varchar(30))
returns int
reads sql data
begin
    return (select count(codart) from lineapedido where codart = 
    (select codart from articulo where desart = descripcion));
end //

select NumPedidos('Bolígrafo azul') "Cantidad";

/* 3 */
delimiter //
create function NumSubordinados(numEmple int)
returns int
reads sql data
begin
    return (select count(emp_no) from emple where dir = numEmple);
end //

select NumSubordinados(7839) "Cantidad Subordinados";

/* 4 */

delimiter //
create function SalarioJefe(input varchar(40))
returns double
reads sql data
begin
	declare numEmp int;
    declare cantidadSubordinados int;
    select emp_no into numEmp from emple where apellido = input;
    select NumSubordinados(7839) into cantidadSubordinados;
    if cantidadSubordinados = 0 then return -1;
    else return round((select salario from emple where apellido = input)/cantidadSubordinados, 2);
    end if;
end //

select SalarioJefe("negro") "Salario jefe";

/* 5 */
delimiter //
create procedure AnadirDepar(nombreDepartamento varchar(40), localidad varchar(40))
begin
	declare numeroDepartamento int;
    SELECT max(dept_no)+10 into numeroDepartamento FROM empresa_dam.depart;
    insert into depart values (numeroDepartamento, nombreDepartamento, localidad);
	select concat('Se ha creado un nuevo departamento con el nº ', numeroDepartamento) Mensaje;

end //

call AnadirDepar('Admin y finanzas', 'Arrigorriaga');

/* 6 */
delimiter //
create procedure ModificarSalario(numeroEmpleado int, porcentaje int)
begin
	declare salarioAntiguo int;
    declare salarioNuevo int;
    select salario into salarioAntiguo from emple where emp_no = numeroempleado;
    update emple set salario = salario + ((salario * porcentaje) / 100) where emp_no = numeroEmpleado;
	select salario into salarioNuevo from emple where emp_no = numeroempleado;
	select concat('Salario nuevo para el empleado ', numeroEmpleado, ' = ', salarioNuevo, '€, Salario antiguo', salarioAntiguo, '€' ) Mensaje;

end //



/* 7 */

delimiter //
create procedure asignarComision(numeroEmpleado int)
begin
	declare salarioEmpleado int;
    declare comision float;
    select salario into salarioEmpleado from emple where emp_no = numeroEmpleado;
	
    if salarioEmpleado<1000 then
		set comision = 5;
	elseif salarioEmpleado<2000 then
		set comision = 2.5;
	else 
		set comision = 0;
	end if;
    
    update emple set comision = salarioEmpleado * comision / 100 where emp_no = numeroEmpleado;
	select concat('comision nueva para el empleado ', numeroEmpleado, ' = ', comision, '%') Mensaje;

    
end //

call asignarComision(7499);

/* 8 */
delimiter //
create function PorcenSalarial(numeroEmpleado int)
returns double
reads sql data
begin
	declare salarioEmpleado double;
	declare salarioDepart double;
	select salario into salarioEmpleado from emple where emp_no = numeroEmpleado;
    select sum(salario) into salarioDepart from emple where dept_no = (select dept_no from emple where emp_no = numeroEmpleado);
    return round((salarioEmpleado/salarioDepart)*100,2) ;
end //

select PorcenSalarial(7839) "Porcentaje";

/* 9 */
delimiter //
create procedure ModificarSalariosDepar(numeroDepartamento int, porcentaje double)
begin
	declare cantidadTrabajadores int;
    select count(emp_no) into cantidadTrabajadores from emple where dept_no = numeroDepartamento;
    if cantidadTrabajadores>=1 then
    update emple set salario = salario + ((salario * porcentaje) / 100) where dept_no = numdep;
		select concat('Se ha modificado el salario de todos los empleados del dpto. nº ',numeroDepartamento, ' en un ', porcentaje ,'%') Mensaje;

    else
    	select concat('En el dpto. nº ',numeroDepartamento, ' no trabaja ningún empleado') Mensaje;    
    end if;
    

    
end //

call ModificarSalariosDepar(10,-10);

/* 10 */
delimiter //
create procedure MostrarComunidad(nombreComunidadAut varchar(30))
begin
	declare numeroProvincias int;
	declare numeroLocalidades int;
    
    if (select id_comunidad from comunidades where nombre = nombreComunidadAut) is not null then
    
    select count(n_provincia) into numeroProvincias from provincias where id_comunidad = 
	(select id_comunidad from comunidades where nombre = nombreComunidadAut);
    
    select count(id_localidad) into numeroLocalidades from localidades where n_provincia in 
    (select n_provincia from provincias where id_comunidad = 
    (select id_comunidad from comunidades where nombre = nombreComunidadAut) );
    
	select concat('La comunidad autonoma ',nombreComunidadAut, ' tiene ',numeroProvincias ,' provincias cuales tienen ',numeroLocalidades ,' Localidades' ) Mensaje;    

    else
    	select concat('La comunidad autonoma no existe') Mensaje;    
    end if;
   
end //

call MostrarComunidad('a');

/* 11 */

delimiter //
create function ProvinciaMayor(nombreComunidadAut varchar(30))
returns varchar(30)
reads sql data
begin
	
    return (select nombre from provincias where superficie = 
    (select max(superficie) from provincias where id_comunidad = 
    (select id_comunidad from comunidades where nombre = nombreComunidadAut )));
    
end //

select ProvinciaMayor('pais vasco') "Provincia con mayor superficie";