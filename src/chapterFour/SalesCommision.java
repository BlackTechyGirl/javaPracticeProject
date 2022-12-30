package chapterFour;

import java.util.Scanner;

public class SalesCommision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Enter item number or -1 to exit
                 Items    Price
                1        239.99
                2        129.75
                3        99.95
                4        350.89
                """);
        int item = input.nextInt();
        System.out.println("Enter item price or -1 to exit");
        double price = input.nextDouble();

        int total = 0;
        double commission = 0.09;

        while (price != -1) {
            total += price;

            System.out.println("""
                Enter item number
                 Items    Price
                1        239.99
                2        129.75
                3        99.95
                4        350.89
                """);
            item = input.nextInt();
            System.out.println("Enter item price");
            price = input.nextDouble();
        }
        double salary = 200 + (total * commission);

        System.out.printf("Your salary is %.2f", salary);
    }
}
