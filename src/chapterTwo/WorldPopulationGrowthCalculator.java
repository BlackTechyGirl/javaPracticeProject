package chapterTwo;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter current world population: ");
        long population = input.nextInt();

        System.out.println("Enter annual world population growth rate: ");
        double growthRate = input.nextDouble();

        for (int i = 1; i <=5 ; i++, population*=growthRate) {
            System.out.printf("%d years = %02d%n", i, population);
        }
    }
}
