package com.example.ejerciciosbancolombia;

public class Ocurrencias
{
    public static void main(String[] args) {
        int[] myArray = {1, 2, 2, 5, 4, 6, 2, 2, 7, 7, 7, 7, 8}; // Aquí se define el arreglo

        int maxCount = 0; // Inicializamos la variable para el conteo máximo
        int currentCount = 1; // Inicializamos la variable para el conteo actual
        int maxNumber = myArray[0]; // Inicializamos la variable para el número con más ocurrencias seguidas

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] == myArray[i - 1]) { // Si el número actual es igual al número anterior, incrementamos el conteo actual
                currentCount++;
            } else { // Si el número actual no es igual al número anterior, comparamos el conteo actual con el conteo máximo
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxNumber = myArray[i - 1];
                }
                currentCount = 1; // Reiniciamos el conteo actual
            }
        }

        // Comparamos el conteo actual con el conteo máximo una vez más para tener en cuenta la última secuencia del arreglo
        if (currentCount > maxCount) {
            maxCount = currentCount;
            maxNumber = myArray[myArray.length - 1];
        }

        System.out.println("Longest: " + maxCount);
        System.out.println("Number: " + maxNumber);
    }
}
