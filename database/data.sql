USE t_raza;
-- USUARIOS
INSERT INTO usuarios (nombre, email, password, rol) VALUES
('Carlos Garcia', 'carlos@gmail.com', 'hash_prueba_001', 'DUEÑO'),
('Laura Martinez', 'laura@gmail.com', 'hash_prueba_002', 'USUARIO'),
('Miguel Sanchez', 'miguel@gmail.com', 'hash_prueba_003', 'ADMIN'),
('Ana Lopez', 'ana@gmail.com', 'hash_prueba_004', 'USUARIO');


-- ESTABLECIMIENTOS
INSERT INTO establecimientos (nombre, direccion, telefono) VALUES
('Bar La Esquina', 'Calle Sierpes 12, Sevilla', '954123456'),
('Restaurante El Patio', 'Avenida de la Constitucion 25, Sevilla', '954654321'),
('Cafeteria Central', 'Calle Feria 40, Sevilla', '954987654');

-- USUARIO_ESTABLECIMIENTO
INSERT INTO usuario_establecimiento
(id_usuario, id_establecimiento) VALUES
(1, 1),
(1, 2),
(2, 1),
(3, 3);

-- CATEGORIAS

INSERT INTO categorias
(id_establecimiento, nombre, descripcion) VALUES
(1, 'Entrantes', 'Platos para comenzar'),
(1, 'Bebidas', 'Bebidas frias y calientes'),
(2, 'Carnes', 'Platos elaborados con carne'),
(2, 'Postres', 'Postres caseros'),
(3, 'Desayunos', 'Productos para desayunar');

-- PRODUCTOS

INSERT INTO productos
(id_categoria, nombre, precio, disponible) VALUES
(1, 'Patatas bravas', 6.50, TRUE),
(1, 'Croquetas caseras', 8.00, TRUE),
(2, 'Coca-Cola', 2.50, TRUE),
(3, 'Solomillo iberico', 18.90, TRUE),
(4, 'Tarta de queso', 5.50, TRUE),
(5, 'Tostada con aceite', 3.00, FALSE);

