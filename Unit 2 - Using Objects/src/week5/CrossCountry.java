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

        System.out.print("Please enter your first name: ");
        firstName = in.nextLine(); 
        System.out.print("Please enter your last name: ");
        lastName = in.nextLine(); 

        System.out.print("Please enter your mile One time: ");
        mileOne = in.nextLine(); 
        System.out.print("Please enter your mile Two time: ");
        mileTwo = in.nextLine(); 
        System.out.print("Please enter your finish time: ");
        finish = in.nextLine(); 

         splitTwo = subtractTimes(mileTwo, mileOne); 
         splitThree = subtractTimes(finish, mileTwo); 


        System.out.println("Name: " + firstName + " " + lastName);

        System.out.println("Mile One: " + mileOne);
        System.out.println("Split Two: " + splitTwo);
        System.out.println("Split Three: " + splitThree);

        System.out.println("Finish Time: " + splitThree);

    }

    private static String subtractTimes(String endTime, String startTime) {
        double endTimeInSeconds = convertToSeconds(endTime);
        double startTimeInSeconds = convertToSeconds(startTime); 

        double diffInSeconds = endTimeInSeconds - startTimeInSeconds;

        return convertToTime(diffInSeconds);
        
    }

    private static String convertToTime(double timeInSeconds) {
       int minutes = getMinutes(timeInSeconds);
       double seconds = getSeconds(timeInSeconds); 

        return String.format("%d:%06.3f", minutes, seconds); 
    
    }

    private static double getSeconds(double timeInSeconds) {
        return (timeInSeconds%60);
    }

    private static int getMinutes(double timeInSeconds) {
        return (int) (timeInSeconds/60);
    }

    private static double convertToSeconds(String time) {
        String seconds1 = time.substring(0, time.indexOf(":")); //in minutes
        String seconds2 = time.substring(time.indexOf(":") + 1);// in seconds 
        double time1 = Double.parseDouble(seconds1)*60; //convert to seconds 
        double time2 = Double.parseDouble(seconds2);   
        double finalTime = time1 + time2;   //add
        return finalTime; 
    
        /**
         * seconds1 = 5
         * seconds2 = 07.658
         * 5:07.658
         */
    }
    
}

/**
 * explanation of what it does
 * @param endTime = purpose 
 * @param startTime = purpose
 * @return = purpose 
 */