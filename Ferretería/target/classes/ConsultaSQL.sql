CREATE TABLE Cliente (
    dniCliente VARCHAR(50),
    contraseña VARCHAR(50),
    nombres VARCHAR(50),
    apellidos VARCHAR(50),
    telefono VARCHAR(50),
    PRIMARY KEY (dniCliente)
);

CREATE TABLE Categoría (
    idCategoria NUMERIC(4),
    nombreCategoria VARCHAR(50),
    urlimagen VARCHAR(200),
    PRIMARY KEY (idCategoria)
);

CREATE TABLE Producto (
    idProducto NUMERIC(4),
    nombre VARCHAR(50),
    descripcion VARCHAR(200),
    precio FLOAT,
    idCategoria NUMERIC(4),
    urlimagen VARCHAR(200),
    PRIMARY KEY (idProducto),
    FOREIGN KEY (idCategoria) REFERENCES Categoría(idCategoria)
);

CREATE TABLE Carrito (
    idCarrito NUMERIC(4),
    cantidad INT,
    subtotal INT,
    idProducto NUMERIC(4),
    PRIMARY KEY (idCarrito),
    FOREIGN KEY (idProducto) REFERENCES Producto(idProducto)
);

CREATE TABLE Pedido (
    idPedido NUMERIC(4),
    dniCliente VARCHAR(50),
    idCarrito NUMERIC(4),
    direccion VARCHAR(50),
    PRIMARY KEY (idPedido),
    FOREIGN KEY (dniCliente) REFERENCES Cliente(dniCliente),
    FOREIGN KEY (idCarrito) REFERENCES Carrito(idCarrito)
);

INSERT INTO Categoría (idCategoria, nombreCategoria, urlimagen) VALUES 
(1, 'Electricidad', 'url_imagen_electricidad'),
(2, 'Gasfiteria', 'url_imagen_gasfiteria'),
(3, 'Construccion', 'url_imagen_construccion');

INSERT INTO Producto (idProducto, nombre, descripcion, precio, idCategoria, urlimagen) VALUES 
(1, 'Cajas de derivación', 'Reune en su interior todas las conexiones de una casa', 30.50, 1, 'url_imagen_cajas_derivacion'),
(2, 'Tomacorriente', 'Establece una conexión eléctrica con la toma de corriente que se pueda manipular con seguridad', 5.00, 1, 'url_imagen_tomacorriente'),
(3, 'Cable eléctrico', 'Transmite la corriente eléctrica. Se vende por 100m', 144.80, 1, 'url_imagen_cable_electrico'),
(4, 'Terminales', 'Sirven para conectar sistemas eléctricos', 15.00, 1, 'url_imagen_terminales'),
(5, 'Tubos roscados', 'Tubos con extremos de rosca para poder conectarse', 30.00, 2, 'url_imagen_tubos_roscados'),
(6, 'Unión', 'Tubos rectos que unen tuberías', 10.00, 2, 'url_imagen_union_tubos'),
(7, 'Codo', 'Tubos de unión curveados 90°', 1.50, 2, 'url_imagen_codo_tubos'),
(8, 'Tee', 'Tubo de unión en forma de T', 3.10, 2, 'url_imagen_tee_tubos'),
(9, 'Teflón', 'Sirve para sellar y evitar escape de agua', 5.00, 2, 'url_imagen_teflon'),
(10, 'Cemento', 'Se endurece después de ponerse en contacto con el agua', 28.50, 3, 'url_imagen_cemento'),
(11, 'Barras de construcción', 'Refuerzan y dan soporte a las estructuras', 41.50, 3, 'url_imagen_barras_construccion'),
(12, 'Ladrillos', 'Sirven para levantar muros', 1.50, 3, 'url_imagen_ladrillos');

SELECT p.idProducto, p.nombre, p.descripcion, p.precio, p.idCategoria, p.urlimagen 
FROM producto p
INNER JOIN Categoría c ON (p.idCategoria = c.idCategoria)
WHERE c.idCategoria =1

SELECT idCategoria, nombreCategoria, urlimagen FROM Categoría
