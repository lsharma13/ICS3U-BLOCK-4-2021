package week3;

public class ExtraPractice5 {
    public static void main(String[] args) {
        String str = questionFive("Muriel Lara"); 
        System.out.println(str); 
    }

        private static String questionFive(String str) {
            int index = str.indexOf("e");
            String first = str.substring(0,index); 
            String second = str.substring(index + 1, str.length()); 
            
            return first + second;
        }
    
}