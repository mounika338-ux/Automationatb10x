package jan25thTask;

public class reversename {
    public static void main(String[] args) {
        //Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)


        String s = "monika";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {


            rev = rev + s.charAt(i);
        }
        {
            System.out.println(rev);
        }
    }
}