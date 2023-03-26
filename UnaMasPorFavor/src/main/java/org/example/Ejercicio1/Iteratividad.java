package org.example.Ejercicio1;

public class Iteratividad {
    static final double N = 2;
    static final double PREC = 1e-6;

    static double f(double x) {
        return Math.pow(x, N) - N;
    }

    static double bisect(double min, double max) {
        while (max - min >= PREC) {
            double med = (min + max) / 2;
            if (f(min) * f(med) < 0) {
                max = med;
            } else {
                min = med;
            }
        }
        return (min + max) / 2;
    }

    public static void main(String[] args) {
        System.out.println(bisect(0, N));
    }
}
