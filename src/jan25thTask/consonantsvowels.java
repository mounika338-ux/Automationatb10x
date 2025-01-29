package jan25thTask;


public class consonantsvowels {
    public static void main(String[] args) {
        // Count vowels and consonants in a String.  -pramod, → vowels - 2, consonants - 4
        String s= "monika";
        String Vowels="aeiou";
        int v=0;
        int c=0;
        for (int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);

            if(Character.isLetter(ch)) {

               if (Vowels.indexOf(ch)!=-1) {
                v++;
            }

                else
                {
                    c++;
                }
            }
            {
                System.out.println("Vowels: " + v + ", Consonants: " + c);
            }}}}



