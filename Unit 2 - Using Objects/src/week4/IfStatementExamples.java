package week4;

public class IfStatementExamples {
    public static void main(String[] args) {
        exampleOne();       
        String letterGrade = getLetterGrade(78); 
            System.out.println(letterGrade);
        exampleThree();
    }

    private static void exampleThree() {
        /**
         * >
         * <
         * ==
         * >= less than or equal to 
         * <= greater than or equal to 
         * !=   (not equal)
         * 
         * || OR (x>7) || (y>7)     || = or symbol 
         * && AND (x>7) || (y>7)    && = and symbol; and means BOTH 
         * 
         */
    }

    private static String getLetterGrade(int mark) {
        if (mark >= 90) {
            return "A+";
        }else if (mark >= 80){  //else: the thing above wasn't true  if: to check another condition
            return "A"; 
        }else if (mark >= 70){  //as soon as it goes into an else it is done and goes back to the top
            return "B"; 
        }else if (mark >= 60){
            return "C"; 
        }else if (mark >= 50){
            return "D"; 
        }else{
            return "F"; 
        }
    }

    private static void exampleOne() {  //return type is void; returning nothing 
        int x = 8; 

        if (x % 2 == 0) {   //this evaluates to false and we only do things that are true
            //seeing if it is even or odd; if x % 2 = 0 it is even, if it is greater than 0 it is odd
            System.out.println(x + "is even.");
             
        }else { //means we want to do something else
            System.out.println(x + "is odd.");
        }
    }


/**
 * if (x % 2 == 1) {          //can only evaluate to true or false; if it is false it does not go in
        System.out.println(x + "is odd.");
    }
 */
    
    


}
