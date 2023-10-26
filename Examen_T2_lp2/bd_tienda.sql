-- Crear la base de datos si no existe
CREATE DATABASE IF NOT EXISTS bd_tienda;

-- Seleccionar la base de datos
USE bd_tienda;

-- Crear la tabla de categorías
CREATE TABLE IF NOT EXISTS categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

-- Insertar algunas categorías de ejemplo
INSERT INTO categorias (nombre) VALUES
    ('Electrónicos'),
    ('Ropa'),
    ('Libros'),
    ('Hogar');

-- Crear la tabla de productos con referencia a categorías
CREATE TABLE IF NOT EXISTS productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255),
    precio DOUBLE NOT NULL,
    cantidad INT NOT NULL,
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES categorias(id)
);

-- Insertar algunos productos de ejemplo
INSERT INTO productos (nombre, descripcion, precio, cantidad, categoria_id) VALUES
    ('Smartphone Galaxy S20', 'Teléfono inteligente de última generación con cámara avanzada', 799.99, 50, 1),
    ('Camiseta Casual', 'Camiseta cómoda y elegante', 19.99, 100, 2),
    ('Libro "La Sombra del Viento"', 'Novela emocionante de Carlos Ruiz Zafón', 24.99, 30, 3),
    ('Juego de Sartenes Antiadherentes', 'Set de sartenes de cocina de alta calidad', 49.99, 20, 4),
    ('Zapatos Deportivos', 'Zapatos cómodos para actividades deportivas', 59.99, 40, 2);
    
CREATE TABLE compras(
	id int auto_increment primary key,
    cantidad int,
    fecha Date,
    total decimal(1,8),
    producto_id int,
    foreign key (producto_id) references productos(id)
);
