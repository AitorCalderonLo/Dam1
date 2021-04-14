/* A */
select d.dept_no
from depart d natural join emple e
group by d.dept_no
having avg(salario) >= (select avg(salario) from emple);

/* B */
select apellido, oficio 
from depart d natural join emple e
where dnombre in (select dnombre from depart d natural join emple e where oficio='analista');

/* C */
select apellido,oficio,salario,fecha_alt
from emple
where oficio = (select oficio from emple where apellido = 'jimenez')
or salario >= (select oficio from emple where apellido = 'arroyo');

/* D */
select apellido,oficio 
from emple
where oficio = (select oficio from emple where apellido = 'jimenez')
and apellido != 'jimenez';

/* E */
select dnombre 
from depart d natural join emple e
group by dnombre
having count(dnombre)>2;

select dnombre 
from depart
where dept_no in (select dept_no 
from emple 
group by dept_no
having count(dept_no)>2);

/* F */

/* G */

/* H */
select emp_no, apellido, salario, dnombre
from depart d natural join emple e
where salario = (select max(salario) from emple)
group by d.dept_no;



