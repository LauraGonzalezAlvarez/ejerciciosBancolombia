package com.example.ejerciciosbancolombia;
import java.util.Scanner;

public class ProgramaEquis {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Ingrese el tamaño de la letra X: ");
            int n = input.nextInt();

            if (n == 0) {
                System.out.println("ERROR");
            } else {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == j || j == (n - 1 - i)) {
                            System.out.print("X");
                        } else {
                            System.out.print("_");
                        }
                    }
                    System.out.println();
                }
            }

    }
}
