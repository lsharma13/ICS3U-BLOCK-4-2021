package week3;

public class ExtraPractice9 {
    public static void main(String[] args) {
        int variables = questionNine(5, 10); 
        System.out.println(variables);
        
        }

            private static int questionNine(int radius, int height) {
                double volume = 2*(Math.sqrt(Math.PI))*(radius)*(height); 
                return (int) volume;
    
        }
    
        

    }
    

