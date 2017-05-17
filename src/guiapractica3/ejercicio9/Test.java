package guiapractica3.ejercicio9;

public class Test {

	public static void main(String[] args) {
		
		try {
			new Persona("aa");
			new Persona("Julio456");
			
			new Persona("José");
		} catch (NombreCortoException ex) {
			System.err.println("Nombre Corto!!! " + ex.getMessage());
			
		} catch (NombreInvalidoException ex) {
			System.err.println("Nombre Invalido!!! " + ex.getMessage());
		} 
		
		
	}
}
