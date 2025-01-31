package jan30thTask;
import java.util.Scanner;
//Check if a Character is an Alphabet.

public class CheckCharacter {
    public static void main(String[] args) {
        Scanner Sc =new Scanner (System.in);
        System.out.println("print character");
        Character ch=Sc.next().charAt(0);
        if(ch.isLetter(ch)){
            System.out.println(ch+"is alphabet");}
        else{
            System.out.println(ch+"not alphabet");
        }


    }
}
