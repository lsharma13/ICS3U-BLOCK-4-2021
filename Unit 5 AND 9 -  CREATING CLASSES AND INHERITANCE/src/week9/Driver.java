package week9;

public class Driver {
    public static void main(String[] args) {
        PasswordGenerator2 pw1 = new PasswordGenerator2(5, "lara"); 
        pw1.pwGen(); 
        pw1.pwCount(); 

        PasswordGenerator2 pw2 = new PasswordGenerator2(6); 
        pw2.pwGen(); 
        pw2.pwCount(); 

    }
    
}
