// HouseholdSize.java - This program uses a bubble sort to arrange up to 300 household sizes in
// descending order and then prints the mean and median household size. 
// Input:  Interactive.
// Output:  Mean and median household size. 

import java.util.Scanner;

public class HouseholdSize {

    public static void displayArray(int[] householdSizes, int size){

        for (int i=0; i<size; i++) {

            // Moves the Cursor to the next Line
            // System.out.println(householdSizes[i] + " ");

            System.out.print(householdSizes[i] + " ");
        }
    }

    public static void sortArray(int[] householdSizes, int size) {

       // int n = size; redundant to use
        int temp;

        for (int i=0; i<size; i++){
            for (int j=1; j<(size-i); j++){

               // if(householdSizes[i-1] > householdSizes[i])
                // Array index Start from 0 and (i-1 == -1) i.e. OutOfBound Exception

                if(householdSizes[j-1] < householdSizes[j]) {
                    temp = householdSizes[j-1];
                    householdSizes[j-1] = householdSizes[j];
                    householdSizes[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        {
            Scanner s = new Scanner(System.in);
            // Declare variables.
            final int SIZE = 300;           // Maximum number of household sizes.
            int[] householdSizes = new int[SIZE];   // Array used to store up to 300 household sizes.

            int x;
            //limit variable is redundant
            //int limit = SIZE;
            int householdSize=0;
            String householdSizeString;

            //pairsToCompare & switchOccurred never Used
            // int pairsToCompare;
            //boolean switchOccurred;

            int temp = 0;
            double sum = 0;
            double mean;
            double median;

            // Input household size

           // System.out.println("Enter household size or 999 to quit: ");
           // householdSizeString  = s.nextLine();
           // householdSize = Integer.parseInt(householdSizeString);

            // This is the work done in the fillArray() method

            x = 0;
            while(x < SIZE && householdSize != 999)
            {
                // Moves the Cursor to the next Line
                // System.out.println("Enter household size or 999 to quit: ");

                System.out.print("Enter household size or 999 to quit: ");
                householdSizeString  = s.nextLine();
                householdSize = Integer.parseInt(householdSizeString);
                temp++;// current Element Size
                // Place value in array.
                householdSizes[x] = householdSize;
                x++;    // Get ready for next input item.

            }

            // End of input loop.
            // Find the mean
            int currentSize = temp -1;
            for (int i=0; i< currentSize; i++) {
                sum = sum + householdSizes[i];
            }
            //mean = sum (double) temp;
            mean = sum / currentSize;

            // This is the work done in the sortArray() method
            sortArray(householdSizes, currentSize);

            // This is the work done in the displayArray() method
            System.out.println("\nHousehold sizes are: ");
            displayArray(householdSizes, currentSize);

            // Print the mean
            System.out.println();
            System.out.println("The mean of household size in Marengo is: " + mean);

            // Calculate the median
            if (currentSize % 2 == 0) {
                /*If there are even number of elements in the Array */
                median = (householdSizes[currentSize/2-1]);
            }
            else {
                /*If there are odd number elements in the Array */
                median = (householdSizes[currentSize/2]);
            }
            // Print the median
            System.out.println();
            System.out.println("The median of household size in Marengo is: " + median);
            System.exit(0);
        }
    }
}
