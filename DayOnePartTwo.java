/* 
 * New programmer friendly code for the Advent of Code 2021 day one problem.
 * Comments throughout should give brief explanations but any other questions
 * can be answered through Discord @Flyte#4032. 
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DayOnePartTwo {
    public static void main(String[] args) throws FileNotFoundException{
        // Import input data file
        File rawData = new File("AoC/2021/dayOneInput.txt");
        // Setup scan from file
        Scanner read = new Scanner(rawData);

        // Create all variables needed
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int fourthNum = 0;
        int firstGroupSum = 0;
        int secondGroupSum = 0;
        int sumIncreaseCount = 0;

        do{
            // Update all variables each new data input
            firstNum = secondNum;
            secondNum = thirdNum;
            thirdNum = fourthNum;
            fourthNum = read.nextInt();

            // Total the 3 values for the 2 groups
            firstGroupSum = firstNum + secondNum + thirdNum;
            secondGroupSum = secondNum + thirdNum + fourthNum;
            
            // Check if there is an increase, excluding the initial zeroes
            if (firstGroupSum != 0 && firstNum != 0 && secondGroupSum != 0) {
                if (firstGroupSum < secondGroupSum) {
                    sumIncreaseCount += 1; // Count the increases
                }
            }
           
        } while (read.hasNextInt()); 
        
        System.out.println(sumIncreaseCount); // Output answer
    }
}
