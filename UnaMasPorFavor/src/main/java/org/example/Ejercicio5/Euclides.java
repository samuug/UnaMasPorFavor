package org.example.Ejercicio5;
import java.util.function.BiFunction;
public class Euclides {
    public static int mcdRecursive(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return mcdRecursive(n, m % n);
        }
    }

    public static int mcdIterative(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    public static BiFunction<Integer, Integer, Integer> mcdLambda = (m, n) -> {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    };
    public static void main(String[] args) {
        System.out.println(mcdRecursive(54, 24));
        System.out.println(mcdIterative(54, 24));
        System.out.println(mcdLambda.apply(54, 24));
    }
}
