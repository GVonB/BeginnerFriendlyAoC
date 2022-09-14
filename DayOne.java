/* 
 * New programmer friendly code for the Advent of Code 2021 day one problem.
 * Comments throughout should give brief explanations but any other questions
 * can be answered through Discord @Flyte#4032. 
 */

 // Necessary imports
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class DayOne {
    public static void main(String[] args) throws FileNotFoundException {
        try { // Try for safety
            // File name here determines where to get data from
            File dataFile = new File ("AoC/2021/dayOneInput.txt");
            //Scanner reads data from the file
            Scanner read = new Scanner(dataFile); // File object

            // Creates an array list to store all of the values
            ArrayList<Integer> data = new ArrayList<>();
            int i = 0;
            int increasingCounter = 0;
            while (read.hasNext()){ // Loop through all data
                data.add(read.nextInt()); // Adds the read value to the list
                try { // Forces the loop to skip on data position 0
                    if(data.get(i) > data.get((i-1))) {
                        increasingCounter++;
                    }
                } catch (Exception e) {
                    // Here to force a loop for the first data point which can't work
                }
                i++; // Moves to next data position
            }
            System.out.println(increasingCounter); // Part 1 solution prints

        } catch(Exception e) { // Shows when a runtime error occurs
            System.out.printf("A fatal error has occured."); // L
        }
    } // End Main
} // End Class
