package com.sayantandas;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();
        if(number % 15 == 0)    {
            System.out.println("FizzBuzz");
        }
        else if(number % 5 == 0)   {
            System.out.println("Fizz");
        }
        else if(number % 3 == 0)  {
            System.out.println("Buzz");
        }
    }
}
