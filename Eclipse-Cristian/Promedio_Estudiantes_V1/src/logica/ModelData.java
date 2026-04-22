package logica;

import java.util.HashMap;
import entidades.Estudiantes;

public class ModelData {

    private HashMap<String, Estudiantes> listaEstudiantes = new HashMap<>();

    public String guardarEstudiante(Estudiantes e) {
        String llave = e.getDocumento() + "-" + e.getMateria();
        if (listaEstudiantes.containsKey(llave)) {
            return "existente";
        } else {
            listaEstudiantes.put(llave, e);
            return "guardado";
        }
    }

    public void actualizarEstudiante(Estudiantes e) {
        String llave = e.getDocumento() + "-" + e.getMateria();
        listaEstudiantes.replace(llave, e);
    }

    public Estudiantes consultarEstudiante(String documento, String materia) {
        String llave = documento + "-" + materia;
        return listaEstudiantes.get(llave);
    }

    public HashMap<String, Estudiantes> obtenerLista() {
        return listaEstudiantes;
    }

    public double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public void calcularEstado(Estudiantes e) {
        String estado;
        if (e.getPromedio() >= 3.5) {
            estado = "Gana la materia";
        } else {
            estado = "Pierde la materia";
            if (e.getPromedio() > 2.5) {
                estado += " - Puede recuperar";
            } else {
                estado += " - No puede recuperar";
            }
        }
        e.setEstado(estado);
    }
}