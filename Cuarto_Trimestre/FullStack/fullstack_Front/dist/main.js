"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
const URL_BASE = "http://localhost:8080/productos";
let idEditando = null;
const codigo = document.getElementById("codigo");
const nombre = document.getElementById("nombre");
const descripcion = document.getElementById("descripcion");
const precio = document.getElementById("precio");
const cantidad = document.getElementById("cantidad");
const estado = document.getElementById("estado");
const btnGuardar = document.getElementById("btnGuardar");
const btnCancelar = document.getElementById("btnCancelar");
function obtenerProductos() {
    return __awaiter(this, void 0, void 0, function* () {
        const respuesta = yield fetch(URL_BASE);
        const productos = yield respuesta.json();
        mostrarProductos(productos);
    });
}
function mostrarProductos(productos) {
    const cuerpoTabla = document.getElementById("cuerpoTabla");
    cuerpoTabla.innerHTML = "";
    productos.forEach((producto) => {
        cuerpoTabla.innerHTML += `
      <tr>
        <td>${producto.id}</td>
        <td>${producto.codigo}</td>
        <td>${producto.nombre}</td>
        <td>${producto.descripcion}</td>
        <td>${producto.precio}</td>
        <td>${producto.cantidad}</td>
        <td>${producto.estado}</td>

        <td>

          <button onclick="editarProducto(${producto.id})">
            Editar
          </button>

          <button onclick="eliminarProducto(${producto.id})">
            Eliminar
          </button>

          <button onclick="mostrarProducto(${producto.id})">
            Mostrar
          </button>

        </td>
      </tr>
    `;
    });
}
btnGuardar.addEventListener("click", guardarProducto);
btnCancelar.addEventListener("click", cancelarEdicion);
function guardarProducto() {
    return __awaiter(this, void 0, void 0, function* () {
        codigo.classList.remove("error");
        const producto = {
            codigo: codigo.value,
            nombre: nombre.value,
            descripcion: descripcion.value,
            precio: Number(precio.value),
            cantidad: Number(cantidad.value),
            estado: estado.value,
        };
        let respuesta;
        if (idEditando !== null) {
            respuesta = yield fetch(`${URL_BASE}/${idEditando}`, {
                method: "PUT",
                headers: {
                    "Content-Type": "application/json",
                },
                body: JSON.stringify(producto),
            });
        }
        else {
            respuesta = yield fetch(URL_BASE, {
                method: "POST",
                headers: {
                    "Content-Type": "application/json",
                },
                body: JSON.stringify(producto),
            });
        }
        if (!respuesta.ok) {
            codigo.classList.add("error");
            return;
        }
        limpiarFormulario();
        idEditando = null;
        obtenerProductos();
    });
}
function editarProducto(id) {
    return __awaiter(this, void 0, void 0, function* () {
        const respuesta = yield fetch(`${URL_BASE}/${id}`);
        const producto = yield respuesta.json();
        codigo.value = producto.codigo;
        nombre.value = producto.nombre;
        descripcion.value = producto.descripcion;
        precio.value = producto.precio.toString();
        cantidad.value = producto.cantidad.toString();
        estado.value = producto.estado || "Activo";
        idEditando = id;
    });
}
function mostrarProducto(id) {
    return __awaiter(this, void 0, void 0, function* () {
        const respuesta = yield fetch(`${URL_BASE}/${id}`);
        const producto = yield respuesta.json();
        alert(`ID: ${producto.id}
Código: ${producto.codigo}
Nombre: ${producto.nombre}
Descripción: ${producto.descripcion}
Precio: ${producto.precio}
Cantidad: ${producto.cantidad}
Estado: ${producto.estado}`);
    });
}
function eliminarProducto(id) {
    return __awaiter(this, void 0, void 0, function* () {
        yield fetch(`${URL_BASE}/${id}`, {
            method: "DELETE",
        });
        obtenerProductos();
    });
}
function cancelarEdicion() {
    idEditando = null;
    limpiarFormulario();
}
function limpiarFormulario() {
    codigo.value = "";
    nombre.value = "";
    descripcion.value = "";
    precio.value = "";
    cantidad.value = "";
    estado.value = "Activo";
}
window.editarProducto = editarProducto;
window.eliminarProducto = eliminarProducto;
window.mostrarProducto = mostrarProducto;
obtenerProductos();
