package org.example.Ejercicio2;

import java.util.function.IntConsumer;

public class Lambda {
    public static void printPrimeFactors(int num) {
        IntConsumer f = n -> {
            int div = 2;
            while (n > 1) {
                if (n % div == 0) {
                    System.out.println(div);
                    n /= div;
                } else {
                    div++;
                }
            }
        };
        f.accept(num);
    }

    public static void main(String[] args) {
        printPrimeFactors(100);
    }
}
