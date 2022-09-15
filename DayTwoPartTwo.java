/* 
 * New programmer friendly code for the Advent of Code 2021 day one problem.
 * Comments throughout should give brief explanations but any other questions
 * can be answered through Discord @Flyte#4032. 
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DayTwoPartTwo {
    public static void main(String[] args) throws FileNotFoundException{
        // Import input data file
        File rawData = new File("AoC/2021/dayTwoInput.txt");
        // Setup scan from file
        Scanner read = new Scanner(rawData);

        // Initialize variables
        String direction;
        int quantity;
        int aim = 0; //     <------------
        int depth = 0; //      <------------------------------------
        int totalHorizontal = 0; // All 3 must be 0 so first loop doesn't break

        // Run initial loop and continue to run as long as there is data
        do {
            // Read the word data
            direction = read.next();
            // Read the numerical value
            quantity = read.nextInt();

            // Determine how to interpret the distance
            if (direction.equals("forward")) { // Forward
                totalHorizontal = totalHorizontal + quantity;
                depth = depth + (aim * quantity);
            }
            else if (direction.equals("down")) { // Down
                aim = aim + quantity;
            }
            else if (direction.equals("up")) { // Up
                aim = aim - quantity;
            }
        } while (read.hasNext()); // Runs while readable data exists

        // Output final answer for part one
        System.out.println(depth * totalHorizontal);
    } // End main
} // End class
