package chapterSeven;

public class SumArray {
    public static void main(String[] args) {
        int [] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        for (int i : array) {
            total += i;
        }
        System.out.printf("The total is %d", total);
    }
}
