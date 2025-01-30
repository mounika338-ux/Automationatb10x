package jan29thTask;
import java.util.Scanner;

public class VowelOrConsonant {
    //Check if a Character is a Vowel or Consonant

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a character");
        char character = Sc.next().charAt(0);

        if (character == 'a' ||character == 'e' ||character == 'i' ||character == 'o' ||character == 'u'){
            System.out.println("its Vowels");
        } else {
            System.out.println("its consonant");
        }


    }

}
