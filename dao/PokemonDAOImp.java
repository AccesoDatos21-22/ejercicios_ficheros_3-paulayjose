package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
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
	private int numPokemones; // atributo para controlar el número real de elementos que tiene nuestro almacén

	/**
	 * Constructor del Almacén con un determinado tamaño
	 * 
	 * @param tamano
	 */
	public PokemonDAOImp(int tamano) {
		pokemones = new ArrayList<Pokemon>(tamano);
		numPokemones = tamano;
	}

	public void escribirPokemon(String ruta, String name, int level, int life, int attack, int defense, int specialAttack, int specialDefense, int speed) {
		
		Path archivo = Paths.get(ruta);
		Charset charset = Charset.forName("UTF-8");
		String linea = name+";"+level+";"+life+";"+attack+";"+defense+";"+specialAttack+";"+specialDefense+";"+speed;
		OpenOption append = StandardOpenOption.APPEND;
		OpenOption crear = StandardOpenOption.CREATE;
		OpenOption[] options = new OpenOption[2];
		options[0] = append;
		options[1] = crear;
		
		try (BufferedWriter bw = Files.newBufferedWriter(archivo, charset, options)){
			if (Files.exists(archivo)) {	
				bw.append(linea);
				bw.newLine();
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("ERROR");
		}
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
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public List<Pokemon> leerPokemon(String ruta, String nombre) {
		List<Pokemon> lista = new ArrayList<Pokemon>();
		Path fichero = Paths.get(ruta);
		String linea = null;
		String[] poke = null;
		Pokemon temp = null;
		
		try (BufferedReader br = Files.newBufferedReader(fichero)){
			linea = br.readLine();
			while (linea != null) {
				poke = linea.split(";");
				if (poke[0].toString().toLowerCase().contains(nombre.toLowerCase())) {
					temp = new Pokemon(poke[0].toString(), Integer.parseInt(poke[1]), Integer.parseInt(poke[2]), Integer.parseInt(poke[3]), Integer.parseInt(poke[4]), Integer.parseInt(poke[5]), Integer.parseInt(poke[6]), Integer.parseInt(poke[7]));
					lista.add(temp);
				}
				linea = br.readLine();
			}
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("ERROR");
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
