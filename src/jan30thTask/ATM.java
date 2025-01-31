package jan30thTask;
import java.util.Scanner;


public class ATM {
    public static void main(String[] args) {
        int balance=10000;
        Scanner Sc =new Scanner(System.in);
        int amount =Sc.nextInt();
        if(amount <=0){
            System.out.println("invalid");}

        else if(amount%100!=0){
            System.out.println("invalid amount");

        }else if(amount>balance){
            System.out.println("insufficient");
        }else{ balance-=amount;

            System.out.println("successful!remaining balance");
        }

}}