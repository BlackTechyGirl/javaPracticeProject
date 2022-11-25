package chapterTwo;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = input.nextInt();

        System.out.println("Enter second number: ");
        int second = input.nextInt();

        System.out.println("Enter third number: ");
        int third = input.nextInt();

        int sum = first+second+third;
        int average = sum/3;
        int product = first*second*third;
        int smallest = Math.min(first, Math.min(second, third));
        int largest = Math.max(first, Math.max(second, third));

        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
        System.out.println("Product: "+product);
        System.out.println("Smallest: "+smallest);
        System.out.println("Largest: "+largest);
    }

    public int addNumbers(int first, int second, int third) {
        return 0;
    }
}
