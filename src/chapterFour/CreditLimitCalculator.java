package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        int accountNumber = input.nextInt();
        System.out.print("Enter the balance at the beginning of the month: ");
        int balance = input.nextInt();
        System.out.println("Enter total of all items charged by the customer this month: ");
        int total = input.nextInt();
        System.out.println("Enter total of all credits applied to the customers account this month: ");
        int creditsApplied = input.nextInt();
        System.out.print("Enter your credit limit: ");
        int creditLimit = input.nextInt();

        int newBalance = balance + total - creditLimit;

        System.out.println("New Balance: " + newBalance);
        if (newBalance > creditLimit){
            System.out.println("Credit Limit exceeded");
        }else {
            System.out.println("You are good");
        }
}
