package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int sqare = number * number;
        if (number  == 100 && sqare == 100){
            System.out.println("The number and its square are equal to 100");
        }
        if (number  > 100 && sqare > 100){
            System.out.println("The number and its square are greater than 100");
        }
        if (number  < 100 && sqare < 100){
            System.out.println("The number and its square are less than 100");
        }
        if (number  != 100 && sqare != 100){
            System.out.println("The number and its square are not equal to 100");
        }
    }
}
