package jan29thTask;
import java.util.Scanner;
//Check if a Number is Even or Odd

public class EvenOdd {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("number");
        int num= Sc.nextInt();
        if(num%2==0)
        {
            System.out.println( "even");}

            else
            {
                System.out.println("odd");
            }
            Sc.close();

        }

    }

