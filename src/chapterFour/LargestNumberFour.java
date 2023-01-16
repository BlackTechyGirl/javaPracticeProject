package chapterFour;

import java.util.Scanner;

public class LargestNumberFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int largest = 0;

        System.out.println("Enter the number of units sold: ");
        int number = input.nextInt();

        while (counter < 10){
            if (number > largest){
                largest = number;
            }
            counter++;
            System.out.println("Enter the number of units sold: ");
            number = input.nextInt();
        }
        System.out.println("The largest number of units sold is " + largest);
    }

}
