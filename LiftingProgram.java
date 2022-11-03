/*
    Name: LiftingProgram.java
    Author: Augustus Allred
    Created: 9/28/22
    Revised: 11/3/22
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
        double benchMax;
        double squatMax;
        double deadliftMax;
        double cleanMax;
        double bench;
        double squat;
        double deadlift;
        double clean;

        // Call title method
        printTitle();

        // TODO: Get name from user
        System.out.print("Enter your name: ");
        name = input.nextLine();

        // TODO: Method to get benchMax from user
        System.out.print("Enter your max weight for bench press: ");
        benchMax = input.nextInt();

        // TODO: Method to get squatMax from user
        System.out.print("Enter your max weight for squat: ");
        squatMax = input.nextInt();

        // TODO: Method to get deadliftMax from user
        System.out.print("Enter your max weight for deadlift: ");
        deadliftMax = input.nextInt();

        // TODO: Method to get cleanMax from user
        System.out.print("Enter your max weight for power clean: ");
        cleanMax = input.nextInt();

        // Call calculation methods
        // Week 1 calculations
        bench = CalculateWeight(benchMax, 0.65);
        squat = CalculateWeight(squatMax, 0.65);
        deadlift = CalculateWeight(deadliftMax, 0.65);
        clean = CalculateWeight(cleanMax, 0.65);

        // TODO: Display results
        // TODO: Print entered maxes
        System.out.printf("%-10s %14s %n", "\nBench Max:", benchMax + " lbs");
        System.out.printf("%-10s %9s %n", "Back Squat Max:", squatMax + " lbs");
        System.out.printf("%-10s %11s %n", "Deadlift Max:", deadliftMax + " lbs");
        System.out.printf("%-10s %12s %n", "Power Clean Max:", cleanMax + " lbs");
        
        // TODO: Print a schedule for each week with corresponding weights
        // Print to a text file using PrintWriter
        // Open file
        workout.println(name);
        workout.printf("%-10s %14s %n", "\nThis is your first calculated bench:", bench + " lbs");
        workout.printf("%-10s %9s %n", "\nThis is your first calculated squat:", squat + " lbs");
        workout.printf("%-10s %11s %n", "\nThis is your first calculated deadlift:", deadlift + " lbs");
        workout.printf("%-10s %12s %n", "\nThis is your first calculated power clean:", clean + " lbs");

        // Close file
        workout.close();

        // Tell the user that the plan has been printed to the text file
        System.out.println("\nSuccessfully written to workout.txt");
    }

    // TODO: Print the program title
    static void printTitle() {
        System.out.println("+--------------------------------------------+");
        System.out.println("|       Four-Week Workout Plan Builder       |");
        System.out.println("+--------------------------------------------+");
    }

    // TODO: Method to calculate weights for each lift for each week
    static double CalculateWeight(double lift, double percentage) {
        double calcLift;
        // Calculate weight for each lift based on passed percentage
        calcLift = lift * percentage;
        return calcLift;
    }
}