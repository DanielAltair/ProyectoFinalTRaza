CREATE DATABASE IF NOT EXISTS t_raza;

USE t_raza;


-- TABLA: USUARIOS


CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    rol VARCHAR(30) NOT NULL
);


-- TABLA: ESTABLECIMIENTOS


CREATE TABLE establecimientos (
    id_establecimiento INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(150) NOT NULL,
    direccion VARCHAR(255) NOT NULL,
    telefono VARCHAR(20)
);


-- TABLA: USUARIO_ESTABLECIMIENTO


CREATE TABLE usuario_establecimiento (
    id_usuario INT NOT NULL,
    id_establecimiento INT NOT NULL,

    PRIMARY KEY (id_usuario, id_establecimiento),

    CONSTRAINT fk_usuario_establecimiento_usuario
        FOREIGN KEY (id_usuario)
        REFERENCES usuarios(id_usuario),

    CONSTRAINT fk_usuario_establecimiento_establecimiento
        FOREIGN KEY (id_establecimiento)
        REFERENCES establecimientos(id_establecimiento)
);


-- TABLA: CATEGORIAS



CREATE TABLE categorias (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    id_establecimiento INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255),
CONSTRAINT fk_categoria_establecimiento
        FOREIGN KEY (id_establecimiento)
        REFERENCES establecimientos(id_establecimiento)
);

-- TABLA: PRODUCTOS


CREATE TABLE productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    id_categoria INT NOT NULL,
    nombre VARCHAR(150) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    disponible BOOLEAN NOT NULL,
    CONSTRAINT fk_producto_categoria
        FOREIGN KEY (id_categoria)
        REFERENCES categorias(id_categoria)
);

