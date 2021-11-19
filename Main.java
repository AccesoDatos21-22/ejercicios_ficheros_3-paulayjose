import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

import dao.AulaDAOImp;
import dao.PokemonDAOImp;
import ficheros.Ejercicios1_3;
import modelo.Alumno;
import modelo.Pokemon;

public class Main {

	public static void main(String[] args) {

		/*
		System.out.println("EJERCICIO 1");
		System.out.println();

		String f = "Pokemones.csv";

		Pokemon b = new Pokemon("Bulbasaur", 3, 10, 34, 41, 45, 55, 24);
		Pokemon s = new Pokemon("Squirtle", 4, 13, 39, 36, 49, 51, 28);
		Pokemon c = new Pokemon("Charmander", 5, 16, 41, 35, 55, 47, 35);

		PokemonDAOImp uno = new PokemonDAOImp(3);
		uno.escribirPokemon(f, b.getNombre(), b.getNivel(), b.getVida(), b.getAtaque(), b.getDefensa(), b.getAtaque_especial(), b.getDefensa_especial(), b.getVelocidad());
		uno.escribirPokemon(f, s.getNombre(), s.getNivel(), s.getVida(), s.getAtaque(), s.getDefensa(), s.getAtaque_especial(), s.getDefensa_especial(), s.getVelocidad());
		uno.escribirPokemon(f, c.getNombre(), c.getNivel(), c.getVida(), c.getAtaque(), c.getDefensa(), c.getAtaque_especial(), c.getDefensa_especial(), c.getVelocidad());
		*/

	/*	System.out.println();
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
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		} */

	/*	System.out.println();
		System.out.println("EJERCICIO 5");
		System.out.println();

		Ejercicios1_3 eje = new Ejercicios1_3();

		try {
			Scanner sc = new Scanner(System.in);
			Path fi = Paths.get("Ejercicio5.txt");

			if (Files.notExists(fi)) {
				Files.createFile(fi);
				System.out.println("Se ha creado el fichero Ejercicio5.txt");
			}

			eje.escribefrases(eje.getFrases(sc), eje.getNombre(sc));

			//Ejercicio 8
			System.out.println("\n------------------ Ejercicio 8 ------------------");
			System.out.println("\nFrases del fichero\n");
			ejer.leerFrases(f);

			sc.close();
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		}*/

		System.out.println();
		System.out.println("EJERCICIO 7");
		System.out.println();

		System.out.println("¿Cuál de las cuatro soluciones anteriores piensas que es el más eficiente?");
		System.out.println();
		System.out.println("Pienso que la opción más eficiente es el ejercicio 6(Usando BufferedWriter sin crear un arrayList con\n"
				+ "cada frase, sino con APPEND), debido a que gracias al BufferedWriter no estaremos accediendo constantemente\n"
				+ "al fichero y al no crear un arrayList consumiremos menos recursos en mi opinión.");

	/*	System.out.println();
		System.out.println("EJERCICIO 9");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String nombre = null;
		Ejercicios1_3 ej = null;
		int cant = 0;
		float flo = 0.0f;

		try {
			nombre = "Ejercicio9.txt";
			ej = new Ejercicios1_3();

			System.out.println("¿Cuántos números en coma flotante desea añadir?");
			cant = Integer.valueOf(sc.nextLine());

			for (int i=0; i<cant; i++) {
				System.out.println("Introduzca el "+(i+1)+"º número:");
				flo = Float.valueOf(sc.nextLine());

				ej.escribirFlotante(flo, nombre);
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			sc.close();
		} */

		//Ejercicio 10
		Scanner sc = new Scanner(System.in);

		Ejercicios1_3 ej = new Ejercicios1_3();

		String ruta = "Ejercicio_10.dat";

		System.out.println("¿Cuántos números desea introducir?");
		int cant = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < cant; i++) {

			System.out.print("introduzca un número: ");
			float num = sc.nextFloat();

			ej.escribirFlotante(num, ruta);

		}

		System.out.println("\nLos números del fichero son: ");
		ej.imprimirFlotante(ruta);

		sc.close();


	/*	System.out.println();
		System.out.println("EJERCICIO 11");
		System.out.println();

		Ejercicios1_3 ejer = null;
		String ruta = null;
		List<Float> lista = null;

		try {
			ejer = new Ejercicios1_3();
			ruta = "Ejercicio9.txt";
			lista = ejer.leerFlotante(ruta);
			for (int i=0; i<lista.size(); i++) {
				System.out.println(lista.get(i).toString());
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		} */

	/*	System.out.println();
		System.out.println("EJERCICIO 13");
		System.out.println();

		PokemonDAOImp trece = null;
		String nom = null;
		Pokemon b = new Pokemon("Bulbasaur", 3, 14, 26, 29, 35, 32, 27);
		Pokemon s = new Pokemon("Squirtle", 4, 17, 27, 30, 37, 33, 29);

		try {
			trece = new PokemonDAOImp(2);
			nom = "Pokemones.txt";
			trece.escribirPokemon(nom, b);
			trece.escribirPokemon(nom, s);
			trece.escribirPokemon(nom, b); //Añadimos otra vez el Pokemon b para ver como salta un error de duplicidad y no lo añade.
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		} */

