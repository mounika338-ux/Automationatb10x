package Feb1stTask;
import java.util.Scanner;
//Check if a Number is Divisible by 5 and 11
public class divisibleBy5and11 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=Sc.nextInt();
        if(n%5==0&&n%11==0){
            System.out.println(" number is divisible by 5 and 11");}
        else if(n%5==0&&n%11!=0){
            System.out.println("number is divisible by 5 not by 11");
        }else if(n%5!=0&&n%11==0){

            System.out.println("number is   divisible by 11 not by 5");
        }
            else{
                System.out.println("number is neither divisible by nor by 11");
            }
        }



    }

