package com.example.ejerciciosbancolombia;

public class NumeroMasAlto {

        public static void main(String[] args) {
            int[] myArray = {64, 12, 98, 73, 98, 98}; // Aquí se define el arreglo

            int maxNumber = myArray[0]; // Inicializamos la variable maxNumber con el primer elemento del arreglo

            for (int i = 1; i < myArray.length; i++) {
                if (myArray[i] > maxNumber) {
                    maxNumber = myArray[i];
                }
            }

            System.out.println(maxNumber); // Imprimimos el número más alto del arreglo
        }

}
