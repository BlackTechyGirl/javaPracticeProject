package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {

        System.out.printf("%s %8s %8s %8s%n", "N", "N2", "N3", "N4");
        for (int count = 1; count <= 5 ; count++) {
            for (int i = 0; true; i++) {
            System.out.printf("%d %8d %8d %8d",
                    count, count*count, count*count*count,
                    count*count*count*count);
                break;
            }
//            System.out.printf("%d %n", count);
//            System.out.printf("%d", count*count);
            System.out.println();
        }
    }
}
