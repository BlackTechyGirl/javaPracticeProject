package chapterFive;

public class BreakTest {
    public static void main(String[] args) {
        int count = 0;

        for ( count = 0; count < 10; count++) {
            if(count == 5)break;
            System.out.printf("%d ", count);
        }
        System.out.printf("%nBroke out of loop at count = %d%n", count);
    }
}
