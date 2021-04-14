/* Adicionales tema 2*/
/* 1 */
insert into habilidad
values ('OFIMA', 'Ofimática');

insert into habemp
values ('OFIMA', 1 , 5);

insert into habemp
values ('OFIMA', 2 , 8);

/* 2 */
update empleado 
set salemp = salemp + (salemp*5/100)
where coddep in (select coddep from departamento where nomdep like '%zona sur%');

/* 3 */
update departamento
set codcen = (select codcen from centro where pobcen = 'murcia')
where codcen is null;


/* 5 */
update empleado
set coddep = (select coddep from departamento where nomdep = 'Producción Zona Sur')
where coddep = (select coddep from departamento where nomdep = 'Ventas Zona Sur');

/* 6 */
update habemp 
set nivhab = nivhab + 1 
where codhab = (select codhab from habilidad where deshab = 'marketing')
and codemp in (select codemp from empleado where coddep = 'prozs');

select * from habemp;
select * from habilidad;
select * from departamento;


/* 7 */
delete from habemp
where codhab = (select codhab from habilidad where deshab = 'Ofimática');

update habilidad
set deshab = 'Oficina informática'
where deshab = 'Ofimática';


/* 8 */
update centro
set codempdir = (select codemp from empleado where codemp = (select codempdir from departamento where nomdep = 'produccion zona sur'))
where nomcen = 'oficinas zona sur';

select * from centro;
/* 9 */
update empleado
set numhi = numhi+1
where codemp = 5;

insert into hijo
values (5, 2, '2016-02-13', 'Pastora Alada, Valentina');

/* 10 */
update departamento
set codempdir = 4, tidir = 'F'
where codempdir = (select codemp from empleado where nomemp = 'Alada veraz, juana');


/* 11 */
update departamento
set preanu = preanu - 50000
where codcen = (select codcen from centro where nomcen = 'Fábrica Zona Sur');

/* 12 */
update centro 
set dircen = 'C/Mayor, 45', pobcen = 'Elche'
where nomcen = 'fabrica zona sur';


/* 13 */
insert into departamento
select 'COMZS', codempdir, coddepdep, codcen,  'Compras Zona Sur', (select preanu*75/100 from departamento where nomdep = 'Ventas Zona Sur'),tidir
from departamento
where nomdep = 'Ventas Zona Sur';

SELECT * FROM centro;

/* 14 */
insert into centro
select 'OFZN', codempdir , 'Oficinas Zona Norte', 'Gran Via 38', 'Bilbao'
from centro where nomcen = 'Direccion General';

