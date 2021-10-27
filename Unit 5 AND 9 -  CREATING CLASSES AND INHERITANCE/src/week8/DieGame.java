package week8; 

public class DieGame {
    public static void main(String[] args){
        Die die1 = new Die(); //this is a special method - it is a CONSTRUCTOR 
        //always create a constructor
        //package week8;

        //die1.numSides = 7;  //not valid/possible because it is outside the class
        
        Die die2 = new Die(); 

        int countPairs = 0; 

        for(int i = 0; i < 100; i++){
            die1.roll(); 
            die2.roll();
            System.out.println(die1 + " " + die2);

            if(die1.getTopSide() == die2.getTopSide()) {
                countPairs ++; 
                
            }
        System.out.println("Number of Pairs: " + countPairs);

        }
    
        

    }
}