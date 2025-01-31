package jan30thTask;
import java.util.Scanner;
// Calculate Grade Based on Marks.
public class GradeMarks {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        System.out.println("print the grade");
        int marks=Sc.nextInt();
        if(marks>=90)
        { System.out.println(marks+" A");}
                else if(marks>=80){
            System.out.println(marks+"B");}
                else if(marks>=70){
            System.out.println(marks+"c");}
                else if(marks>=60){
            System.out.println(marks+"D");}

            else
            {
                System.out.println("E");
            }
        }



        }



