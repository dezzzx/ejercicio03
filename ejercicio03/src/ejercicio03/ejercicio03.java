package ejercicio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el texto:");
        String texto = scanner.nextLine();
        scanner.close();

        String[] palabras = texto.split("\\s+");

        int numeroDePalabras = palabras.length;
        int longitudTotal = 0;
        for (String palabra : palabras) {
            longitudTotal += palabra.length();
        }

        Map<String, Integer> frecuenciaPalabras = new HashMap<>();
        for (String palabra : palabras) {
            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }

        double longitudPromedio = (double) longitudTotal / numeroDePalabras;

        System.out.println("Número de palabras: " + numeroDePalabras);
        System.out.println("Longitud promedio de las palabras: " + longitudPromedio);
        System.out.println("Frecuencia de cada palabra:");
        for (Map.Entry<String, Integer> entry : frecuenciaPalabras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
	}
	}
}
