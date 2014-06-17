package unidad09.ejercicio01;

public class FanDeLuisMiguel implements Runnable {
	
	@Override
	public void run() {
		gritar();
		BañoQuimico.getBaño().usar(this);
		
	}
	
	public void gritar(){
		//Grita
	}
}
