// index.js – Tu primer servidor Express

// 1. Importar Express
const express = require("express");

// 2. Crear una aplicación Express
const app = express();


// 3. Defenir el puerto
const PORT = 3000;


// 4. Definir una ruta GET en '/'
app.get("/", (req, res) => {
  res.send("¡Hola, mundo desde Express!");
});


// 5. Iniciar el servidor
app.listen(PORT, () => {
  console.log(`Servidor corriendo en http://localhost:${PORT}`);
});

// Ruta principal
app.get('/', (req, res) => {
res.send('¡Bienvenido a mi servidor!');
});

// Ruta /acerca
app.get('/acerca', (req, res) => {
res.send('Soy un servidor creado con Express.');
});

// Ruta con parámetro dinámico
app.get('/usuario/:nombre', (req, res) => {
const nombre = req.params.nombre;
res.send(`Hola, ${nombre}!`);
});
