/* 1 */

/* A */
create table depart2 as select * from depart;
create table emple2 as select * from emple;

/* B */
insert into depart2
values (50, "RRHH", "Burgos");

/* C */
insert into emple2 
values (4488,"Gómez","director",null,"2014/02/23",1800,0,20);

select * from emple2;

/* D */
update emple2
set comision = comision/2
where comision > 0;

/* E */
update emple2
set dept_no = 10
where oficio = 'DIRECTOR';

/* F */
delete from emple2
where year(fecha_alt) = 2016;

/* G */
delete from depart2
where dept_no not in (select dept_no from emple2);

/* H */
update emple2
set comision = comision*2
where comision <300 and 
dept_no = (select dept_no from depart2 where dnombre = 'VENTAS');

/* I */
update depart2 
set loc = 'Málaga'
where dnombre = 'contabilidad';

/* J */
insert into emple2
select 4000, 'Baute', oficio, dir, current_date(), salario+(salario*15/100), comision, dept_no 
from emple2 where apellido = 'Aguirre';

/* K */
update emple2
set salario = salario+(salario*2.5/100),
comision = comision - (comision*1/100)
where dept_no = (select dept_no from depart where dnombre = 'Ventas');


/* 2 */

/* A */
create table EmpDep as
select CodEmp, NomEmp, SalEmp, NomDep from empleado
join departamento on empleado.CodDep = departamento.CodDep join centro on centro.CodCen = departamento.CodCen
where pobcen = 'Murcia';

alter table empdep add primary key(codemp);

/* B */
update empdep
set salemp = salemp + (salemp*8/100) 
where nomdep =  'Direccion general';

/* C */
insert into empdep
values (99,'María Pérez Ruiz', 15000, 'Ventas Zona Sur');

/* D */
delete from empdep
where salemp > 20000
and nomdep = (select nomdep from departamento where coddep = 'INYDI');

/* E */
update empdep
set salemp = (select max(salemp) from empleado where coddep = 'VENZS')
where nomdep = (select nomdep from departamento where coddep = 'DIRGE');



