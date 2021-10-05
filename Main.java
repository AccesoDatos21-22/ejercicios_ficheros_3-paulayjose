import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import dao.PokemonDAOImp;
import ficheros.Ejercicios1_3;

public class Main {

	public static void main(String[] args) {
		
	/*	System.out.println("EJERCICIO 1");
		System.out.println();
		String nombre = null;
		int nivel = 0;
		int vida = 0;
		int ataque = 0;
		int defensa = 0;
		int ataque_especial = 0;
		int defensa_especial = 0;
		int velocidad = 0;
		
		String f = "Pokemones.txt";
		
		nombre = "Bulbasaur";
		nivel = 3;
		vida = 10;
		ataque = 34;
		defensa = 41;
		ataque_especial = 45;
		defensa_especial = 55;
		velocidad = 24;
		
		System.out.println(nombre+" "+nivel+" "+vida+" "+ataque+" "+defensa+" "+ataque_especial+" "+defensa_especial+" "+velocidad);
		
		PokemonDAOImp uno = new PokemonDAOImp(1); //Objeto temporal para agregar Pokemones.
		uno.escribirPokemon(f, nombre, nivel, vida, ataque, defensa, ataque_especial, defensa_especial, velocidad);
		
		nombre = "Squirtle";
		nivel = 4;
		vida = 13;
		ataque = 39;
		defensa = 36;
		ataque_especial = 49;
		defensa_especial = 51;
		velocidad = 28;
		
		System.out.println(nombre+" "+nivel+" "+vida+" "+ataque+" "+defensa+" "+ataque_especial+" "+defensa_especial+" "+velocidad);
			
		PokemonDAOImp dos = new PokemonDAOImp(1);
		dos.escribirPokemon(f, nombre, nivel, vida, ataque, defensa, ataque_especial, defensa_especial, velocidad);
		
		nombre = "Charmander";
		nivel = 5;
		vida = 16;
		ataque = 41;
		defensa = 35;
		ataque_especial = 55;
		defensa_especial = 47;
		velocidad = 35;
		
		System.out.println(nombre+" "+nivel+" "+vida+" "+ataque+" "+defensa+" "+ataque_especial+" "+defensa_especial+" "+velocidad);
			
		PokemonDAOImp tres = new PokemonDAOImp(1);
		tres.escribirPokemon(f, nombre, nivel, vida, ataque, defensa, ataque_especial, defensa_especial, velocidad); */
		
		System.out.println();
		System.out.println("EJERCICIO 3");
		System.out.println();
		
		try {
			Path e3 = Paths.get("Ejercicio3.txt");
			Files.createFile(e3);
		}
		catch (IOException e){
			System.err.println(e.getMessage());
		}
		Ejercicios1_3 t = new Ejercicios1_3();
		Scanner sc = new Scanner(System.in); 
		t.escribefrases(t.getFrases(sc), t.getNombre(sc));
		sc.close();
	}
}
