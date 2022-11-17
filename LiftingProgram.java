/*
    Name: LiftingProgram.java
    Author: Augustus Allred
    Created: 9/28/22
    Revised: 11/15/22
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
        float benchMax;
        float squatMax;
        float deadliftMax;
        float cleanMax;
        float bench;
        float squat;
        float deadlift;
        float clean;
        float percentage;

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
        percentage = 0.65f;
        bench = CalculateWeight(benchMax, percentage);
        squat = CalculateWeight(squatMax, percentage);
        deadlift = CalculateWeight(deadliftMax, percentage);
        clean = CalculateWeight(cleanMax, percentage);

        // TODO: Display results
        // TODO: Print entered maxes
        System.out.printf("%-10s %16.2f %s", "\nBench Max:", benchMax, " lbs\n");
        System.out.printf("%-10s %11.2f %s", "Back Squat Max:", squatMax, " lbs\n");
        System.out.printf("%-10s %13.2f %s", "Deadlift Max:", deadliftMax, " lbs\n");
        System.out.printf("%-10s %10.2f %s", "Power Clean Max:", cleanMax, " lbs\n");
        
        // TODO: Print a schedule for each week with corresponding weights
        // Print to a text file using PrintWriter
        // Open file
        workout.println("+----------------------------------------------------------+");
        workout.println("                " + name + "'s Lifting Program");
        workout.println("+----------------------------------------------------------+\n");

        workout.printf("%32s", "Week One\n");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Bench", "3 sets (5 reps each):", bench, "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Squat", "3 sets (5 reps each):", squat, "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Deadlift", "3 sets (5 reps each):", deadlift, "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Power Clean", "3 sets (5 reps each):", clean, "lbs");
        workout.println("+----------------------------------------------------------+");

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
    static float CalculateWeight(float lift, float percentage) {
        float calcLift;
        // Calculate weight for each lift based on passed percentage
        calcLift = lift * percentage;
        return calcLift;
    }
}