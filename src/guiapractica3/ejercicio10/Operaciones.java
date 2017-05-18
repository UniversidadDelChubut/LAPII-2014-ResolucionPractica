package guiapractica3.ejercicio10;

public class Operaciones {
	
	
	public static float operarConArreglos(String[]operandos, char[]operadores)throws OperacionesException {
		
		float retval = 0;
		float [] operandosParseados = new float[operandos.length];
	
		//operandos deben ser numericos "Los operandodeben ser valores numéricos"
		
		String opAPAresar = null;
		try {
			for (int i = 0; i < operandos.length; i++){
				opAPAresar = operandos[i];
				operandosParseados[i] = Float.parseFloat(operandos[i]);
			}
		} catch (NumberFormatException nfe) {
			throw new OperacionesException("El operador " + opAPAresar + " no es un numero", nfe);
		}

		if  (! ((operandos.length>=2) && (operandos.length%2)== 0)) {
			throw new  OperacionesException("Los operandodeben ser al menos dos y ser una cantidad pares");	
		}
		
		
		if  (operadores.length != 2) {
			throw new  OperacionesException("Los operadores deben ser dos");	
		}
		
		for (int i = 0; i < operadores.length ; i++) {
			char op = operadores[i];
			if (op != '+' && op != '*' && op != '-' && op != '/') {
				throw new  OperacionesException("Los operadores válidos son +, -, * y /");
			}
		}
			
		
		
		//sean dos
		//Sean válidos
		
		
		
		
		
		
		
		
		
		
		return retval;		
	}
	
}
