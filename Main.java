import java.util.Scanner;

public class Main extends arrayClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a[] = createArray(s);
        displaySortedNumbers(a);
    }
}
