import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import dao.PokemonDAOImp;
import ficheros.Ejercicios1_3;
import modelo.Pokemon;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println();
		System.out.println("EJERCICIO 3");
		System.out.println();

		Ejercicios1_3 ejer = new Ejercicios1_3();

		try {
			
			Scanner sc = new Scanner(System.in);
			Path f = Paths.get("Ejercicio3.txt");

			if (Files.notExists(f)) {
				Files.createFile(f);
				System.out.println("Se ha creado el fichero Ejercicio3.txt");
			}

			ejer.escribefrases(ejer.getFrases(sc), ejer.getNombre(sc));
			
			sc.close();
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}

