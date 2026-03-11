package capadatos;

import java.util.HashMap;
import logica.Operario;

public class ModelDatos {

    private HashMap<String, Operario> mapaOperarios = new HashMap<>();
    
    public HashMap<String, Operario> getMapaOperarios() {
        return mapaOperarios;
    }
    
    public String registrar(Operario operario) {
        if (mapaOperarios.containsKey(operario.getDocumento())) {
            return "No";
        } else {
            mapaOperarios.put(operario.getDocumento(), operario);
            return "Si";
        }
    }
    
    public Operario consultar(String documento) {
        if (mapaOperarios.containsKey(documento)) {
            return mapaOperarios.get(documento);
        } else {
            return null;
        }
    }
    
    public void listar() {
        for (Operario operario : mapaOperarios.values()) {
            System.out.println(operario.toString());
        }
    }
    
    
}