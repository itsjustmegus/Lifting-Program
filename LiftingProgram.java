/*
    Name: LiftingProgram.java
    Author: Augustus Allred
    Created: 9/28/22
    Revised: 10/20/22
    Purpose: Take maxes for lifts from the user, and create a lifting program for the user
*/

// TODO: Import scanner
import java.util.Scanner;
// Import the PrintWriter library
import java.io.PrintWriter;
// Import the IOException class to handle errors
import java.io.IOException;


public class LiftingProgram {
    public static void main(String[] args) throws IOException {
        // Define Scanner and PrintWriter
        Scanner input = new Scanner(System.in);
        PrintWriter workout = new PrintWriter("workout.txt");

        // TODO: Declare variables
        String name;
        int benchMax;
        int squatMax;
        int deadliftMax;
        int cleanMax;

        // TODO: Print the program title
        System.out.println("+--------------------------------------------+");
        System.out.println("|       Four-Week Workout Plan Builder       |");
        System.out.println("+--------------------------------------------+");

        // TODO: Get name from user
        System.out.print("Enter your name: ");
        name = input.nextLine();

        // TODO: Get maxes from user
        System.out.print("Enter your max weight for bench press: ");
        benchMax = input.nextInt();
        System.out.print("Enter your max weight for back squat: ");
        squatMax = input.nextInt();
        System.out.print("Enter your max weight for deadlift: ");
        deadliftMax = input.nextInt();
        System.out.print("Enter your max weight for power clean: ");
        cleanMax = input.nextInt();
        
        // TODO: Print entered maxes
        System.out.printf("%-10s %14s %n", "\nBench Max:", benchMax + " lbs");
        System.out.printf("%-10s %9s %n", "Back Squat Max:", squatMax + " lbs");
        System.out.printf("%-10s %11s %n", "Deadlift Max:", deadliftMax + " lbs");
        System.out.printf("%-10s %8s %n", "Power Clean Max:", cleanMax + " lbs");

        // TODO: Calculate weights for each lift for each week

        
        // TODO: Print a schedule for each week with corresponding weights
        // Print to a text file using PrintWriter
        // Open file
        workout.println(name);
        workout.println("This is your bench max: " + benchMax + " lbs");
        workout.println("This is your back squat max: " + squatMax + " lbs");

        // Close file
        workout.close();

        // Tell the user that the plan has been printed to the text file
        System.out.println("\nSuccessfully written to workout.txt");

    }
}