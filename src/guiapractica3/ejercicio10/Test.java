package guiapractica3.ejercicio10;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[]operandos = {"12", "1.8", "13", "23", "renato2"};
		char[]operadores = {'+', '*'};
		
		
		
		try {
			System.out.println(Operaciones.operarConArreglos(operandos, operadores));
		} catch (OperacionesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			if (e.getCause() != null) {
				e.getCause().printStackTrace();
			}
		}

	}

}
