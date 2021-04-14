create database Alumnado collate utf8mb4_spanish_ci;

use alumnado;

Create TABLE ALUMNOS
(
 DNI CHAR(9) PRIMARY KEY,
 NOMBRE VARCHAR(40) NOT NULL,
 EDAD INT NOT NULL,
 LOCALIDAD VARCHAR(20) NOT NULL
);

Create TABLE ANTIGUOS
(
 DNI CHAR(9) PRIMARY KEY,
 NOMBRE VARCHAR(40) NOT NULL,
 EDAD INT NOT NULL,
 LOCALIDAD VARCHAR(20) NOT NULL
);

Create TABLE NUEVOS
(
 DNI CHAR(9) PRIMARY KEY,
 NOMBRE VARCHAR(40) NOT NULL,
 EDAD INT NOT NULL,
 LOCALIDAD VARCHAR(20) NOT NULL
);

INSERT INTO ALUMNOS VALUES('12345678A','JUAN MAG�N',18,'COSLADA');
INSERT INTO ALUMNOS VALUES('09090909Q','PEDRO S�NCHEZ',19,'COSLADA');
INSERT INTO ALUMNOS VALUES('12145178Z','ANA BLANCO',17,'ALCALA');
INSERT INTO ALUMNOS VALUES('00121212W','LUISA RUDI',18,'TORREJON');
INSERT INTO ALUMNOS VALUES('76754444Q','MAR�A BLANCO',20,'MADRID');
INSERT INTO ALUMNOS VALUES('55443322I','ERNESTO ALTERIO',21,'MADRID');
INSERT INTO ALUMNOS VALUES('56831890Y','RAQUEL DEL ROSARIO',19,'TOLEDO');
INSERT INTO ANTIGUOS VALUES('76754444Q','MAR�A BLANCO',20,'MADRID');
INSERT INTO ANTIGUOS VALUES('55443322I','ERNESTO ALTERIO',21,'MADRID');
INSERT INTO ANTIGUOS VALUES('11111111U','ANDR�S CALAMARO',26,'LAS ROZAS');
INSERT INTO ANTIGUOS VALUES('43439832X','IRENE AND�JAR',24,'LAS ROZAS');
INSERT INTO NUEVOS VALUES('12345678A','JUAN MAG�N',18,'COSLADA');
INSERT INTO NUEVOS VALUES('56394736O','MAITE BLASCO',15,'ALCALA');
INSERT INTO NUEVOS VALUES('10508090T','SOFIA LAPLANA',14,'ALCALA');
INSERT INTO NUEVOS VALUES('12145178Z','ANA BLANCO',17,'ALCALA');
INSERT INTO NUEVOS VALUES('55443322I','ERNESTO ALTERIO',21,'MADRID');

