package week5;

public class FormattingStrings {
    public static void main(String[] args){
        //5.7.345 - wrong format
        //5.07.345 - right format 

        int minutes = 5; 
        double seconds = 7.5; 

        //System.out.print(minutes + ":" + seconds);

        //placeholder
        // %d -> placeholder for integers
        // %s -> placeholder for Strings 
        // %F -> placeholder for doubles
        System.out.printf("%d:%06.3f", minutes, seconds);    //.3 means the number of decimal places
                                                            // %6 means want it to take up 6 places
                                                            // %06 means to pad the space with 0
    }
    
    
}
