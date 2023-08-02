package com.sayantandas;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args)  {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal;
        float annualInterest;
        float monthlyInterest;
        byte noOfYears;
        int noOfPayments;
        double mortgage;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Principal (₹1K - ₹10L): ");
            principal = scanner.nextInt();
            if ( principal >= 1_000 && principal <= 10_00_000 )  {
                break;
            }
            System.out.println("Enter a number between 1,000₹ and 10,00,000₹.");
        }

        while (true) {
            System.out.print("Annual Interest Rate in %: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30) {
                monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }

        while (true) {
            System.out.print("Period (Years): ");
            noOfYears = scanner.nextByte();
            if (noOfYears > 0 && noOfYears <= 30)   {
                noOfPayments = noOfYears * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        mortgage = principal
                * (monthlyInterest * Math.pow((1 + monthlyInterest),noOfPayments))
                / (Math.pow((1 + monthlyInterest),noOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);
    }
}