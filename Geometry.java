

import java.util.Scanner;

public class Geometry {



    public static void main(String args[]) {

        // import scanner
        Scanner in = new Scanner(System.in);

        // showing the display menu
        displayMenu();
        System.out.println("Enter your choice 1-3: ");
        int choice = in.nextInt();


        while(choice<1 || choice>3)
        {
            System.out.println("Invalid Choice. Enter correct choice 1-3: ");
            choice = in.nextInt();
        }

        selectOption(choice);
        System.out.println("Thanks for using Geometry Calculator - Goodbye! ");
    }


    //displayMenu method
    public static void displayMenu() {
        System.out.println("Welcome to the Geometry Calculator Application");
        System.out.println("1. Calculate the Area of Circle");
        System.out.println("2. Calculate the Area of Rectangle");
        System.out.println("3. Calculate the Area of Triangle");
    }


    //circle method
    public static double circle() {
        Scanner in=new Scanner(System.in);
        System.out.println("What is the circle's radius? ");
        double radius=in.nextDouble();
        double circleArea=Math.PI*Math.pow(radius,2);
        return circleArea;
    }


    //rectangle method
    public static double rectangle()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the rectangle's length?");
        double rectangleArea;
        double length = in.nextDouble();
        System.out.println("Whats is the rectangle's width?");
        double width = in.nextDouble();
        rectangleArea = length * width;
        return rectangleArea;
    }


    //triangle method
    public static double triangle()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the length of the triangle?");
        double triangleArea;
        double length = in.nextDouble();
        System.out.println("What is the triangle's height?");
        double height = in.nextDouble();
        triangleArea = (length * height) / 2;
        return triangleArea;
    }



    //option method and print areas
    public static void selectOption(int choice)
    {
        if(choice==1)

        {
            double circleArea=circle();
            System.out.println("The area is "+Math.round(circleArea));
        }

        else if(choice==2)

        {
            double rectangleArea = rectangle();
            System.out.println("The area is "+rectangleArea);
        }

        else if(choice==3)

        {
            double triangleArea = triangle();
            System.out.println("The area is "+triangleArea);
        }

        System.exit(0);
    }
}
