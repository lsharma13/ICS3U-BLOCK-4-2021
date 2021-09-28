package week3;

public class ExtraPractice10 {
    public static void main(String[] args) {
        String s = questionTen("Lara"); 
        System.out.println(s);
        
        }

        private static String questionTen(String str) {
            int x = (int)Math.random();
            String random = str.substring(0,x); 
            String rest = str.substring(x, str.length()); 
       
            return random + rest;
    }


        }
    
        

    
    
