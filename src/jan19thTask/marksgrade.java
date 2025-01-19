package jan19thTask;

public class marksgrade {
    public static void main(String[] args) {
        /*
    Write a program that calculates and displays the letter grade for a given
    numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    F: 0-59

     */
        int mark = 59;
        String grade = (mark<=59)? "F": ((mark<=69)?"D":(mark<=79)?"C":(mark<=89)?"B":"A");

        System.out.println(grade);
    }



}
