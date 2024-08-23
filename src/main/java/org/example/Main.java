package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Probar caracterEn
            System.out.println("Escribe una palabra: ");
            String leeTecl = scanner.nextLine();

            System.out.println("Escribe la posición del carácter que quieres obtener: ");
            int posicion = scanner.nextInt();

            if (posicion >= 0 && posicion < leeTecl.length()) {
                try {
                    char caracter1 = caracter.caracterEn(leeTecl, posicion);
                    System.out.println("El carácter en la posición " + posicion + " es: " + caracter1);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("No existe la posición " + posicion + " en esta cadena.");
            }

            // Probar NumeroNegativoExcepcion
            System.out.println("Escribe un número: ");
            try {
                double valor = scanner.nextDouble();
                if (valor < 0) {
                    throw new caracter.NumeroNegativoExcepcion("El número es negativo: " + valor);
                } else {
                    System.out.println("La raíz cuadrada de " + valor + " es: " + Math.sqrt(valor));
                }
            } catch (caracter.NumeroNegativoExcepcion e) {
                System.out.println(e.getMessage());
            }
        }
    }
}