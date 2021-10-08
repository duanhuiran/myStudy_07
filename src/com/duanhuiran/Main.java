package com.duanhuiran;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal;
        double annulRate;
        double years;

        while (true){
            System.out.print("Principal ($1K - $1M):");
            principal = input.nextDouble();
                if (principal < 1_000 || principal >1_000_000){
                    System.out.println("Input $1k - $1M Please.");
                    continue;
                }
                else
                    break;
        }

        while (true){
            System.out.print("Annul Interest Rate (0 - 10):");
            annulRate = input.nextDouble();
            if (annulRate < 0 || annulRate >10){
                System.out.println("Input 0 - 10 Please.");
                continue;
            }
            else
                break;
        }

        while (true){
            System.out.print("Years (0 - 30):");
            years = input.nextDouble();
            if (years < 0 || years >30){
                System.out.println("Input 0 - 30 Please.");
                continue;
            }
            else
                break;
        }
        final byte monthsInYear = 12;
        final byte percentDived = 100;

        double rateMonthly = annulRate / monthsInYear / percentDived;
        double peridMonths = years * monthsInYear;
        double mortgageWithoutFormat = principal * rateMonthly * Math.pow((1 + rateMonthly),peridMonths)
                / (Math.pow((1 + rateMonthly),peridMonths) - 1);
        String mortgage = NumberFormat.getCurrencyInstance(Locale.US).format(mortgageWithoutFormat);
        System.out.println(mortgage);






    }
}
