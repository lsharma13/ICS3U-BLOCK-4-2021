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
    // this declares the scanner in the main method, and creates three runners 

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

        //this method prompts the user for their first name, last name, mile one and two time and their finish time.
        //It calls the method subtractTimes below. 
        //It then displays the name, mile one, split one, split two and finish times back to the user 

    }

    private static String subtractTimes(String endTime, String startTime) {
        double endTimeInSeconds = convertToSeconds(endTime);
        double startTimeInSeconds = convertToSeconds(startTime); 

        double diffInSeconds = endTimeInSeconds - startTimeInSeconds;

        return convertToTime(diffInSeconds);
        
    }
    /**
     * @param endTime = mile two time 
     * @param startTime = mile one time
     * @return = converting the difference in seconds into time 
     * this method calls method to convert start time and end time to seconds, and then uses that to calculate the difference in seconds 
     */


    private static String convertToTime(double timeInSeconds) {
       int minutes = getMinutes(timeInSeconds);
       double seconds = getSeconds(timeInSeconds); 

        return String.format("%d:%06.3f", minutes, seconds); 
    
    }
    /**
     * @param timeInSeconds = difference in seconds above 
     * @return = converts to the preferred format (mm:ss.sss)
     * this method calls methods to convert the time in seconds into both minutes and seconds and converts it to the format preferred (mm:ss.sss)
     */
    

    private static double getSeconds(double timeInSeconds) {
        return (timeInSeconds%60);
    }
    //this method takes the time in seconds and finds the seconds left once converted to even minutes

    private static int getMinutes(double timeInSeconds) {
        return (int) (timeInSeconds/60);
    }
    //this method takes the time in seconds and finds the minutes (as an integer)

    private static double convertToSeconds(String time) {
        String seconds1 = time.substring(0, time.indexOf(":")); 
        String seconds2 = time.substring(time.indexOf(":") + 1);
        double time1 = Double.parseDouble(seconds1)*60; 
        double time2 = Double.parseDouble(seconds2);   
        double finalTime = time1 + time2;   
        return finalTime; 
    
    }
    /**
     * @param time = the time (endTime or startTime) 
     * @return = This method finds the index of the minutes and then converts them into doubles and minutes (*60)
     * It then takes the seconds and converts it into doubles 
     * It adds them together resulting in the final time 
     */
    
}

