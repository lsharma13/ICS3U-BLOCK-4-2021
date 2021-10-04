package week5;

import java.util.Scanner;

public class CrossCountry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        processRunner(in); 
        processRunner(in); 
        processRunner(in);  

        in.close(); 
    }

    private static void processRunner(Scanner in) {
        String firstName, lastName;
        String mileOne, mileTwo, finish; 
        String splitTwo, splitThree;

        /**
         * get the first and last name of the runner
         * get the mileOne, mileTwo and finish times for the runner
         */

         splitTwo = subtractTimes(mileTwo, mileOne); 
         splitThree = subtractTimes(finish, mileTwo); 

         /**
          * display a summary for the runner 
          * a bunch of prints 
          */
    }

    private static String subtractTimes(String endTime, String startTime) {
        double endTimeInSeconds = convertToSeconds(endTime);
        double startTimeInSeconds = convertToSeconds(startTime); 

        double diffInSeconds = endTimeInSeconds - startTimeInSeconds;

        return convertToTime(diffInSeconds);
        
    }

    private static String convertToTime(double timeInSeconds) {
        return null;
        /**
         * write this 
         */
    }

    private static double convertToSeconds(String time) {
        return 0;
        /**
         * write this 
         * substring and index of 
         */
    }
    
}

/**
 * explanation of what it does
 * @param endTime = purpose
 * @param startTime = purpose
 * @return = purpose 
 */