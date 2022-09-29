/*
    Name: LiftingProgram.java
    Author: Augustus Allred
    Created: 9/28/22
    Revised: 9/29/22
    Purpose: Take maxes for lifts from the user, and create a lifting program for the user
*/

// TODO: Import scanner
import java.util.Scanner;

public class LiftingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO: Declare variables
        int benchMax;
        int squatMax;
        int deadliftMax;
        int cleanMax;

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

        // TODO: Use a loop and calculate weights for each lift for each week
        
        // TODO: Print a schedule for each week with corresponding weights

    }
}
