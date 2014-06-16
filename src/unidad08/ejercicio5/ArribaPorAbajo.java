package unidad08.ejercicio5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ArribaPorAbajo {

	public static void main(String[] args) throws Exception {
		String origen = args[0];
		String destino = args[1];
		
		
		Reader reader = new FileReader(origen);
		Writer writer = new FileWriter(destino);
		
		BufferedReader br = new BufferedReader(reader);
		
		String s = null;
		
		while ((s = br.readLine()) != null){
			s = s.replaceAll("ARRIBA", "ABAJO");
			writer.write(s + "\n");
		}
		
		br.close();
		writer.close();
	}
}
