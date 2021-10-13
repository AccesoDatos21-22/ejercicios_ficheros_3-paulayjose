/**
 *AulaDAOImp.java
 *@author Laura y Carlos
 *@version 1.0
 */

package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import modelo.Alumno;

/**
 *  @descrition AulaDAOImp
 *	@author Laura y Carlos
 *  @date 18/9/2021
 *  @version 1.0
 *  @license GPLv3
 */
public class AulaDAOImp implements AulaDAO{
	private List<Alumno> alumnos;
	private int numalumnos; // atributo para controlar el número real de
							// elementos que tiene nuestro almacén

	/**
	 * Constructor del Almacén con un determinado tamano
	 * 
	 * @param tamano
	 */
	public AulaDAOImp(int tamano) {
		alumnos = new ArrayList<Alumno>(tamano);
		numalumnos = tamano;

	}

	/**
	 * Comprueba si el almacén está vacio
	 * 
	 * @return true si está vacio
	 */
	public boolean estaVacio() {
		if (alumnos.isEmpty())
			return true;
		else
			return false;
	}

	/**
	 * Comprueba si el almacén está lleno
	 * 
	 * @return
	 */
	public boolean estaLLeno() {
		if (alumnos.size() == numalumnos + 1)
			return true;
		else
			return false;
	}

	/**
	 * Anade un nuevo elemento al almacén si hay sitio
	 * 
	 * @param valor a anadir al almacén
	 */
	public void add(Alumno alumno) {
		alumnos.add(alumno);
	}

	/**
	 * Elimina un elemento del almacén si está en el almacen
	 * 
	 * @param valor
	 * @return true si elimina el elemento, false en caso contrario
	 */
	public boolean eliminar(Alumno alumno) {
		for (Alumno alum : alumnos) {
			if (alum.getNombre().equalsIgnoreCase(alumno.getNombre())
					&& alum.getApellidos().equalsIgnoreCase(alumno.getApellidos()))
				return true;
			else
				return false;

		}

		return false;
	}

	/**
	 * Imprime por pantalla los elementos del almacén
	 */
	public void informacionAlumnos() {
		for (Alumno al : alumnos) {
			System.out.println(al.getNombre() + "\t" + al.getApellidos() + "\t" + al.getAnoNacimiento() + "\t"
					+ al.getDireccion());
		}
	}

	/**
	 * Método que escribe los alumnos en un archivo
	 * 
	 * @param ruta
	 */
	public void escribeAlumnos(Path ruta) {
		
		try (BufferedWriter bw = Files.newBufferedWriter(ruta)) {

			for (Alumno al : alumnos) {
				bw.write("Nombre: " + al.getNombre() + "\tAppellidos: " + al.getApellidos() + "\tAño de nacimiento: " + al.getAnoNacimiento() + "\tDirección: "
						+ al.getDireccion());
				bw.newLine();
			}

		} catch (FileNotFoundException e) {
			System.err.println("El fichero no ha sido encontrado");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Método que lee alumnos de un archivo y los muestra por pantalla
	 * 
	 * @param ruta
	 */
	public void leeAlumnos(Path ruta) {
		
		try (BufferedReader br = Files.newBufferedReader(ruta)) {
			System.out.println(Files.readAllLines(ruta));
		}
		catch (FileNotFoundException e) {
			System.out.println("El fichero no se encuentra");
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
