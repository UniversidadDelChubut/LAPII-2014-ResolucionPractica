package unidad09.ejercicio01;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for(int i = 0; i < 15; i++){
			FanDeLuisMiguel fan = new FanDeLuisMiguel();
			new Thread(fan).start();
		}
		
	}

}
