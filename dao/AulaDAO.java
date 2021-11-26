package metodos;

import clases.Alumno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AulaDAO {

    private List<Alumno> alumnos;
    private int numAlumnos;

    public AulaDAO(int tamano) {
        this.alumnos = new ArrayList<Alumno>(tamano);
        this.numAlumnos = tamano;
    }

    public void informacionAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println();
        }
    }

    public void escribeAlumnos(Path ruta) {

        try (BufferedWriter bw = Files.newBufferedWriter(ruta)){
            for (Alumno alumno : alumnos) {
                bw.write(alumno.getNombre()+"\t"+alumno.getApellidos()+"\t"+alumno.getAnoNacimiento()+"\t"+alumno.getDireccion());
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

    public void leeAlumnos(Path ruta) {

        String linea;

        try (BufferedReader br = Files.newBufferedReader(ruta)){
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public boolean eliminar(Alumno alumno) {
        for (Alumno alum : alumnos) {
            if (alum.getNombre().equals(alumno.getNombre()) && alum.getApellidos().equals(alumno.getApellidos())) {
                return true;
            }
        }
        return false;
    }

    public void add(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public boolean estaVacio() {
        if (this.alumnos.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean estaLleno() {
        if (this.alumnos.size() == numAlumnos) {
            return true;
        }
        else {
            return false;
        }
    }
}
