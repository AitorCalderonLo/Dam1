use empresa_dam;
/* * * 1 * * */
/* A */
create or replace view VistaEmpleDep (apellido, salario, antiguedad, departamento)
as select apellido, salario,timestampdiff(year, fecha_alt, current_date) ,dnombre
from depart d join emple e on d.dept_no = e.dept_no;

/* B */
select departamento, count(apellido) "Numero de empleados" from VistaEmpleDep
group by departamento;

/* C */
update VistaEmpleDep set
antiguedad = 6
where apellido = 'Gil';

/* NO SE PUEDE XQ ANTIGUEDAD NO ES UPDATEABLE YA QUE ES UN CAMPO CALCULADO */

/* D */
update VistaEmpleDep set
apellido = 'GilA'
where apellido = 'Gil';

/* SE PUEDE XQ NO ES UN CAMPO CALCULADO */

/* * * 2 * * */
/* A */
create or replace view VistaEmple (numero, apellido, fecha_alta, dept_no) as
select emp_no, apellido, fecha_alt, dept_no from emple
where year(fecha_alt) = 2014;

select * from vistaemple;

/* B */
insert into vistaemple values (7777, 'Garcia', '2019/12/31', 10);

/* NO SE PUEDE POR QUE LA VISTA NO TIENE EL CAMPO OFICIO NI SALARIO QUE SON OBLIGATORIOS */

/* C */
update vistaemple
set dept_no = 20
where apellido = 'Tovar';

/* SE PUEDE CAMBIAR YA QUE NO ES UN CAMPO CALCULADO */

/* D */
delete from vistaemple
where apellido = 'Tovar';

/* * * 3 * * */
/* A */
use pedidos_dam;
create user adminpedidos_dam identified by '1234';
grant all on pedidos_dam.* to adminpedidos_dam with grant option;

/* B */
create user consulpedidos_dam identified by '1234';
grant select, create, drop, alter, create view, index on pedidos_dam.* to consulpedidos_dam;
show grants for consulpedidos_dam;
select * from pedido;
insert into pedido values ('P0009', current_date);

/* C */
create user procpedidos@localhost identified by '1234' with max_queries_per_hour 30 max_user_connections 4;
grant create routine, alter routine on pedidos_dam.* to procpedidos@localhost;
select * from mysql.user;
select * from mysql.db;

/* D */
create user modifpedidos_dam identified by '1234';
grant select, insert, drop, update(desart,pvpart), references (codart) on pedidos_dam.articulo to modifpedidos_dam;
select * from mysql.tables_priv;
select * from mysql.columns_priv;
insert into articulo values ("A999", "Goma de no borrar", 1.05);
update articulo set pvpart = 11.11
where codart = "A999";
update articulo set codart = "A991"
where codart = "A999";

/* E */
REVOKE create routine, alter routine on pedidos_dam.* from procpedidos@localhost;
drop user procpedidos@localhost;

/* * * 4 * * */
/* A */
create role RolRRHH;
grant create, alter, drop on  empresa_dam.* to RolRRHH;
grant update(oficio,dir,salario,comision,dept_no) on empresa_dam.emple to RolRRHH;
grant select, insert on empresa_dam.emple to RolRRHH;
grant select on empresa_dam.depart to RolRRHH;



/* B */
create user rrhh1 identified by '1234' default role RolRRHH password expire interval 30 day;
create user rrhh2 identified by '1234' default role RolRRHH password expire interval 30 day;
create user rrhh3 identified by '1234' default role RolRRHH password expire interval 30 day;
create user rrhh4 identified by '1234' default role RolRRHH password expire interval 30 day;

/* C */
use empresa_dam;

select * from depart;

update emple
set salario = salario + 100
where emp_no = 7369;

insert into depart values (50, 'Desarrollo', 'Bilbao');

show grants for rrhh2;

use mysql;
show tables;


