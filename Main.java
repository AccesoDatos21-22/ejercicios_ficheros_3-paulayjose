import dao.PokemonDAOImp;

public class Main {

	public static void main(String[] args) {
		
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
		tres.escribirPokemon(f, nombre, nivel, vida, ataque, defensa, ataque_especial, defensa_especial, velocidad);
	}	
}
