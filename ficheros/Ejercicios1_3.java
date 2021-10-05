package ficheros;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.InterfazEjercicios1_3;

/**
 * 
 * @author Jose Viñas y Paula Cabello
 * @date 04/10/2021
 * @version 
 * @license GPLv3
 *
 */
public class Ejercicios1_3 implements InterfazEjercicios1_3 {
	
	@Override
	public List<String> getFrases(Scanner escaner) {
		
		int cant = 0;
		String frase = null;
		List<String> cadenas = new ArrayList<String>();
		
		try {
			System.out.println("¿Cuántas frases desea introducir?");
			cant = escaner.nextInt();
			escaner.nextLine();
		
			for (int i=0; i<cant; i++) {
				System.out.println("Introduzca la frase nº"+(i+1)+":");
				frase = escaner.nextLine();
				cadenas.add(frase);
			}	
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return cadenas;
	}

	@Override
	public Path getNombre(Scanner escaner) {
		
		Path ruta = null;
		
		try {
			System.out.println("Escriba la ruta del fichero donde se almacenarán las frases:");
			ruta = Paths.get(escaner.next());
		}
		catch (Exception e){
			System.err.println(e.getMessage());
		}
		return ruta;
	}
	
	@Override
	public void escribefrases(List<String> cadenas, Path ruta) {
		
		String frase = null;
		OpenOption append = StandardOpenOption.APPEND;
		OpenOption create = StandardOpenOption.CREATE;
		OpenOption[] options = new OpenOption[2];
		options[0] = append;
		options[1] = create;
		
		try (BufferedWriter bw = Files.newBufferedWriter(ruta, options)){
			for (int i = 0; i < cadenas.size(); i++) {
				frase = cadenas.get(i).toString();
				bw.append(frase);
				bw.newLine();
			}
		}
		catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		catch (IOException e){
			System.err.println(e.getMessage());
		}
		
	}

	@Override
	public void leerFrases(Path ruta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void escribirFlotante(float numeroDecimal, String ruta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Float> leerFlotante(String ruta) {
		// TODO Auto-generated method stub
		return null;
	}
}
