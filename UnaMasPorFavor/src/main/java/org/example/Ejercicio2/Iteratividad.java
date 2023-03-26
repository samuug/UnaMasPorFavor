package org.example.Ejercicio2;

public class Iteratividad {
    public static void printPrimeFactors(int num) {
        int div = 2;
        while (num > 1) {
            if (num % div == 0) {
                System.out.println(div);
                num /= div;
            } else {
                div++;
            }
        }
    }

    public static void main(String[] args) {
        printPrimeFactors(100);
    }
}
