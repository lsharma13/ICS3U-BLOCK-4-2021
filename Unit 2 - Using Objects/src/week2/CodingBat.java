package week2;

public class CodingBat {
    
    
  public String extraEnd(String str) {    //trying to find last two letters repeated 3 times 
        String lastTwo = str.substring(str.length() -2); //length minus 2 to get last two variables 
        return lastTwo + lastTwo + lastTwo; 
        
       }
       

       public String firstHalf(String str) {    //trying to find the first half of an even word 
        String firstHalf = str.substring(0, str.length()/2); //meaning start at 0 and go until length/2 
        return firstHalf; 
       } 
        

       //trying to get first two letters at the end of the rest 
    
          public String left2(String str) {   //same thing as above 
            String rest = str.substring(2); 
            String first2 = str.substring(0,2); 
            return rest + first2; 
          } 
          

          public String makeAbba(String a, String b) {  //in pattern abba 
            return a + b + b + a; 
          }
        
          public String makeOutWord(String out, String word) {  //trying to find the first two << and the last two >> and putting the word in between
            String firstTwo = out.substring(0,2); 
            String lastTwo = out.substring(2); 
            return firstTwo + word + lastTwo; 
            
          }
          
          public String makeTags(String tag, String word) { //trying to make <i> and </i>
            String tag1 = "<" + tag + ">"; 
            String tag2 = "<" + "/" + tag + ">";
            return tag1 + word + tag2; 
          }

          public String nonStart(String a, String b) {  //trying to find all letters except for the first + all letters except for the first
            String stringA = a.substring(1); 
            String stringB = b.substring(1); 
            return stringA + stringB; 
          }
          

          public String nTwice(String str, int n) { //trying to find first n letters + last n letters
            String firstChars = str.substring(0,n); 
            String lastChars = str.substring(str.length () - n); 
            return firstChars + lastChars; 
          }

          public String right2(String str) {    //trying to find last 2 and first so it is last two + first
            String lastChars = str.substring(str.length() - 2);     
            String firstChars = str.substring(0, (str.length() - 2));   // go until it hits the last two 
            return lastChars + firstChars; 
          }

          public String withoutEnd(String str) {    //no first character and no second character 
            String noOpening = str.substring(1, (str.length () -1)); //only from the second character to no closing character
            return noOpening; 
          }
          
          public String middleThree(String str) {
            return str.substring(((str.length()/2) - 1), ((str.length()/2) + 2));   //because there is nothing that is a double we are assuming it is a double
            
        }

        public String middleTwo(String str) {
          return str.substring((str.length()/2 -1), (str.length()/2+1)); 
        }
        
        
          
}


