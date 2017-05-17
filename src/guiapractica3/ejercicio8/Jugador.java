package guiapractica3.ejercicio8;

public class Jugador {
	private int edad;
	private int altura; //Expresada en centímetros
	private String nombre;
	
	public Jugador(int edad, int altura, String nombre) {
		super();
		this.edad = edad;
		this.altura = altura;
		this.nombre = nombre;
	}
	
	public int getAltura() {
		return altura;
	}
	public int getEdad() {
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	
	
	
}