package dao;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import modelo.Alumno;
import modelo.Pokemon;

public class PokemonDAOImp implements AulaDAO {

	private List<Pokemon> pokemones;
	private int numPokemones; // atributo para controlar el n�mero real de
	// elementos que tiene nuestro almac�n

	/**
	 * Constructor del Almac�n con un determinado tamano
	 * 
	 * @param tamano
	 */
	public PokemonDAOImp(int tamano) {
		pokemones = new ArrayList<Pokemon>(tamano);
		numPokemones = tamano;
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
