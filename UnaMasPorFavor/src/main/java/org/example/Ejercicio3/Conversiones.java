package org.example.Ejercicio3;

import java.util.function.BiFunction;

public class Conversiones {
    public static String decimalToHex(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int rem = num % 16;
            char hexDigit = (rem < 10) ? (char)('0' + rem) : (char)('A' + rem - 10);
            sb.append(hexDigit);
            num /= 16;
        }
        return sb.reverse().toString();
    }

    public static String decimalToBase(int num, int B) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int rem = num % B;
            char digit = (rem < 10) ? (char)('0' + rem) : (char)('A' + rem - 10);
            sb.append(digit);
            num /= B;
        }
        return sb.reverse().toString();
    }

    BiFunction<Integer, Integer, String> decimalToBaseLambda = (num, B) -> {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int rem = num % B;
            sb.append(rem);
            num /= B;
        }
        return sb.reverse().toString();
    };

    public static void main(String[] args) {
        System.out.println(decimalToHex(65029));
        System.out.println(decimalToBase(65029, 16));
        System.out.println(decimalToBase(65029, 16));
    }
}
