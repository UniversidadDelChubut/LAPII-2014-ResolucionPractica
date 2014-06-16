package unidad08.ejercicio01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ArmerDirectorio {

	public static void main(String[] args) throws IOException {
				
		File raizTmp = new File(args[0]);
		
		File carpeta1 = new File ( raizTmp, "aaa");
		carpeta1.mkdir();
		
		File archivo1 = new File ( carpeta1, "archivo" + 10 + ".txt");
		archivo1.createNewFile();
		
		Writer w = new FileWriter(archivo1);
		w.write("HOla gente!\n");
		w.write("Vamo Croacia!\n");
		w.close();
		
		
		
		
	}
}
