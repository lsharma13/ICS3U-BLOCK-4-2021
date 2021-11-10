package week9;

public class PasswordGenerator2 {
    private int digits; 
    private String prefix;
    private int numPasswords;   
    
    public PasswordGenerator2(int numDigits, String prefixChars){
    digits = numDigits; 
    prefix = prefixChars;
    numPasswords = 0; 
    }
    
    public PasswordGenerator2(int numDigits){
    digits = numDigits;
    prefix = "A"; 
    numPasswords = 0; 
    }
    
    public String pwGen() {
    String password = ""; 
    int i = 0; 
    String temp = ""; 
    if(prefix.equals("A")){
        while(i < digits){
            temp += (int)(Math.random() * 10); 
            i++; 
        }
    password = password + "A." + temp; 
    numPasswords++; 
    return password;  
    
    }else {
        while(i < digits){
            temp += (int)(Math.random() * 10); 
            i++; 
        }
        
    password = password + prefix + "." + temp; 
    numPasswords++; 
    return password; 
    }
}
    
    
    public int pwCount() { 
    return numPasswords; 

    }
}

    
    
    
    
    
    

