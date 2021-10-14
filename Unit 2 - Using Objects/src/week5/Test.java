package week5;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        processRunner(in); 
        processRunner(in); 
        processRunner(in);  

        in.close(); 
    }
    // this declares and calls the scanner in the main method, initializes three runners and closes the scanner

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

        
    private static String subtractTimes(String mileTwo, String mileOne) {
        double endTimeInSeconds = convertToSeconds(mileTwo);
        double startTimeInSeconds = convertToSeconds(mileOne); 

        double diffInSeconds = endTimeInSeconds - startTimeInSeconds;

        return convertToTime(diffInSeconds);
    }


    private static double convertToSeconds(String mileTwo) {
        return 0;
    }

    private static String convertToTime(double timeInSeconds) {
        int minutes = getMinutes(timeInSeconds);
        double seconds = getSeconds(timeInSeconds); 
 
         return String.format("%d:%06.3f", minutes, seconds); 
     
     }


    //@param endTime = 
    //this method converts start time and end time to seconds, and then uses that to calculate the difference in seconds 

   
    //this method converts the time in seconds into both minutes and seconds and converts it to the format preferred (mm:ss.sss)

    private static double getSeconds(double timeInSeconds) {
        return (timeInSeconds%60);
    }
    //this method takes the time in seconds and finds the remaining seconds when in minutes 

    private static int getMinutes(double timeInSeconds) {
        return (int) (timeInSeconds/60);
    }
    //this method takes the time in seconds and finds the minutes (as an integer)

    
    
    }
    //this method finds the final time that gets printed out
    
}

/**
 * explanation of what it does
 * @param endTime = purpose 
 * @param startTime = purpose
 * @return = purpose 
 */
    

