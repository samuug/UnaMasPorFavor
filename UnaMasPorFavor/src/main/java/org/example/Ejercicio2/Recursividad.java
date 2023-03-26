package org.example.Ejercicio2;

public class Recursividad {
    public static void f(int num, int div){
        if (num > 1) {
            if (num % div == 0) {
                System.out.println(div);
                f(num / div, div);
            } else {
                f(num, div + 1);
            }
        }
    }

    public static void main(String[] args) {
        f(100, 2);
    }
}
