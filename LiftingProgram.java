/*
    Name: LiftingProgram.java
    Author: Augustus Allred
    Created: 9/28/22
    Revised: 12/7/22
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
        // Initialize constant for array size
        final int SIZE = 4;
        String name;
        float benchMax;
        float squatMax;
        float deadliftMax;
        float cleanMax;
        // Initialize array variables
        float[] bench = new float[SIZE];
        float[] squat = new float[SIZE];
        float[] deadlift = new float[SIZE];
        float[] clean = new float[SIZE];
        float[] percentage = new float[SIZE];

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
        // Weekly calculations
        // Each week's percentage
        percentage[0] = 0.65f;
        percentage[1] = 0.75f;
        percentage[2] = 0.85f;
        percentage[3] = 1.00f;

        // for loop to calculate each week's weight for each lift using arrays
        for (int i = 0; i < 4; i++) {
            bench[i] = benchMax * percentage[i];
            squat[i] = squatMax * percentage[i];
            deadlift[i] = deadliftMax * percentage[i];
            clean[i] = cleanMax * percentage[i];
        }

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
        workout.println("+----------------------------------------------------------+\n\n\n");

        workout.printf("%32s", "Week One\n");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Bench", "4 sets (6 reps each):", bench[0], "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Squat", "4 sets (6 reps each):", squat[0], "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Deadlift", "4 sets (6 reps each):", deadlift[0], "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Power Clean", "4 sets (6 reps each):", clean[0], "lbs");
        workout.println("+----------------------------------------------------------+\n\n\n");

        workout.printf("%32s", "Week Two\n");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Bench", "4 sets (5 reps each):", bench[1], "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Squat", "4 sets (5 reps each):", squat[1], "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Deadlift", "4 sets (5 reps each):", deadlift[1], "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Power Clean", "4 sets (5 reps each):", clean[1], "lbs");
        workout.println("+----------------------------------------------------------+\n\n\n");

        workout.printf("%32s", "Week Three\n");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Bench", "2 sets (3 reps each):", bench[2], "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Squat", "2 sets (3 reps each):", squat[2], "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Deadlift", "2 sets (3 reps each):", deadlift[2], "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Power Clean", "2 sets (3 reps each):", clean[2], "lbs");
        workout.println("+----------------------------------------------------------+\n\n\n");

        workout.printf("%32s", "Week Four\n");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Bench", "1 sets (1 reps each):", bench[3], "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Squat", "1 sets (1 reps each):", squat[3], "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Deadlift", "1 sets (1 reps each):", deadlift[3], "lbs");
        workout.println("+----------------------------------------------------------+");
        workout.printf("|  %11s |  %-21s  | %8.2f  %3s   |%n", "Power Clean", "1 sets (1 reps each):", clean[3], "lbs");
        workout.println("+----------------------------------------------------------+\n\n\n");

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
}
