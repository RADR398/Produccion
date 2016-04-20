use mysql;

drop database Inventario;

create database Inventario;

use Inventario;

create table Jornada
(
IdJornada int not null auto_increment,
Año int not null,
primary key(IdJornada)
);

create table Producto
(
IdProducto int not null auto_increment,
Codigo varchar(5) not null,
Nombre varchar(30),
Descripcion varchar(100),
primary key(IdProducto)
);

create table Mes(
IdMes int not null auto_increment,
Nombre varchar(10),
primary key(IdMes)
);

create table DatosGenerales(
IdDatosGenerales int not null auto_increment,
IdProducto int not null,
IdJornada int not null,
CostoContratacion float,
CostoDespido float,
CostoSubcontratacion float,
StockSeguridad float,
InversionInicial float,
NumeroTrabajadores float,
CostoHoraNormal float,
CostoHoraExtra float,
HorasRequeridas float,
Materiales float,
Costo_Mantenimiento float,
primary key(IdDatosGenerales),
foreign key(IdJornada) references Jornada(IdJornada),
foreign key(IdProducto) references Producto(IdProducto)
);

create table DatosMes
(
IdDatosMes int not null auto_increment,
IdMes int not null,
IdDatos int not null,
Demanda int not null,
DiasHabiles int not null,
primary key(IdDatosMes),
foreign key(IdMes) references Mes(IdMes),
foreign key(IdDatos) references DatosGenerales(IdDatosGenerales)
);

