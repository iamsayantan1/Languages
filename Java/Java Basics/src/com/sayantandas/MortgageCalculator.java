package com.sayantandas;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args)  {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate in %: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;

        System.out.print("Period (Years): ");
        byte noOfYears = scanner.nextByte();
        int noOfPayments = noOfYears * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow((1 + monthlyInterest),noOfPayments))
                / (Math.pow((1 + monthlyInterest),noOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);
    }
}