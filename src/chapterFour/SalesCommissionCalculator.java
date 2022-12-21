package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Items    Price
                1        239.99
                2        129.75
                3        99.95
                4        350.89
                """);
        int item = input.nextInt();

        System.out.println("Enter the amount of the item: ");
        double amount = input.nextDouble();

        double total = 0;
        double commission = 0.09;

        while (amount != -1){
            total += amount;

            System.out.println("""
                Items    Price
                1        239.99
                2        129.75
                3        99.95
                4        350.89
                """);
            item = input.nextInt();

            System.out.println("Enter the amount of the item: ");
            amount = input.nextDouble();
        }
        double earnings = (total * commission) + 200;
        System.out.printf("The total earning is: %.2f", earnings);
    }
}