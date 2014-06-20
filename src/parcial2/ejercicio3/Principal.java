package parcial2.ejercicio3;

/*
 * Ejercicio 3 - Hilos
 *     Escriba una clase Darsena y una clase Barco. Haga que Darsena tenga un 
 *     método atracar que reciba como parámetro una referencia al barco que 
 *     desea atracar. Usando hilos simule la situación en la cual cinco 
 *     barcos desean atracar en la misma dársena.
 */
public class Principal {

	public static void main(String[] args) {
		for (int i= 0; i<= 5; i++){
			new Thread(new Barco()).run();
		}
	}
}
