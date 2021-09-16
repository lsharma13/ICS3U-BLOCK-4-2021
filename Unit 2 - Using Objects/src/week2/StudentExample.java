package week2;

public class StudentExample {
    public static void main(String[] args) {
        Student fred = new Student("Fred", "65321", 10);    //fred is a reference to the student constructed by ()
        Student max = new Student("Max", "123456", 10);    //max is a reference to another student constructed by ()
        Student muriel = fred;   // assign muriel to fred -> referencing the same student as fred 
        muriel.increaseGrade();     //increases both fred and muriel's grade because they are referencing the same student 

        fred = null; 
        //fred.displayName(); //java throws a NullPointerException

        //non-static means that attributes/methods that belong to the OBJECT not the class 

        max.addTest(87); 
        max.addTest(94);
        max.addTest(98);
        max.addTest(67); 

        



    }
    


}
