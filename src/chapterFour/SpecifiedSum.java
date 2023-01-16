package chapterFour;

import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a target: ");
        int target = input.nextInt();
        int sum = 0;

        while(sum < target) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            sum += number;
            if(sum >= target) {
                System.out.println("The number is greater than or equal to the target "+sum);
            }
        }
    }
}
