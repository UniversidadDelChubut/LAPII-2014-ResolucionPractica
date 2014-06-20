package parcial2.ejercicio3;

public class Darsena {
	
	private static Darsena darsena = new Darsena();
	
	public static Darsena getDarsena(){
		return Darsena.darsena;
	}
	
	public synchronized void atracar(Barco barco){
		// La implementación del método no era
		// necesaria, bastaba con la declaración
	}
}
