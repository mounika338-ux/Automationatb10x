package Feb5thTask;
// Calculate sum of first 10 natural numbers using while

public class whileloopSum {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        while(i<=10){
            sum+=i;
            i++;
        }
        System.out.println("sum of first 10 numbers:"+sum);


    }
}
