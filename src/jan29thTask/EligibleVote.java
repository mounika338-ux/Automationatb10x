package jan29thTask;
import java.util.Scanner;

public class EligibleVote {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("eligible to vote");
        int num=Sc.nextInt();
        if(num>=18)
        {System.out.println("eligible");}

            else
            {
                System.out.println("not eligible");
            }

        }
    }

