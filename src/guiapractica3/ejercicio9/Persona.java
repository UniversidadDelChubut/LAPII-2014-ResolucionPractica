package guiapractica3.ejercicio9;

public class Persona {

	private String nombre;

	public static final int LARGO_MINIMO = 3;
	
	public static boolean isNombreValido(String nombre) {
		if (Persona.isNombreCorto(nombre))
			return false;
		
		return ! nombre.matches(".*\\d.*");
	}
	
	private static boolean isNombreCorto(String nombre) {
		return nombre.trim().length() <= LARGO_MINIMO;
	}
	
	
	public Persona(String nombre) throws NombreInvalidoException {
		if(Persona.isNombreCorto(nombre)) {
			throw new NombreCortoException("El nombre '" + nombre + "' es demasiado corto");
		}
		if(! Persona.isNombreValido(nombre)) {
			throw new NombreInvalidoException("El nombre '" + nombre + "' no es valido");
		}
		
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
}
