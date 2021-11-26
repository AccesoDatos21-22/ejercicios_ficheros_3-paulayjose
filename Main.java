import clases.Alumno;
import clases.Aula;
import clases.Pokemon;
import metodos.AulaDAO;
import metodos.Ejercicios;
import metodos.PokemonDAO;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        String ruta = "pokemon.txt";
        String rutaFlotante = "flotantes.dat";
        Path rutaAlumnos = Paths.get("alumnos.txt");
        PokemonDAO DAO = new PokemonDAO();
        Ejercicios EJE = new Ejercicios();
        String cadena;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio 1");
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 318, 45, 49, 49, 65, 65, 45);
        Pokemon charmander = new Pokemon("Charmander", 309, 39, 52, 43, 60, 50, 65);
        Pokemon squirtle = new Pokemon("Squirtle", 314, 44, 48, 65, 50, 64, 43);

        DAO.escribirPokemon(ruta, bulbasaur);
        DAO.escribirPokemon(ruta, charmander);
        DAO.escribirPokemon(ruta, squirtle);
        System.out.println("COMPLETADO");
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("Ejercicio 2");
        DAO.imprimirPokemon(ruta);
        System.out.println("COMPLETADO");
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("Ejercicio 3, 4, 5, 6");
  //      EJE.escribeFrases(EJE.getNombre(sc), EJE.getFrases(sc));
        System.out.println("COMPLETADO");
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("Ejercicio 8");
  //      EJE.leerFrases(EJE.getNombre(sc));
        System.out.println("COMPLETADO");
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("Ejercicio 9");
   /*     System.out.println("¿Cuántos números flotantes desea escribir?");
        int cant = Integer.parseInt(sc.nextLine());
        float num;
        for (int i=0; i<cant; i++) {
            System.out.println("Escriba el "+(i+1)+"º número flotante:");
            num = Float.parseFloat(sc.nextLine());
            EJE.escribirFlotante(num, rutaFlotante);
        }*/
        System.out.println("COMPLETADO");
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("Ejercicio 10");
    //    EJE.imprimirFlotante(rutaFlotante);
        System.out.println("COMPLETADO");
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("Ejercicio 11");
   /*     for (int i=0; i<EJE.leerFlotante(rutaFlotante).size(); i++) {
            System.out.println(EJE.leerFlotante(rutaFlotante).get(i));
        }*/
        System.out.println("COMPLETADO");
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("Ejercicio 12");
        System.out.println("Crear un JavaBean en la clase Pokemon y sobreescribir el método toString().");
        System.out.println("COMPLETADO");
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("Ejercicio 13");
        Pokemon squirtle1 = new Pokemon("Squirtle", 314, 44, 48, 65, 50, 64, 43);
        Pokemon charizard = new Pokemon("Charizard", 534, 78, 84, 78, 109, 85, 100);
        DAO.escribirPokemon(ruta, squirtle1);
        DAO.escribirPokemon(ruta, charizard);
        System.out.println("COMPLETADO");
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("Ejercicio 14");
   /*     for (int i=0; i<DAO.leerPokemon(ruta).size(); i++) {
            System.out.println(DAO.leerPokemon(ruta).get(i));
            System.out.println();
        }*/
        System.out.println("COMPLETADO");
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("Ejercicio 15");
        System.out.println("Introduzca la cadena que desea usar de filtro: ");
        cadena = sc.nextLine();
        for (int i=0; i<DAO.leerPokemon(ruta,cadena).size(); i++) {
            System.out.println(DAO.leerPokemon(ruta, cadena).get(i));
            System.out.println();
        }
        System.out.println("COMPLETADO");
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("Ejercicio 16");
        AulaDAO AULA = new AulaDAO(5);
        System.out.println("¿Cuántos alumnos desea introducir?");
        int cant = Integer.parseInt(sc.nextLine());
        while (cant<0 || cant>5) {
            System.out.println("Lo sentimos, el aula solo dispone de 5 plazas. Introduzca un valor entre 0 y 5.");
            System.out.println("¿Cuántos alumnos desea introducir?");
            cant = Integer.parseInt(sc.nextLine());
        }
        for (int i=0; i<cant; i++) {
            System.out.println("Introduzca el nombre del alumno:");
            String nombre = sc.nextLine();
            System.out.println("Introduzca el apellido del alumno:");
            String apellido = sc.nextLine();
            System.out.println("Introduzca el año de nacimiento del alumno:");
            int ano = Integer.parseInt(sc.nextLine());
            System.out.println("Introduzca la calle donde vive el alumno:");
            String calle = sc.nextLine();
            System.out.println("Introduzca el número de vivienda del alumno:");
            int numero = Integer.parseInt(sc.nextLine());
            Alumno alumno = new Alumno(nombre, apellido, ano, calle, numero);
            AULA.add(alumno);
        }
        AULA.escribeAlumnos(rutaAlumnos);
        AULA.leeAlumnos(rutaAlumnos);
        AULA.informacionAlumnos();
        System.out.println("COMPLETADO");
        System.out.println("----------------------------------");
        System.out.println();

        sc.close();
    }
}

