/**** 1 ****/

/* A */
select dnombre, loc, count(emp_no) "NEmpleados", round(avg(salario),2) "SalMedio"
from depart d join emple e on e.dept_no = d.dept_no
group by dnombre;

/* B */
select dnombre, oficio, round(avg(salario),2) "SalMedio", round(avg(comision),2) "ComisionMedia"
from depart d join emple e on e.dept_no = d.dept_no
group by e.dept_no, oficio;

/* C */


/* D */
/* E */
/* F */
/* G */

/**** 2 ****/

/* A */
/* B */
/* C */
/* D */
/* E */
/* F */
/* G */
/* H */
/* I */
/* J */
/* K */
/* L */
/* M */
/* N */
/* Ñ */