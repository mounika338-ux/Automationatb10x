package jan29thTask;
import java.util.Scanner;
// Find the Maximum of Two Numbers

public class MaximumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" first number");
        int num1 =sc.nextInt();
        System.out.println("second number");
        int num2=sc.nextInt();

        int Maximum =(num1>num2 ) ? num1:num2;
        System.out.println("is"+Maximum);

}}
