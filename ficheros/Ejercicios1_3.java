package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import interfaces.InterfazEjercicios1_3;

/**
 * 
 * @author Escribe_aqui_tu_nombre
 * @date 
 * @version 
 * @license GPLv3
 *
 */
public class Ejercicios1_3 implements InterfazEjercicios1_3 {

	
	
	@Override
	public List<String> getFrases(Scanner escaner) {
		
		return null;
	}

	@Override
	public Path getNombre(Scanner escaner) {
		
		return null;
	}
	
	@Override
	public void escribefrases(List<String> cadenas, Path ruta) {
		
		
	}

	@Override
	public void leerFrases(Path ruta) {
	
		try (BufferedReader br = Files.newBufferedReader(ruta)){
			
			String linea;
			
			while ((linea = br.readLine()) != null) {
				br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no ha sido encontrado");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}



	@Override
	public void escribirFlotante(float numeroDecimal, String ruta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Float> leerFlotante(String ruta) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
		
		


}
