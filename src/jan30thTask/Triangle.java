package jan30thTask;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // Step 1: Take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();


        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }

}
