package ejercicio2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) throws excepcion{
        try {
            convertirenbase();
        } catch (Exception ex) {
            System.out.println("Detalles del error: " + ex.getMessage());
        }

    }

    public static void convertirenbase() throws excepcion {
        try {
            Scanner sn = new Scanner(System.in);
            System.out.println("Escribe un número, por favor: ");
            int num = sn.nextInt();
            for (int i = 2; i <= 16; i++) {
                System.out.println("El número" + num + " en base " + i + " es " + Integer.toString(num, i));
            }
        } catch (Exception ex) {
            System.out.println("Detalles del error: " + ex.getMessage());
        }
    }

}
