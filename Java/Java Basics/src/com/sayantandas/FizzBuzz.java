package com.sayantandas;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Press 1 to start FizzBuzz Game else press any number to end: ");
        number = sc.nextInt();
        if(number == 1) {
            while (!(number == 404)) {
                System.out.print("Number: ");
                number = sc.nextInt();
                if (number % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else if (number % 5 == 0) {
                    System.out.println("Fizz");
                } else if (number % 3 == 0) {
                    System.out.println("Buzz");
                }
            }
        }
        System.out.println("Game Over...");
    }
}
