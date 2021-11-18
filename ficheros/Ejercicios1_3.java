package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
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
		List<String> cadenas = null;

		try {
			cadenas = new ArrayList<String>();

			System.out.println("¿Cuántas frases desea introducir?");
			cant = Integer.parseInt(escaner.nextLine());

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
			System.out.println("Escriba el nombre del fichero donde se almacenarán las frases (sin extensión):");
			ruta = Paths.get(escaner.next()+".txt");

			if (Files.exists(ruta)) {
				System.out.println("A continuación añadiremos las frase al fichero "+ruta.getFileName());
			}
		}
		catch (Exception e){
			System.err.println(e.getMessage());
		}
		return ruta;
	}

	@Override
	public void escribefrases(List<String> cadenas, Path ruta) {

		//Ejercicio6
		Charset charset = Charset.forName("UTF-8");

		OpenOption append = StandardOpenOption.APPEND;
		OpenOption create = StandardOpenOption.CREATE;

		OpenOption[] options = new OpenOption[2];

		options[0] = append;
		options[1] = create;


		String frase;

		try (BufferedWriter bw = Files.newBufferedWriter(ruta, charset, options)) {

			for (int i = 0; i < cadenas.size(); i++) {

				frase = cadenas.get(i);

				bw.append(cadenas.get(i));
				bw.newLine();

			}

			// Ejercicio 4
			/*
			 * String frase = null;
			 *
			 * try (OutputStream os = Files.newOutputStream(ruta)) {
			 *
			 * for (int i = 0; i < cadenas.size(); i++) {
			 *
			 * frase = cadenas.get(i) + "\n";
			 *
			 * os.write(frase.getBytes());
			 * }
			 */

			// Ejercicio 3
			/*
			 * for (int i = 0; i < cadenas.size(); i++) { frase = cadenas.get(i);
			 * bw.write(frase); bw.newLine(); }
			 *
			 * System.out.println("COMPLETADO. Las líneas se han añadido al archivo.");
			 */

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public void leerFrases(Path ruta) {

		// Ejercicio 8

		String linea;

		try (BufferedReader br = Files.newBufferedReader(ruta)) {

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

		Path p = Paths.get(ruta);
		OpenOption[] options = new OpenOption[2];
		options[0] = StandardOpenOption.APPEND;
		options[1] = StandardOpenOption.CREATE;
		String num = null;

		try (BufferedWriter bw = Files.newBufferedWriter(p, options)){

			num = String.valueOf(numeroDecimal);

			if (Files.exists(p)) {
				bw.append(num);
				bw.newLine();
			}
			else {
				System.out.println("No existe el fichero de texto.");
				Files.createFile(p);
				System.out.println("El fichero de texto fue creado correctamente.");
				bw.append(num);
				bw.newLine();
			}
		}
		catch (IOException e) {

		}
	}

	@Override
	public List<Float> leerFlotante(String ruta) {

		Path fichero = Paths.get(ruta);
		List<Float> lista = null;
		Float linea = null;

		try (BufferedReader br = Files.newBufferedReader(fichero)) {

			lista = new ArrayList<Float>();

			while ((linea = Float.valueOf(br.readLine())) != null) {
				lista.add(linea);
			}
		}
		catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		}
		catch (Exception e) { //No entiendo el porqué me salta esta excepción, pero el código funciona correctamente.
			System.err.println(e.getMessage());
		}
		return lista;
	}
}
