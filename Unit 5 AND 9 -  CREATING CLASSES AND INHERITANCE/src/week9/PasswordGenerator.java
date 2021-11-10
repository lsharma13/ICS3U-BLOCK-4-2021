package week9;

public class PasswordGenerator(){
        private int digits; 
        private String prefix;
        private int numPasswords;   
    
    public PasswordGenerator(int numDigits, String prefixChars){
    digits = numDigits; 
    prefix = prefixChars;
    numPasswords = 0; 
    }
    
    public PasswordGenerator(int numDigits){
    digits = numDigits;
    prefix = "A"; 
    numPasswords = 0; 
    }
    
    public String pwGen() {
    String password = ""; 
    if(prefix.equals("a")){
    password = password + "A. " + (Math.random() * digits); 
    numPasswords++; 
    return password;  
    
    }else {
    password = password + prefix + "." + (Math.random() * digits); 
    numPasswords++; 
    return password; 
    }
    }
    
    public int pwCount() { 
    return numPasswords; 

    }
}

    
    
    
    
    