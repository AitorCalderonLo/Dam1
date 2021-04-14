/* A */
select codemp, nomemp, salemp , nomdep
from departamento d join empleado e on d.CodDep=e.CodDep;

/* B */
select d.coddep, nomdep, nomemp
from departamento d join empleado e on d.CodEmpDir=e.CodEmp;

/* C */
select nomemp, hb.codhab, deshab, nivhab
from empleado e join habemp hb on e.CodEmp=hb.CodEmp join habilidad h on h.CodHab = hb.CodHab;

/* D */
select nomemp, salemp, round(salemp*100/preanu,2) 'Porcentaje_salario_presupuesto'
from departamento d join empleado e on e.CodDep = d.CodDep
where salemp > 30000;

/* E */
select nomemp,ExTelEmp,FecNaEmp,NomDep,NomCen
from empleado e join departamento d on e.CodDep = d.CodDep 
	join centro c on c.CodCen = d.CodCen
where FecNaEmp > '1969/12/31'
order by FecNaEmp desc;

/* F */
select NomEmp,SalEmp
from empleado e join hijo h on h.CodEmp = e.CodEmp
where FecNaHi > '1990/12/31';

/* G */
select NomCen,DirCen,NomEmp,ExTelEmp,SalEmp
from centro c join empleado e on c.CodEmpDir = e.CodEmp
order by nomcen;

/* H */
select NomDep,PreAnu,NomCen,DirCen,NomEmp
from departamento d join centro c on d.CodCen = c.CodCen 
	join empleado e on d.CodEmpDir = e.CodEmp
where CodDepDep is null;
