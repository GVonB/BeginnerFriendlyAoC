/* 
 * New programmer friendly code for the Advent of Code 2021 day one problem.
 * Comments throughout should give brief explanations but any other questions
 * can be answered through Discord @Flyte#4032. 
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DayTwo {
    public static void main(String[] args) throws FileNotFoundException{
        // Import input data file
        File rawData = new File("AoC/2021/dayTwoInput.txt");
        // Setup scan from file
        Scanner read = new Scanner(rawData);

        // Initialize variables
        String direction;
        int distance;
        int depth = 0;//      <------------------------------------
        int totalHorizontal = 0; // Both must be 0 so first loop doesn't break

        // Run initial loop and continue to run as long as there is data
        do {
            // Read the word data
            direction = read.next();
            // Read the distance
            distance = read.nextInt();

            // Determine how to interpret the distance
            if (direction.equals("forward")) { // Forward
                totalHorizontal = totalHorizontal + distance;
            }
            else if (direction.equals("down")) { // Down
                depth = depth + distance;
            }
            else if (direction.equals("up")) { // Up
                depth = depth - distance;
            }
        } while (read.hasNext()); // Runs while readable data exists

        // Output final answer for part one
        System.out.println(depth * totalHorizontal);
    } // End main
} // End class
