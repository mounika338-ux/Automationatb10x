package jan30thTask;
import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("print the leap year");
        int year=Sc.nextInt();
        if((year % 400==0)||(year %4==0&& year %100!=0)){
            System.out.println(year+"is leap year");
        }else{
            System.out.println(year+"not a leap year");
        }


    }
}
