import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.PokemonDAOImp;
import ficheros.Ejercicios1_3;
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
		
		/*
		System.out.println();
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
			sc.close();
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		} */
		
	/*	System.out.println();
		System.out.println("EJERCICIO 7");
		System.out.println();
		
		System.out.println("¿Cuál de las cuatro soluciones anteriores piensas que es el más eficiente?");
		System.out.println();
		System.out.println("Pienso que la opción más eficiente es "); */
		
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
		
		System.out.println();
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
		}	
	}
}
