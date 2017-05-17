package guiapractica3.ejercicio8;

public class Test {
	public static void main(String[] args) {
		Equipo equipo = new Equipo("Spurs");
		Jugador veterano1 = new Jugador(35, 189, "Luis");
		Jugador veterano2 = new Jugador(45, 188, "Jose");
		Jugador veterano3 = new Jugador(39, 170, "Pedro");
		Jugador veterano4 = new Jugador(40, 165, "Ignacio");
		Jugador veterano5 = new Jugador(42, 202, "Marcos");
		Jugador veterano6 = new Jugador(38, 213, "Carlos");
		
		Jugador petiso = new Jugador(38, 155, "Fernando");
		Jugador pibe   = new Jugador(18, 213, "Julio");
		
		
		
		
		equipo.addJugador(veterano1);
		equipo.addJugador(veterano2);
		equipo.addJugador(veterano3);
		equipo.addJugador(veterano4);
		equipo.addJugador(veterano5);
		equipo.addJugador(veterano6);
		//equipo.addJugador(petiso);
		//equipo.addJugador(pibe);
		
		System.out.println("Equipo ideal");
		
		
	}
}
