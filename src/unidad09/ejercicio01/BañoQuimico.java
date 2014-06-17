package unidad09.ejercicio01;

public class BañoQuimico {
	
	private static BañoQuimico baño  = new BañoQuimico();
	
	static BañoQuimico getBaño(){
		return baño;
    }

	public synchronized void usar (FanDeLuisMiguel fan){
		
	}
	
	public synchronized void limpiar (Empleado empleado){
		
	}
	
}
