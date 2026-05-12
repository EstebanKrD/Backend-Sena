package com.estebankr.demo.dto;

public class personaDTO {

    private String document;
    private String nombre;
    private String telefono;
    private int edad;
    private String profesion;
    private String password;
    private int tipo;

    public personaDTO() {}

    public personaDTO(String document, String nombre, String telefono, int edad, String profesion, String password, int tipo) {
        super();
        this.document = document;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.profesion = profesion;
        this.password = password;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
