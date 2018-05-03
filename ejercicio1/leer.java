package ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leer {
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
      String cadena;
      int contador=1;
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
      System.out.println("---Lista de alumnos---");
          System.out.println("_________________________");
        
          while((cadena = b.readLine())!=null) {
          System.out.println("---Alumno n?"+contador+"---");
          System.out.println(cadena);
              System.out.println("____________________");
          contador++;
      
        }
      b.close();
}
}
