import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import dao.AulaDAOImp;
import dao.PokemonDAOImp;
import modelo.Alumno;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		AulaDAOImp ej = new AulaDAOImp(1);

		// Ejercicio 16

		System.out.println("----------------- Ejercicio 16 -----------------");

		// Añadir alumnos
		System.out.println("\n¿Cuántos alumnos quiere añadir?");
		int cantidad = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < cantidad; i++) {

			if (ej.estaVacio())
				ej.add(crear());
			else if (ej.estaLLeno()) {
				System.err.println("\nNo entran más alumnos en el aula");
				break;
			} else
				ej.add(crear());
		}

		// Escribir en el fichero
		Path path = Paths.get("Alumnos_del_aula.txt");

		ej.escribeAlumnos(path);

		System.out.println("\nDatos de los alumnos: \n");
		ej.leeAlumnos(path);

	}

	public static Alumno crear() {

		System.out.println("\nVa a introducir los datos del alumno: ");

		System.out.print("Nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Apellidos: ");
		String apellidos = sc.nextLine();

		System.out.print("Año de nacimiento: ");
		int anio = sc.nextInt();
		sc.nextLine();

		System.out.print("Calle: ");
		String calle = sc.nextLine();

		System.out.print("Número: ");
		int numero = sc.nextInt();
		sc.nextLine();

		Alumno alum = new Alumno(nombre, apellidos, anio, calle, numero);

		return alum;

	}

}
