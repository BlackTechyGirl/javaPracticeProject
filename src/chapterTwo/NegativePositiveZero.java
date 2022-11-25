package chapterTwo;

import java.util.Scanner;

public class NegativePositiveZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negatives = 0;
        int positives = 0;
        int zeros = 0;
        int counter = 0;

        while (counter < 5){
        System.out.println("Enter number: ");
            int number = input.nextInt();
            if (number == 0) zeros++;
            else if (number>0) positives++;
            else  negatives++;
            counter++;
        }
        System.out.println("Positive integers: "+positives);
        System.out.println("Negative integers: "+negatives);
        System.out.println("Zeros: "+zeros);
    }
}
