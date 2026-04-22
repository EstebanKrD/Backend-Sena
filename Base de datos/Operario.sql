USE backend;

CREATE TABLE persona (
    documento VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    edad INT NOT NULL,
    sueldo DOUBLE NOT NULL,
    antiguedad INT NOT NULL,
    sueldo_nuevo DOUBLE,
    aumento DOUBLE
);


SELECT * FROM persona;