package parcial2.ejercicio2;

// Clase necesaria para la ejecución del programa
// No debía hacerse en el escrito 
public class Persona {
	
	private int numeroDocumento;
	private String nombre;
	private int edad;
	
	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public Persona(int numeroDocumento, String nombre, int edad) {
		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public static void main(String[] args) throws PersonaException {
		Persona persona = new Persona(17345123, "DIEGO MARADONA", 51);
		EjercicioJDBC accesoBD = new EjercicioJDBC();
		
		accesoBD.crearPersona(persona);
		accesoBD.crearPersona(persona);
	}
}
