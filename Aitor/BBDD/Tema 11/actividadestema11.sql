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

call ModificarSalario(7369, -10);

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