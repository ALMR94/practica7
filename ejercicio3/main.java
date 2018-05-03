
package ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class main {

    public static void main(String[] args) throws IOException, FileNotFoundException, MiExcepcion {
        try {
            abrirfichero();
        } catch (MiExcepcion ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
        }

    }

    public static void abrirfichero() throws MiExcepcion {
        File archivo;
        FileReader fr = null;
        BufferedReader br;
        try {
            archivo = new File("C:\\Users\\hola\\Documents\\DAW1\\Programación\\Java\\ejercicio3.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            leerarchivo(br);
        } catch (Exception e) {
            throw new MiExcepcion("Error al abrir el fichero", e.getCause());
        } finally {

            cerrarFichero(fr);
        }

    }

    public static void cerrarFichero(FileReader fr) {
        // En el finally cerramos el fichero, para asegurarnos
        // que se cierra tanto si todo va bien como si salta
        // una excepcion.
        try {
            if (null != fr) {
                fr.close();
            }
        } catch (Exception e2) {
        }
    }

    public static void leerarchivo(BufferedReader br) throws IOException {
        // Lectura del fichero
        String linea;
        while ((linea = br.readLine()) != null) {
            String vector[] = linea.split(" ");
            generarboletin(vector, br);
        }

    }

    public static void generarboletin(String vector[], BufferedReader br) throws IOException {
        //Generamos un txt con las notas
        FileWriter archivo = new FileWriter("C:\\Users\\hola\\Documents\\DAW1\\Programación\\Java\\notas\\"
                + vector[0] + vector[1] + vector[2] + ".txt");
        PrintWriter ar = new PrintWriter(archivo);
        int aprobadas = 0;
        int suspendidas = 0;
        int convalidadas = 0;

        ar.println("=====Boletin de notas===========");
        ar.println("Nombre:" + vector[0] + " " + vector[1] + " " + vector[2]);
        ar.println("_Modulo------------------------Notas_");
        ar.println("Lenguaje de marcas:" + " " + vector[3]);
        ar.println("Programacion:" + " " + vector[4]);
        ar.println("Entornos de desarrollo:" + " " + vector[5]);
        ar.println("Base de datos:" + " " + vector[6]);
        ar.println("Sistemas Informaticos:" + " " + vector[7]);
        ar.println("FOL:" + " " + vector[8]);
        ar.println("==========================");
        for (int i = 3; i < 9; i++) {
            if (vector[i].equals("c-5")) {
                convalidadas++;
            } else if (Integer.parseInt(vector[i]) < 5) {
                suspendidas++;
            } else if (Integer.parseInt(vector[i]) >= 5) {
                aprobadas++;
            }
        }
        ar.println("Modulos aprobados: " + aprobadas);
        ar.println("Modulos suspensos: " + suspendidas);
        ar.println("Modulos convalidados: " + convalidadas);
        ar.println("===========================");
        cerrarFicheroEscritura(ar);
    }

    public static void cerrarFicheroEscritura(PrintWriter ar) throws IOException {
        // En el finally cerramos el fichero, para asegurarnos
        // que se cierra tanto si todo va bien como si salta
        // una excepcion.
        try {
            if (null != ar) {
                ar.close();
            }
        } catch (Exception e2) {
        }
    }
}
