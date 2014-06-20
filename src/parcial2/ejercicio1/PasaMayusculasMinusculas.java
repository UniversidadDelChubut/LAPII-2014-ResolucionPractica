package parcial2.ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

/* Ejercicio 1 - Archivos
 * 		Cree una clase llamada PasaMayusculasMinusculas que tenga un método de clase 
 * 		llamado procesar que recibe una cadena con la que especifica la ruta de un 
 * 		archivo de texto, el método debe devolver una colección de objetos String con 
 * 		un elemento por línea: las líneas pares en mayúsculas y las impares en minúsculas.
 */


public class PasaMayusculasMinusculas {

	public static List <String> procesar(String pathArchivo) throws Exception {
		List <String> resultado = new LinkedList<String>();
		try {
			Reader reader = new FileReader(pathArchivo);
			BufferedReader br = new BufferedReader(reader);
			String s = null;
			int i = 1;
			
			while ((s = br.readLine()) != null){
				if (i++ %2 == 0) {
					resultado.add(s.toLowerCase());
				} else {
					resultado.add(s.toUpperCase());
				}
			}
			br.close();
		} catch (IOException ex) {
			throw new Exception("Error al leer el archivo");
		}
		return resultado;
	}
	
	//Metodo de prueba - No debia ser implmentado en el escrito
	public static void main(String[] args) throws Exception {
		for (String s: PasaMayusculasMinusculas.procesar("prueba.txt")){
			System.out.println(s);
		}
	}
}
