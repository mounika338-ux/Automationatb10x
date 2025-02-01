package Feb1stTask;
import java.util.Scanner;
//TODO:  Convert Days into Years, Months, and Days.
//  Take the Days Input from the User
//  Define the conversion logic:
//      :- Assume 1 year = 365 days.
//      :- Assume 1 month = 30 days
//      :- Convert the Days into Years, Month and days and Print it.

public class ConversionofDays {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("print the days");
        int totaldays=Sc.nextInt();
        int years=totaldays/365;
        int remainingdays=totaldays%365;
        int months=remainingdays/30;
        int days = remainingdays %30;
        System.out.println(totaldays+"days="+years+"years="+months+"months="+days+"days.");
    }
}
