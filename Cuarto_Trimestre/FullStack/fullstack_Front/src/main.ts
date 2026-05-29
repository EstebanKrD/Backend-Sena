interface Producto {
  id?: number;
  codigo: string;
  nombre: string;
  descripcion: string;
  precio: number;
  cantidad: number;
  estado?: string;
}

const URL_BASE = "http://localhost:8080/productos";

let idEditando: number | null = null;

const codigo = document.getElementById("codigo") as HTMLInputElement;
const nombre = document.getElementById("nombre") as HTMLInputElement;
const descripcion = document.getElementById("descripcion") as HTMLInputElement;
const precio = document.getElementById("precio") as HTMLInputElement;
const cantidad = document.getElementById("cantidad") as HTMLInputElement;
const estado = document.getElementById("estado") as HTMLSelectElement;

const btnGuardar = document.getElementById("btnGuardar") as HTMLButtonElement;
const btnCancelar = document.getElementById("btnCancelar") as HTMLButtonElement;

async function obtenerProductos(): Promise<void> {
  const respuesta = await fetch(URL_BASE);

  const productos: Producto[] = await respuesta.json();

  mostrarProductos(productos);
}

function mostrarProductos(productos: Producto[]): void {
  const cuerpoTabla = document.getElementById(
    "cuerpoTabla",
  ) as HTMLTableSectionElement;

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

async function guardarProducto(): Promise<void> {
  codigo.classList.remove("error");

  const producto: Producto = {
    codigo: codigo.value,
    nombre: nombre.value,
    descripcion: descripcion.value,
    precio: Number(precio.value),
    cantidad: Number(cantidad.value),
    estado: estado.value,
  };

  let respuesta: Response;

  if (idEditando !== null) {
    respuesta = await fetch(`${URL_BASE}/${idEditando}`, {
      method: "PUT",

      headers: {
        "Content-Type": "application/json",
      },

      body: JSON.stringify(producto),
    });
  } else {
    respuesta = await fetch(URL_BASE, {
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
}

async function editarProducto(id: number): Promise<void> {
  const respuesta = await fetch(`${URL_BASE}/${id}`);

  const producto: Producto = await respuesta.json();

  codigo.value = producto.codigo;

  nombre.value = producto.nombre;

  descripcion.value = producto.descripcion;

  precio.value = producto.precio.toString();

  cantidad.value = producto.cantidad.toString();

  estado.value = producto.estado || "Activo";

  idEditando = id;
}

async function mostrarProducto(id: number): Promise<void> {
  const respuesta = await fetch(`${URL_BASE}/${id}`);

  const producto: Producto = await respuesta.json();

  alert(
    `ID: ${producto.id}
Código: ${producto.codigo}
Nombre: ${producto.nombre}
Descripción: ${producto.descripcion}
Precio: ${producto.precio}
Cantidad: ${producto.cantidad}
Estado: ${producto.estado}`,
  );
}

async function eliminarProducto(id: number): Promise<void> {
  await fetch(`${URL_BASE}/${id}`, {
    method: "DELETE",
  });

  obtenerProductos();
}

function cancelarEdicion(): void {
  idEditando = null;

  limpiarFormulario();
}

function limpiarFormulario(): void {
  codigo.value = "";

  nombre.value = "";

  descripcion.value = "";

  precio.value = "";

  cantidad.value = "";

  estado.value = "Activo";
}

(window as any).editarProducto = editarProducto;

(window as any).eliminarProducto = eliminarProducto;

(window as any).mostrarProducto = mostrarProducto;

obtenerProductos();
