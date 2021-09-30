package week4;

public class CodingBat2 {
    public String comboString(String a, String b) {
        if (a.length() > b.length()){
          return b + a + b;
        }else{
          return a + b + a; 
        }
      }

      public boolean endsLy(String str) {
  
        if (str.length() < 2){
          return false; 
        }
        
        String lastTwo = str.substring(str.length()-2); 
        return lastTwo.equals("ly");
      }
      
      /**
       * public String seeColour(String str){   
       * if (str.length() > 2 && str.substring(0,3).equals("red")){     //order does matter for AND; if the first part doesn't work java will stop and it won't crash. if it is opposite it will short circuit
       *    return "red";
       * }else if (str.length() > 2 && str.substring(0,4).equals("blue")){
       *    return "blue"; 
       * }else{
       *  return ""; 
       * }
       */
      
        public String seeColor(String str) {    //same thing as above 
            if (str.indexOf("red") == 0){   //if the index of "red" starts at 0 return red 
              return "red"; 
            }else if (str.indexOf("blue") == 0){
              return "blue"; 
            }else{
              return ""; 
            }
          }

          public String extraFront(String str) {
            if (str.length() < 2){
              return str +str + str; 
            }else {
              String newStr = str.substring (0,2);
              return newStr + newStr + newStr;
            }
          }
          


      }
      
    

