
## Requerimientos


[JDK 8][1], [Maven][2], [mysql  Ver 15.1 Distrib 10.1.29-MariaDB][4], [Wildfly 13][5]

## mysql

crear esquema de la base de datos llamado Intraway

crear tabla donde persistir datos:

CREATE TABLE infoIntraway
(
infoIntraway_id int,
code varchar(5000),
description varchar(5000),
list varchar(5000)
);


## SpringBoot Project

## Configuracion JPA

en el archivo persistence.xml configurar datos de conexion a la base de Intraway


