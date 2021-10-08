package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.InterfazEjercicios1_3;

/**
 * 
 * @author Escribe_aqui_tu_nombre
 * @date
 * @version
 * @license GPLv3
 *
 */
public class Ejercicios1_3 implements InterfazEjercicios1_3 {

	private static final OpenOption APPEND = null;
	private static final OpenOption CREATE = null;

	@Override
	public List<String> getFrases(Scanner escaner) {

		int cant = 0;
		String frase = null;
		List<String> cadenas = null;

		try {
			cadenas = new ArrayList<String>();

			System.out.println("¿Cuántas frases desea introducir?");
			cant = Integer.parseInt(escaner.nextLine());

			for (int i = 0; i < cant; i++) {
				System.out.println("Introduzca la frase nº" + (i + 1) + ":");
				frase = escaner.nextLine();
				cadenas.add(frase);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return cadenas;

	}

	@Override
	public Path getNombre(Scanner escaner) {

		Path ruta = null;

		try {
			System.out.println("Escriba el nombre del fichero donde se almacenarán las frases:");
			ruta = Paths.get(escaner.next() + ".txt");

			if (Files.exists(ruta)) {
				System.out.println("A continuación añadiremos las frase al fichero " + ruta.getFileName());
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return ruta;
	}

	@Override
	public void escribefrases(List<String> cadenas, Path ruta) {

		String frase = null;

		try (OutputStream os = Files.newOutputStream(ruta)) {
			
			for (int i = 0; i < cadenas.size(); i++) {
				
				frase = cadenas.get(i) + "\n";
				os.write(frase.getBytes());
				
			}

			/*for (int i = 0; i < cadenas.size(); i++) {
				frase = cadenas.get(i);
				bw.write(frase);
				bw.newLine();
			}
			
			System.out.println("COMPLETADO. Las líneas se han añadido al archivo.");*/
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

	@Override
	public void leerFrases(Path ruta) {
		
		//Ejercicio 8
		
		String linea;
				
		try(BufferedReader br = Files.newBufferedReader(ruta) ) {
			
			while ((linea = br.readLine()) != null) {
				
				System.out.println(linea);
				
			}			
			
			
		} catch (FileNotFoundException e) {
			System.err.println("El fichero no ha sido encontrado");
		} catch (IOException e) {
			System.err.println();
		}

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
