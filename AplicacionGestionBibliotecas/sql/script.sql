-- Creación de la base de datos
CREATE DATABASE bd_biblioteca;

-- Activación de base de datos
USE bd_biblioteca;

-- Creación de las tablas
CREATE TABLE t_administradores (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nombreCompleto VARCHAR(255),
	cedula VARCHAR(255),
	correoElectronico VARCHAR(255)
);

CREATE TABLE t_clientes (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nombreCompleto VARCHAR(255),
	cedula VARCHAR(255),
	correoElectronico VARCHAR(255)
);

CREATE TABLE t_libros (
	id INT PRIMARY KEY AUTO_INCREMENT,
	titulo VARCHAR(255),
	autor VARCHAR(255),
	cantidad INT
);