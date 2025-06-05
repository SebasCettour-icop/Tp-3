package resol.CettourS;

import resol.CettourS.ejercicio1.Ejercicio1;
import resol.CettourS.ejercicio2.Ejercicio2;
import resol.CettourS.ejercicio3.Ejercicio3;
import resol.CettourS.ejercicio4.Ejercicio4;
import resol.CettourS.ejercicio5.Ejercicio5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese número de ejercicio (1-5): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> Ejercicio1.ejecutar();
            case 2 -> Ejercicio2.ejecutar();
            case 3 -> Ejercicio3.ejecutar();
            case 4 -> Ejercicio4.ejecutar();
            case 5 -> Ejercicio5.ejecutar();
            default -> System.out.println("Opción inválida.");
        }
    }
}