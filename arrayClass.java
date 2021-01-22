import java.util.Arrays;
import java.util.Scanner;

public class arrayClass {
    public static double[] createArray(Scanner s) {
        int n;
        System.out.println("How many elements in the array?");
        n = s.nextInt();
        System.out.println("You chose: " + n + " ... Enter " + n + " double(s)");
        //Create the array with the size of 'n'
        double a[] = new double[n];
        //Collect input
        for(int i = 0; i < n; i++) {
            a[i] = s.nextDouble();
        } return a;
    }
    public static void displaySortedNumbers(double a[]) {
        Arrays.sort(a);
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(a));
    }
}
