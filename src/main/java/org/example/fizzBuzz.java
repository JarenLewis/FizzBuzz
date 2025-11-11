package org.example;

public class fizzBuzz {
    public static int fizzBuzzSolution() {

        int i = 0;

        for (i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            }
        }
        return i;
    }
}