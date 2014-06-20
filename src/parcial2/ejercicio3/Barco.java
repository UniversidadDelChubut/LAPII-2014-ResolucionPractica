package parcial2.ejercicio3;

public class Barco implements Runnable {

	@Override
	public void run() {
		Darsena.getDarsena().atracar(this);
	}
	
}
