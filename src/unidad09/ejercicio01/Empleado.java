package unidad09.ejercicio01;

public class Empleado extends Thread {

	@Override
	public void run() {
		BañoQuimico baño = BañoQuimico.getBaño();
		baño.limpiar(this);
	}
}
