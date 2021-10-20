package week6;

public class NestedForTables2 {
    public static void main(String[] args) {
        //testTable();
        //backwards("backwards");
       // excludeA("Arya"); 
       //inside("Arya", "ya"); 
       //table(); 
       tableNumbers(); 

       
    }

    private static void tableNumbers() {
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 5; j++){
                System.out.printf("%5d", i*j); 
        }
        System.out.println(); 
        }
    }

    private static void table() {
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <=4; j++){
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }

    private static void inside(String str, String str2) {
        boolean trueFalse = false; 
        for(int i = 0; i < str.length() - 1; i++){
            String search = str.substring(i, i+2); 
            if(search.equals(str2)){
                trueFalse = true;  
        }
            System.out.println(trueFalse);
        }
    }

    private static void excludeA(String str) {
        for(int i = 0; i < str.length(); i++){
            String search = str.substring(i, i+1); 
            if(!search.equals("A") && !search.equals("a")){
                System.out.print(search); 
            }
        }
    }

    private static void backwards(String str) {
        String newWord = ""; 
        for(int i = str.length() - 1; i >= 0; i--){
            String search = str.substring(i, i+1); 
            System.out.print(newWord + search); 
        }
    }

    private static void testTable() {
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
    }

}
