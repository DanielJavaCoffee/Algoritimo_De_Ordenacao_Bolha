package main;

import java.util.Arrays;
import java.util.Random;

import bolha.Bolha;

public class MainBolha {
	public static void main(String[] args) {
		
		int[] arr = new int[5000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(900) + 100; // Números aleatórios de 100 a 999 (3 dígitos)
        }
        // Imprime o vetor desordenado
        System.out.println("Vetor desordenado: ");
        System.out.println(Arrays.toString(arr));
        // Ordena o vetor usando o Bubble Sort e mede o tempo de execução
        long startTime = System.currentTimeMillis();
       // Bolha.bolhaVersaoRuim(arr);
        Bolha.bolhaVersaoRuim(arr);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        // Imprime o vetor ordenado e o tempo de execução
        System.out.println("Vetor ordenado: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Tempo de execução (ms): " + duration);
	} // end main
} // end class
