package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import modelo.Alumno;
import modelo.Pokemon;

public class PokemonDAOImp implements AulaDAO {

	private List<Pokemon> pokemones;
	private int numPokemones; // atributo para controlar el número real de
	// elementos que tiene nuestro almacén

	/**
	 * Constructor del Almacén con un determinado tamano
	 * 
	 * @param tamano
	 */
	public PokemonDAOImp(int tamano) {
		pokemones = new ArrayList<Pokemon>(tamano);
		numPokemones = tamano;
	}

	public void escribirPokemon(String ruta, String name, int level, int life, int attack, int defense,
			int specialAttack, int specialDefense, int speed) {

		Path archivo = Paths.get(ruta);
		Charset charset = Charset.forName("UTF-8");
		String linea = name + ";" + level + ";" + life + ";" + attack + ";" + defense + ";" + specialAttack + ";"
				+ specialDefense + ";" + speed;
		OpenOption append = StandardOpenOption.APPEND;
		OpenOption crear = StandardOpenOption.CREATE;
		OpenOption[] options = new OpenOption[2];
		options[0] = append;
		options[1] = crear;

		try (BufferedWriter bw = Files.newBufferedWriter(archivo, charset, options)) {
			if (Files.exists(archivo)) {
				bw.append(linea);
				bw.newLine();
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("ERROR");
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

		/*try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {

			while ((pokem = (Pokemon) ois.readObject()) != null) {
				
				System.out.println(pokem);
				listaPokemones.add(pokem);
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/
		
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
