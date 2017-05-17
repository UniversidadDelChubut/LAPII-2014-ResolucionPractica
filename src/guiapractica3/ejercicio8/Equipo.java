package guiapractica3.ejercicio8;

public class Equipo {
	
	public static final int MAX_JUGADORES = 5; 
	public static final int EDAD_MINIMA = 35; 
	public static final int ALTURA_MINIMA = 160;
	
	private Jugador [] jugadores = new Jugador[MAX_JUGADORES];
	private String nombre;
	
	
	public Equipo(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Equipo(String nombre, Jugador[] jugadores) throws ValorInvalidoException {
		super();
		for (Jugador j: jugadores){
			this.addJugador(j);
		}
		this.nombre = nombre;
	}
	
	
	//NullPointer0
	public void addJugador (Jugador jugador) throws ValorInvalidoException, NullPointerException {
		if (jugador.getEdad() < Equipo.EDAD_MINIMA) {
			throw new ValorInvalidoException("El jugador debe tener al menos " + Equipo.EDAD_MINIMA + " años");
		}
		
		if (jugador.getAltura() < Equipo.ALTURA_MINIMA) {
			throw new ValorInvalidoException("El jugador debe tener al menos " + Equipo.ALTURA_MINIMA + " centímetros de estatura");
		}
		
		int i = 0;
		while (i < MAX_JUGADORES && this.jugadores[i] != null){
			i++;
		}
		
		if (i == MAX_JUGADORES) {
			throw new ValorInvalidoException("El equipo está completo");	
		}
		
		this.jugadores[i] = jugador;			
	}
	
	
}
