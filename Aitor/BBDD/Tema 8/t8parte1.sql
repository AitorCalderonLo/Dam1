/* A */
select oficio, count(emp_no) NumEmpleados,sum(salario) SumSalarial, sum(comision) TotalComision, max(salario) SalarioMax, min(salario) SalarioMin
from emple
group by oficio
having count(emp_no)>2
order by 3 desc;

/* B */
select dept_no,count(emp_no) CantEmple, round(avg(salario),2) MediaSal
from emple
where oficio!="analista"
group by oficio
having avg(salario)>1200
order by 2;

/* C */
select dept_no, oficio, count(emp_no) CantEmpleados, min(salario) SalarioMin, max(salario) SalarioMaximo
from emple
group by oficio,dept_no
order by 1,2;

/* D */
select d.dept_no, dnombre, avg(salario) "Salario medio", min(salario) SalarioMin, max(salario) SalarioMaximo
from emple e natural join depart d
group by d.dept_no
having avg(salario)>1400; 

/* E */
select e.apellido,e.salario,e.comision,j.apellido "Apellido Jefe", j.salario "Salario jefe", round(j.salario/e.salario,2) "Factor multiplicador"
from emple e, emple j, depart d
where e.dir = j.emp_no
and d.dept_no = e.dept_no
and dnombre="ventas";

/* F */
select count(emp_no) "Cantidad de vendedores"
from emple e natural join depart d
where dnombre="ventas"
and oficio="vendedor";

/* A */
select nomcen, dircen, max(preanu) "Presupuesto maximo", min(preanu) "Presupuesto minimo", count(coddep) "Cantidad de departamentos"
from departamento d join centro c on d.CodCen = c.CodCen
group by c.codcen;

/* B */
select codhab,deshab,count(codemp) "Poseedores de habilidad" ,round(avg(nivhab),1) "Media nivel"
from habemp hb join habilidad h using (codhab)
group by h.codhab;

/* A */
select c.nombre
from comunidades c join provincias p using (id_comunidad)
group by p.id_comunidad
having count(n_provincia)=1;

/* B */
select p.nombre, p.superficie, sum(l.poblacion) "Poblacion", round(sum(l.poblacion)/p.superficie,2) "Densidad de poblacion" 
from provincias p  join localidades l on p.n_provincia = l.n_provincia
group by p.nombre,p.superficie
order by 4;
