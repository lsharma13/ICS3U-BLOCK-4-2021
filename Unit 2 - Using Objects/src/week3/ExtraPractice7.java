package week3; 

public class ExtraPractice7 {
    public static void main(String[] args) {
        String str = questionSeven ("AP COMP SCI","MP"); 
        System.out.println(str);
    }
        

            private static String questionSeven(String string1, String string2) {
                String str1 = string1.substring(string1.length()); 
                String str2 = string2.substring(string2.length()); 
                
                return str1 + str2;
    }

}