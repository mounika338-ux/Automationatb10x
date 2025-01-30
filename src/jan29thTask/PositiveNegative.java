package jan29thTask;
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        // Check if a Number is Positive or Negative
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(" positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        sc.close();
    }
}

