/**
 *AulaDAO.java
 *@author Laura y Carlos
 *@version 1.0
 */

package dao;


import java.nio.file.Path;


import modelo.Alumno;

/**
 *  @descrition AulaDAO
 *	@author Laura y Carlos
 *  @date 18/9/2021
 *  @version 1.0
 *  @license GPLv3
 */
public interface  AulaDAO {
	
	
	/**
	 * Comprueba si el almacén está vacio
	 * 
	 * @return true si está vacio
	 */
	public boolean estaVacio();

	/**
	 * Comprueba si el almacén está lleno
	 * 
	 * @return
	 */
	public boolean estaLLeno();

	/**
	 * Anade un nuevo elemento al almacén si hay sitio a anadir al almacén
	 * 
	 * @param alumno
	 *            
	 */
	public void add(Alumno alumno);

	/**
	 * Elimina un elemento del almacén si está en el almacen
	 * 
	 * @param alumno
	 * @return true si elimina el elemento, false en caso contrario
	 */
	public boolean eliminar(Alumno alumno);

	/**
	 * Imprime por pantalla los elementos del almacén
	 */
	public void informacionAlumnos() ;

	/**
	 * Método que escribe los alumnos en un archivo
	 * 
	 * @param ruta
	 */
	public void escribeAlumnos(Path ruta) ;

	/**
	 * Método que lee alumnos de un archivo y los muestra por pantalla
	 * 
	 * @param ruta
	 */
	public void leeAlumnos(Path ruta);

}
