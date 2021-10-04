package dao;

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

			if (Files.notExists(archivo)) {
				Files.createFile(archivo);
				bw.write(linea);
			}
			else {
				bw.append(linea);
				bw.newLine();
			}
		}
		catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		}
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
