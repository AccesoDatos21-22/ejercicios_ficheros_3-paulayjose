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

		Path fichero = Paths.get(ruta);
		OpenOption[] options = new OpenOption[2];
		options[0] = StandardOpenOption.APPEND;
		options[1] = StandardOpenOption.CREATE;
		BufferedReader br = null;
		String linea = null;
		String [] poke = null;
		boolean sino = false;
		String datos = null;

		try (BufferedWriter bw = Files.newBufferedWriter(fichero, options)){

			br = Files.newBufferedReader(fichero);
			datos = pokemon.getNombre()+";"+pokemon.getNivel()+";"+pokemon.getVida()+";"+pokemon.getAtaque()+";"+pokemon.getDefensa()+";"+pokemon.getAtaque_especial()+";"+pokemon.getDefensa_especial()+";"+pokemon.getVelocidad();

			if ((linea = br.readLine()) == null) {
				bw.write(datos);
				bw.newLine();
				System.out.println("El Pokemon "+pokemon.getNombre()+" ha sido añadido.");
			}
			else {
				while (linea != null) {

					poke = linea.split(";");
					if (!(pokemon.getNombre().equalsIgnoreCase(poke[0].toString()))) {
						sino = true;
					}
					else {
						System.err.println("El Pokemon "+pokemon.getNombre()+" ya existe.");
						sino = false;
						break;
					}
					linea = br.readLine();
				}
			}
			if (sino) {
				bw.append(datos);
				bw.newLine();
				System.out.println("El Pokemon "+pokemon.getNombre()+" ha sido añadido.");
			}
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
			System.err.println("Error IOException");
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void imprimirPokemon(String ruta) {
		Path archivo = Paths.get(ruta);
		String linea;

		try (BufferedReader br = Files.newBufferedReader(archivo)) {

			while ((linea = br.readLine()) != null) {

				String pokemones[] = linea.split(";");

				System.out.println("\nName: <" + pokemones[0] + ">\n\tLevel: <" + pokemones[1] + ">\n\tHP: <"
						+ pokemones[2] + ">\n\tAttack: <" + pokemones[3] + ">\n\tDefense: <" + pokemones[4]
						+ ">\n\tSppecial attack: <" + pokemones[5] + ">\n\tSpecial defense: <" + pokemones[6]
						+ ">\n\tSpeed: <" + pokemones[7] + ">");

			}

		} catch (FileNotFoundException e) {
			System.err.println("El fichero no ha sido encontrado");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public List<Pokemon> leerPokemon(String ruta) {

		List<Pokemon> listaPokemones = new ArrayList<Pokemon>();
		Path path = Paths.get(ruta);
		String linea;

		try(BufferedReader br = Files.newBufferedReader(path)) {

			while ((linea = br.readLine()) != null) {

				String[] pok = linea.split(";");

				Pokemon pokem = new Pokemon();

				pokem.setNombre(pok[0]);
				pokem.setNivel(Integer.parseInt(pok[1]));
				pokem.setVida(Integer.parseInt(pok[2]));
				pokem.setAtaque(Integer.parseInt(pok[3]));
				pokem.setDefensa(Integer.parseInt(pok[4]));
				pokem.setAtaque_especial(Integer.parseInt(pok[5]));
				pokem.setDefensa_especial(Integer.parseInt(pok[6]));
				pokem.setVelocidad(Integer.parseInt(pok[7]));

				listaPokemones.add(pokem);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return listaPokemones;

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
