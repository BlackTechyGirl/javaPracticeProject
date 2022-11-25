package chapterTwo;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = input.nextInt();

        System.out.println("Enter the second number: ");
        int second = input.nextInt();

        System.out.println("Enter the third number: ");
        int third = input.nextInt();

        System.out.println("Enter the fourth number: ");
        int fourth = input.nextInt();

        System.out.println("Enter the fifth number: ");
        int fifth = input.nextInt();

        int smallest = Math.min(first, Math.min(second, Math.min(third, Math.min(fourth, fifth))));
        int largest = Math.max(first, Math.max(second, Math.max(third, Math.max(fourth, fifth))));

        System.out.println("Smallest: "+smallest);
        System.out.println("Largest: "+largest);
    }
}
