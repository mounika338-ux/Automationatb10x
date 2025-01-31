package jan30thTask;

public class SmallestOfTwo {
    //Find the Smallest of Two Numbers.
    public static void main(String[] args) {

        int num1=10, num2=3 ,num3=4;
        if(num1<=num2&&num1<=num3)
        {
            System.out.println(num1+"is smallest");
        }
        else if(num2<=num1&&num2<=num3)
        {
            System.out.println(num2+"is smallest");
        }
        else{
            System.out.println(num3+"is smallest");
        }
    }
}
