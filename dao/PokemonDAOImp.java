package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import modelo.Alumno;
import modelo.Pokemon;

public class PokemonDAOImp implements AulaDAO {

	private List<Pokemon> pokemones;
	private int numPokemones; // atributo para controlar el número real de
	// elementos que tiene nuestro almacén

	/**
	 * Constructor del Almacén con un determinado tamaño
	 *
	 * @param tamano
	 */
	public PokemonDAOImp(int tamano) {
		pokemones = new ArrayList<Pokemon>(tamano);
		numPokemones = tamano;
	}

	public void escribirPokemon(String ruta, Pokemon pokemon) {

        // Método para escribir pokemons
    /*  Path fichero = Paths.get(ruta);
        OpenOption[] options = new OpenOption[2];
        options[0] = StandardOpenOption.APPEND;
        options[1] = StandardOpenOption.CREATE;
        String datos;

        try (BufferedWriter bw = Files.newBufferedWriter(fichero, options)){

            if (Files.notExists(fichero)) {
                Files.createFile(fichero);
            }
            datos = pokemon.getNombre()+";"+pokemon.getNivel()+";"+pokemon.getVida()+";"+pokemon.getAtaque()+";"+pokemon.getDefensa()+";"+pokemon.getAtaqueEspecial()+";"+pokemon.getDefensaEspecial()+";"+pokemon.getVelocidad()+"\n";
            bw.write(datos);
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }*/
        // Método para escribir objetos sin que se repitan
        Path fichero = Paths.get(ruta);
        OpenOption[] options = new OpenOption[2];
        options[0] = StandardOpenOption.APPEND;
        options[1] = StandardOpenOption.CREATE;
        BufferedReader br;
        String linea;
        String[] poke;
        boolean coincide = false;

        try (BufferedWriter bw = Files.newBufferedWriter(fichero, options)) {

            br = Files.newBufferedReader(fichero);

            if (br.readLine() == null) {
                bw.write(pokemon.getNombre()+";"+pokemon.getNivel()+";"+pokemon.getVida()+";"+pokemon.getAtaque()+";"+pokemon.getDefensa()+";"+pokemon.getAtaqueEspecial()+";"+pokemon.getDefensaEspecial()+";"+pokemon.getVelocidad());
                bw.newLine();
            }
            else {
                while ((linea = br.readLine()) != null) {
                    poke = linea.split(";");
                    if (poke[0].equals(pokemon.getNombre())){
                        coincide = true;
                        break;
                    }
                }
                if (!(coincide)) {
                    bw.append(pokemon.getNombre() + ";" + pokemon.getNivel() + ";" + pokemon.getVida() + ";" + pokemon.getAtaque() + ";" + pokemon.getDefensa() + ";" + pokemon.getAtaqueEspecial() + ";" + pokemon.getDefensaEspecial() + ";" + pokemon.getVelocidad());
                    bw.newLine();
                }
                else {
                    System.out.println("ERROR. El pokemon "+pokemon.getNombre()+" ya existe.");
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void imprimirPokemon(String ruta) {

        Path fichero = Paths.get(ruta);
        String linea;
        String[] pokemones;

        try (BufferedReader br = Files.newBufferedReader(fichero)){
            while ((linea = br.readLine()) != null) {
                pokemones = linea.split(";");
                System.out.println("Name: <"+pokemones[0]+">\n \tLevel: <"+pokemones[1]+">\n \tHP: <"+pokemones[2]+">\n \tAttack: <"+pokemones[3]+">\n \tDefense: <"+pokemones[4]+">\n \tSpecial Attack: <"+pokemones[5]+">\n \tSpecial Defense: <"+pokemones[6]+">\n \tSpeed: <"+pokemones[7]+">");
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public List<Pokemon> leerPokemon(String ruta, String cadena) {

   /*     // Método para leer datos de un Fichero y guardarlos en un List<>
        Path fichero = Paths.get(ruta);
        String linea;
        String[] pokemones;
        List<Pokemon> lista = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(fichero)){
            while ((linea = br.readLine()) != null) {
                pokemones = linea.split(";");
                Pokemon pokemon = new Pokemon(pokemones[0], Integer.parseInt(pokemones[1]), Integer.parseInt(pokemones[2]), Integer.parseInt(pokemones[3]), Integer.parseInt(pokemones[4]), Integer.parseInt(pokemones[5]), Integer.parseInt(pokemones[6]), Integer.parseInt(pokemones[7]));
                lista.add(pokemon);
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }*/
        Path fichero = Paths.get(ruta);
        String linea;
        String[] pokemones;
        List<Pokemon> lista = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(fichero)){
            while ((linea = br.readLine()) != null) {
                pokemones = linea.split(";");
                if (pokemones[0].contains(cadena)) {
                    Pokemon pokemon = new Pokemon(pokemones[0], Integer.parseInt(pokemones[1]), Integer.parseInt(pokemones[2]), Integer.parseInt(pokemones[3]), Integer.parseInt(pokemones[4]), Integer.parseInt(pokemones[5]), Integer.parseInt(pokemones[6]), Integer.parseInt(pokemones[7]));
                    lista.add(pokemon);
                }
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

	@Override
	public boolean estaVacio() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean estaLLeno() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(Alumno alumno) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean eliminar(Alumno alumno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void informacionAlumnos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void escribeAlumnos(Path ruta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void leeAlumnos(Path ruta) {
		// TODO Auto-generated method stub

	}
}
