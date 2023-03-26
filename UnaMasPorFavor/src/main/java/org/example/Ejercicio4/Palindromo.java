package org.example.Ejercicio4;

public class Palindromo {
    public static boolean isPalindromeRecursive(String str) {
        if (str.length() <= 1) {
            return true;
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            if (first == last) {
                String sub = str.substring(1, str.length() - 1);
                return isPalindromeRecursive(sub);
            } else {
                return false;
            }
        }
    }

    public static boolean isPalindromeIterative(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeRecursive("DABALEARROZALAZORRAELABAD"));
        System.out.println(isPalindromeIterative("DABALEARROZALAZORRAELABAD"));
    }
}
