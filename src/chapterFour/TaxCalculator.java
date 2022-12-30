package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your earnings: ");
        double earnings = input.nextDouble();

        double baseTaxRate = 0.15;
        double additionalTaxRate = 0.20;
        double minimumEarning = 30_000;

        if (earnings <= minimumEarning){
            double taxAmount = earnings * baseTaxRate;
            System.out.println(name + "Your tax rate is " + taxAmount);
        }else {
           double baseTax = minimumEarning * baseTaxRate;
           double excess = earnings - minimumEarning;
           double taxAmount = excess * additionalTaxRate + baseTax;
            System.out.println(name + "Your tax rate is " + taxAmount);
        }
    }
}
