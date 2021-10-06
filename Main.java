import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import dao.PokemonDAOImp;
import ficheros.Ejercicios1_3;
import modelo.Pokemon;

public class Main {

	public static void main(String[] args) {
		
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
		
	}
}
