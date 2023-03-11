
import java.util.Scanner;


public class GradeAverage {

    public static void main(String[] args){

        // declare constants
        final double Test_Weight=0.4;
        final double Midterm_Weight=0.25;
        final double Final_Weight=0.35;


        // Create the Scanner object in
        Scanner in = new Scanner(System.in);


        // enter test scores
        System.out.print("Enter test score #1: ");
        double score_one=in.nextDouble();
        System.out.print("Enter test score #2: ");
        double score_two=in.nextDouble();
        System.out.print("Enter test score #3: ");
        double score_three=in.nextDouble();


        // calculate test score average
        double average1=(score_one+score_two+score_three)/3;


        // enter midterm exam and final exam scores
        System.out.print("Enter Midterm exam score: ");
        double midterm_score=in.nextDouble();
        System.out.print("Enter Final exam score: ");
        double final_score=in.nextDouble();


        // calculate gpa
        double midaverage=midterm_score*Midterm_Weight;
        double finaleverage=final_score*Final_Weight;
        double testaverage=average1*Test_Weight;
        double gpa=midaverage+finaleverage+testaverage;


        // print grade average
        System.out.println();
        System.out.printf("Grade Average: "+"%.2f",gpa);


        // evaluating the letter grade
        char grade;
        if (gpa >=90)
        {
            grade = 'A';
        }
        else if (gpa>=80)
        {
            grade= 'B';
        }
        else if (gpa>=70)
        {
            grade= 'C';
        }
        else if (gpa>=60)
        {
            grade= 'D';
        }
        else
        {
            grade= 'F';
        }


        // display the grade
        System.out.println();
        System.out.print("Letter grade: "+grade);
        System.out.println();


        // display the message

        if (gpa>=70)
        {
            System.out.print("Good job. You met the prerequisite for the next course.");
        }
        else
        {
            System.out.print("I'm sorry. You will have to repeat the course before advancing.");
        }


        System.exit(0);
    }
}
