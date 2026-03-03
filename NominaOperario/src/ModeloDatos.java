import java.util.HashMap;

public class ModeloDatos {
	HashMap<String, Operario> mapaOperarios;
	
	public ModeloDatos() {
		mapaOperarios= new HashMap<String, Operario>();
	}
	
	public void registarOperario(Operario op) {
		mapaOperarios.put(op.get.Documento() , op);
	}
}
 