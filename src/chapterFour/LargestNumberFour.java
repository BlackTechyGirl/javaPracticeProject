package chapterFour;

import java.util.Scanner;

public class LargestNumberFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int largest = 0;
        int secondLargest = 0;

        while (counter < 10){
            System.out.println("Enter the number of units sold: ");
            int number = input.nextInt();
            if (number > largest){
                secondLargest = largest;
                largest = number;
            }else
            if (number > secondLargest){
                    secondLargest = number;
            }
            counter++;
            }
        System.out.println("The largest number of units sold is " + largest);
        System.out.println("The second largest number of units sold is " + secondLargest);
        }

    }
