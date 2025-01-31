package jan30thTask;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close(); // Close scanner after taking input

        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return; // Exit early
        }

        boolean isPrime = true;

        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) { // Found a divisor
                isPrime = false;
                break; // No need to check further
            }
        }

        // Print result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}




