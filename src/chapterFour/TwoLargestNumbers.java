package chapterFour;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        int firstLargest = 0;
        int secondLargest = 1;
        int counter = 0;
        Scanner input = new Scanner(System.in);

        while (counter < 10){
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if(number > firstLargest){
                secondLargest = firstLargest;
                firstLargest = number;
            }
            else if(number > secondLargest){
                secondLargest = number;
            }
            counter++;
        }
        System.out.println("Largest number is "+firstLargest+ "\nSecond Largest number is "+secondLargest);
    }
}