		// Ejercicio 14
		/*System.out.println("EJERCICIO 14");
		System.out.println();

		List<Pokemon> lista = new ArrayList<Pokemon>();
		String f = "Pokemones.csv";

		Pokemon b = new Pokemon("Bulbasaur", 3, 10, 34, 41, 45, 55, 24);
		Pokemon s = new Pokemon("Squirtle", 4, 13, 39, 36, 49, 51, 28);
		Pokemon c = new Pokemon("Charmander", 5, 16, 41, 35, 55, 47, 35);

		PokemonDAOImp uno = new PokemonDAOImp(3);

		uno.escribirPokemon(f, b.getNombre(), b.getNivel(), b.getVida(), b.getAtaque(), b.getDefensa(),
				b.getAtaque_especial(), b.getDefensa_especial(), b.getVelocidad());
		uno.escribirPokemon(f, s.getNombre(), s.getNivel(), s.getVida(), s.getAtaque(), s.getDefensa(),
				s.getAtaque_especial(), s.getDefensa_especial(), s.getVelocidad());
		uno.escribirPokemon(f, c.getNombre(), c.getNivel(), c.getVida(), c.getAtaque(), c.getDefensa(),
				c.getAtaque_especial(), c.getDefensa_especial(), c.getVelocidad());

		lista = uno.leerPokemon(f);

		for (Pokemon pokemon : lista) {
			System.out.println(pokemon);
		}*/

	/*	System.out.println();
		System.out.println("EJERCICIO 15");
		System.out.println();

		PokemonDAOImp quince = null;
		List<Pokemon> lista = new ArrayList<Pokemon>();
		Path ruta = Paths.get("Pokemones.txt");
		OpenOption[] options = new OpenOption[2];
		options[0] = StandardOpenOption.APPEND;
		options[1] = StandardOpenOption.CREATE;
		String nom = null;
		String cad = null;

		try (BufferedWriter bw = Files.newBufferedWriter(ruta, options)){

			bw.write("Charmander;3;14;26;29;35;32;27");
			bw.newLine();
			bw.append("Charmeleon;31;34;41;47;51;46;39");
			bw.newLine();
			bw.append("Charizard;55;60;73;62;79;58;55");
			bw.newLine();
			bw.close();

			nom = "Pokemones.txt";
			cad = "charm";

			quince = new PokemonDAOImp(3);
			lista = quince.leerPokemon(nom, cad);

			for (int i=0; i<lista.size(); i++) {
				System.out.println(lista.get(i).toString());
				System.out.println();
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		} */

	/*	System.out.println();
		System.out.println("EJERCICIO 17");
		System.out.println();

		System.out.println("¿Cuántos alumnos entran en el aula?");
		System.out.print("Número: ");
		int tamano = Integer.parseInt(sc.nextLine());

		AulaDAOImp ej = new AulaDAOImp(tamano);

		// Añadir alumnos
		System.out.println("\n¿Cuántos alumnos quiere añadir?");
		int cantidad = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < cantidad; i++) {

			if (ej.estaVacio()) {
				ej.add(crear());
			}
			else if (ej.estaLLeno()) {
				System.err.println("\nNo entran más alumnos en el aula");
				break;
			}
			else {
				ej.add(crear());
			}
		}

		// Escribir en el fichero
		Path path = Paths.get("Alumnos_del_aula.txt");

		ej.escribeAlumnos(path);

		//Imprimir alumnos
		System.out.println("\nDatos de los alumnos: \n");
		ej.leeAlumnos(path);
	*/
	}
/*
	public static Alumno crear() {

		Scanner sc = new Scanner(System.in);

		Pokemon b = new Pokemon("Bulbasaur", 3, 10, 34, 41, 45, 55, 24);
		Pokemon s = new Pokemon("Squirtle", 4, 13, 39, 36, 49, 51, 28);
		Pokemon c = new Pokemon("Charmander", 5, 16, 41, 35, 55, 47, 35);
		System.out.println("\nVa a introducir los datos del alumno: ");

		PokemonDAOImp uno = new PokemonDAOImp(3);
		uno.escribirPokemon(f, b.getNombre(), b.getNivel(), b.getVida(), b.getAtaque(), b.getDefensa(),
				b.getAtaque_especial(), b.getDefensa_especial(), b.getVelocidad());
		uno.escribirPokemon(f, s.getNombre(), s.getNivel(), s.getVida(), s.getAtaque(), s.getDefensa(),
				s.getAtaque_especial(), s.getDefensa_especial(), s.getVelocidad());
		uno.escribirPokemon(f, c.getNombre(), c.getNivel(), c.getVida(), c.getAtaque(), c.getDefensa(),
				c.getAtaque_especial(), c.getDefensa_especial(), c.getVelocidad());
		System.out.println("Nombre: ");
		String nombre = sc.nextLine();

		//uno.imprimirPokemon(f);
		System.out.println("Apellidos: ");
		String apellidos = sc.nextLine();

		lista = uno.leerPokemon(f);
		System.out.println("Año de nacimiento: ");
		int anio = Integer.parseInt(sc.nextLine());

		for (Pokemon pokemon : lista) {
			System.out.println(pokemon);
		}

		System.out.println("Calle: ");
		String calle = sc.nextLine();

		System.out.println("Número: ");
		int numero = Integer.parseInt(sc.nextLine());

		Alumno alum = new Alumno(nombre, apellidos, anio, calle, numero);

		sc.close();

		return alum;
	}*/
}


