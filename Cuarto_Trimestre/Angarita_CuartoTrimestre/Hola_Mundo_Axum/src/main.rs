use axum::{
    routing::get,
    Router,
};

async fn hola_mundo() -> &'static str {
    "Hola Mundo con Rust Axum 🚀"
}

#[tokio::main]
async fn main() {
    let app = Router::new()
        .route("/", get(hola_mundo));

    let listener = tokio::net::TcpListener::bind("0.0.0.0:3000")
        .await
        .unwrap();

    println!("Servidor en http://localhost:3000");

    axum::serve(listener, app)
        .await
        .unwrap();
}