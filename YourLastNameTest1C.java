// import java.sql.Array
import java.util.Random;

// import the scanner
import java.util.Scanner;

/**
 * @author Nethmee Perera Dawatage
 * @version 06/30/2022
 */

public class YourLastNameTest1C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // print out the panther id last 4 digits, first and last name

        String FirstName="Nethmee";
        String LastName="Perera Dawatage";
        int pantherID_4digits = 1030;

        System.out.println("My name is "+FirstName+" "+LastName+ " and last 4 digits of my panther ID is "+pantherID_4digits);

        int N=0; // last digit of the panther ID


        System.out.print("Please enter the column size: ");
        int column_size= in.nextInt();

        // create 2D array
        double[][] m=new double[N+6][column_size];

        Random random=new Random();
        for(int i=0;i<m.length;i++)
            for (int j=0;j<m[0].length;j++)
                m[i][j]=6+random.nextInt(16);

        // create another 2D array
        double[][] mc={{3,3,3},{3,0,1},{3,6,3}};

        //pass the above array m and mc, to call following methods
        MinCol(m);
        MinCol(mc);

        System.out.println ("the average of array m is: " + returnLast2RowAvg(m));
        System.out.println ("the average of array mc is: " + returnLast2RowAvg(mc));
    }


    private static double returnLast2RowAvg(double[][] m) {
        double avg=0;
        for(int i=0;i<m[0].length;i++) {
            avg += m[m.length - 2][i];
            avg += m[m.length - 1][i];
        }
        // return the average
        return avg/(2*m[0].length);
    }

    private static void MinCol(double[][] m) {
        double minSum=Integer.MAX_VALUE;
        for(int i=0;i<m[0].length;i++)
        {
            double sum=0;
            for(int j=0;j<m.length;j++)
                sum += m[j][i];
            // update min sum
            if(minSum > sum){
                minSum=sum;
            }

        }
        // print minimum column sum
        System.out.println("Minimum column sum is "+ minSum);

    }
}



