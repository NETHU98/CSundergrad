package edu.gsu.csc1301.resortaccommodations;
import java.util.Scanner;

/**
 * @author nethmeeperera
 * @version 10/26/2021
 */

public class ResortAccommodations {

    public static void main(String[] args) {

        // Create the Scanner object in
        Scanner in = new Scanner(System.in);


        // declare variables
        int total_rooms=0;
        int occupied_rooms=0;


        System.out.print("How many floors does the resort have? ");
        int floors = 0;
        while (floors <= 0)
        {

            // input floors
            floors = in.nextInt();
            if (floors >= 1)
            {
                break;
            }
            else{
                System.out.print("Invalid. Enter 1 or more: ");
            }
        }


        // for loop

        for (int i=0; i<floors; i++)
        {
            int rooms = 0, occ_room = 0;
            System.out.print("How many rooms does floor " + (i+1) + " have? ");
            while (rooms < 10)
            {
                // input number rooms
                rooms = in.nextInt();
                if (rooms >= 10)
                {
                    total_rooms += rooms;
                    System.out.print("How many occupied rooms does floor " + (i+1) + " have? ");
                    occ_room = in.nextInt();
                    occupied_rooms += occ_room;
                    break;
                }
                else{
                    System.out.print("Invalid. Enter 10 or more: ");
                }
            }
        }



        // calculate rates and rooms
        int v_rooms = (total_rooms - occupied_rooms);
        double rate = (double)(occupied_rooms * 100) / total_rooms;


        // set  2 decimal points
        String occupancy_rate = String.format("%.2f", rate);


        // Output
        System.out.println("\nNumber of rooms: " + total_rooms);
        System.out.println("Occupied rooms: " + occupied_rooms);
        System.out.println("Vacant rooms: " + v_rooms);
        System.out.println("Occupancy rate: " + occupancy_rate + "%");

        System.exit(0);
    }
}


