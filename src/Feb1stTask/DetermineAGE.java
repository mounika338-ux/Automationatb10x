package Feb1stTask;
import java.util.Scanner;
/* Find if a Person is Senior Citizen Based on Age.
 :- take the age input from the user.

Implement Age Category Logic:

Define the criteria for different age categories:

Child: Age 0 to 12

Teenager: Age 13 to 19

Adult: Age 20 to 64

Senior Citizen: Age 65 and older*/

public class DetermineAGE {
    public static void main(String[] args) {
        Scanner Sc =new Scanner (System.in);
        System.out.println(" enter the age");
        int  age=Sc.nextInt();
         if(age<0){
             System.out.println("enter valid age");
         }else if( age>=0&&age<=12){
             System.out.println("child");
         }else if(age>=13&&age<=19){
             System.out.println("teenager");
         }else if(age>=20&&age<=64){
             System.out.println("adult");
         }else{
             System.out.println("senior citizen");
         }
    }
}
