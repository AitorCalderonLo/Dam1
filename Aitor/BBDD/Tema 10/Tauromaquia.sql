create database tauromaquia collate utf8mb4_spanish_ci;

use tauromaquia;

create table toreros(
id_torero int auto_increment primary key,
nombre varchar(30) unique not null);

insert into toreros values (1,'Currito de sotomonte');
insert into toreros values (2,'Jacintín de la Peña');
insert into toreros values (3,'El chulapón');
insert into toreros values (4,'Bilbilitano');
insert into toreros values (5,'Arletano');
insert into toreros values (6,'Viriato de las Torres');
insert into toreros values (7,'Jesusito de mi vida');
insert into toreros values (8,'Carlitos de La Puebla');
insert into toreros values (9,'El gorrión');
insert into toreros values (10,'El niño de los clavos');
insert into toreros values (11,'Vicentito del Otero');
insert into toreros values (12,'Jaimito');
insert into toreros values (13,'Julianillo');
insert into toreros values (14,'El chulo');
insert into toreros values (15,'Pistoletita');
insert into toreros values (16,'Marianillo el fraile');


create table plazas(
id_plaza int auto_increment primary key,
nombre varchar(30) not null,
aforo int,
localidad varchar(30) not null);

insert into plazas values(1,'Las Ventas',17000,'Madrid');
insert into plazas values(2,'La Maestranza',15000,'Sevilla');
insert into plazas values(3,'Palencia',5000,'Palencia');
insert into plazas values (4,'La Monumental',18000,'Barcelona');
insert into plazas values(5,'Valladolid',8000,'Valladolid');
insert into plazas values(6,'México',23000,'México');


create table corridas(
id_corrida int auto_increment primary key,
fecha_corrida date not null,
espectadores int,
televisada enum ('0','1') default '0',
id_plaza int, 
index (id_plaza),
foreign key (id_plaza) references plazas(id_plaza) on delete cascade);

insert into corridas values (1,'2017/05/12',8340,'0',1);
insert into corridas values (2,'2017/05/12',9320,'1',2);
insert into corridas values (3,'2017/04/16',15000,'0',2);
insert into corridas values (4,'2017/04/17',8900,'1',2);
insert into corridas values (5,'2017/05/13',17000,'1',1);
insert into corridas values (6,'2017/05/14',11587,'0',1);
insert into corridas values (7,'2017/05/15',17000,'1',1);
insert into corridas values (8,'2017/09/01',null,'0',3);
insert into corridas values (9,'2017/09/02',null,'1',3);
insert into corridas values (10,'2017/09/03',null,'0',3);
insert into corridas values (11,'2017/06/04',14550,'1',4);
insert into corridas values (12,'2017/06/05',18000,'1',4);
insert into corridas values (13,'2017/06/06',16230,'0',4);
insert into corridas values (14,'2017/09/06',null,'0',5);
insert into corridas values (15,'2017/09/07',null,'1',5);
insert into corridas values (16,'2017/09/08',null,'0',5);

create table toros(
id_toro int auto_increment primary key,
nombre varchar(30) unique not null,
kilos int not null,
orejas enum('0','1','2') default '0',
rabos enum('0','1') default '0',
id_torero int,
foreign key (id_torero) references toreros(id_torero) on delete cascade,
id_corrida int,
foreign key(id_corrida) references corridas(id_corrida) on delete cascade);

insert into toros values (1,'Resalao',450,'0','0',2,1);
insert into toros values (2,'Gracioso',543,'2','0',3,1);
insert into toros values (3,'Machacahombres',432,'0','0',1,1);
insert into toros values (4,'Destrozador',431,'0','0',2,1);
insert into toros values (5,'Pensador',423,'1','0',3,1);
insert into toros values (6,'Cabraloca',497,'1','0',1,1);
insert into toros values (7,'Cariñoso',521,'1','0',1,2);
insert into toros values (8,'Tiñoso',500,'1','0',2,2);
insert into toros values (9,'Acelerado',420,'0','0',3,2);
insert into toros values (10,'Brusco',456,'2','0',1,2);
insert into toros values (11,'Blanquito',576,'2','1',2,2);
insert into toros values (12,'Licito',489,'1','0',3,2);
insert into toros values (14,'Juliano',476,'2','0',9,3);
insert into toros values (15,'Trastocado',532,'2','0',9,3);
insert into toros values (16,'Feliz',521,'0','0',2,3);
insert into toros values (17,'Gélido',501,'1','0',2,3);
insert into toros values (18,'Burgués',567,'2','0',5,3);
insert into toros values (19,'Burlado',532,'2','1',5,3);
insert into toros values (20,'Guiñapo',500,'1','0',9,4);
insert into toros values (21,'Muñeco',587,'2','1',9,4);
insert into toros values (22,'Humoso',621,'0','0',2,4);
insert into toros values (23,'Herrador',531,'0','0',2,4);
insert into toros values (24,'Palomo',487,'1','0',4,4);
insert into toros values (25,'Pablito',542,'0','0',4,4);
insert into toros values (26,'Pocoguapo',531,'2','0',7,5);
insert into toros values (27,'Muchacaspa',465,'1','0',7,5);
insert into toros values (28,'Greco',521,'2','0',2,5);
insert into toros values (29,'Sequito',465,'2','0',2,5);
insert into toros values (30,'Monteño',531,'2','1',5,5);
insert into toros values (31,'Marqués',521,'2','1',5,5);
insert into toros values (32,'Malabestia',602,'0','0',null,null);
insert into toros values (35,'Ojochinche',478,'1','0',10,6);
insert into toros values (36,'Guapetón',503,'0','0',13,6);
insert into toros values (37,'Herrerillo',493,'1','0',15,6);
insert into toros values (38,'Jamacuco',523,'2','0',10,6);
insert into toros values (39,'Sacamantecas',518,'0','0',13,6);
insert into toros values (40,'Petronilo',480,'1','0',15,6);
insert into toros values (41,'Bestia parda',560,'2','1',12,7);
insert into toros values (42,'Morrines',478,'1','0',6,7);
insert into toros values (43,'Casero',467,'0','0',9,7);
insert into toros values (44,'Marroncete',453,'1','0',12,7);
insert into toros values (45,'Corniluengo',487,'0','0',6,7);
insert into toros values (46,'Nuncio',503,'1','0',9,7);
insert into toros values (47,'Machito',503,'2','0',2,11);
insert into toros values (48,'Belloso',500,'1','0',4,11);
insert into toros values (49,'Paquito',478,'0','0',3,11);
insert into toros values (50,'Condenao',518,'1','0',2,11);
insert into toros values (51,'Malagueño',489,'0','0',4,11);
insert into toros values (52,'Azar',511,'1','0',3,11);
insert into toros values (53,'Rodríguez',487,'0','0',1,12);
insert into toros values (54,'Malojo',512,'2','1',5,12);
insert into toros values (55,'Navarrico',491,'1','0',8,12);
insert into toros values (56,'Ramblao',511,'0','0',1,12);
insert into toros values (57,'Casposo',523,'2','1',5,12);
insert into toros values (58,'Machista',487,'1','0',8,12);
insert into toros values (59,'Pesado',547,'2','1',12,13);
insert into toros values (60,'Constriñido',432,'0','0',14,13);
insert into toros values (61,'Ñu',501,'1','0',15,13);
insert into toros values (62,'Alcaldillo',511,'2','0',12,13);
insert into toros values (63,'Lenguadín',511,'0','0',14,13);
insert into toros values (64,'Orejuelo',467,'2','0',15,13);
