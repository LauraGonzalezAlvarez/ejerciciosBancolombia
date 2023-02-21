package com.example.ejerciciosbancolombia;

public class Histograma {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 1, 3, 3, 1, 2, 1, 5, 1}; // Aquí se define el arreglo

        int[] histogram = new int[5]; // Creamos un nuevo arreglo para el histograma

        // Recorremos el arreglo myArray y actualizamos el histograma
        for (int i = 0; i < myArray.length; i++) {
            int index = myArray[i] - 1;
            histogram[index]++;
        }



        // Imprimimos el histograma
        for (int i = 0; i < histogram.length; i++) {
            int currentValue = i + 1;
            String label = currentValue + ": ";
            System.out.print(label);
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
