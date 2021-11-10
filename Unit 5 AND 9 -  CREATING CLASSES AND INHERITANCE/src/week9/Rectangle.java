package week9;

public class Rectangle {
    protected int length; 
    private int width; 
        
    
    public Rectangle(int l, int w){
        length = l; 
        width = w; 

    }

    public Rectangle(int side) {
        length = side; 
        width = side; 
    } 


    public int getLength(){
        return length; 
    }

    public int getWidth(){
        return width; 
    }

    public int getArea() {
        return getLength() * getWidth(); 
    }

    public int getPerimeter() { 
        return (2 * (getLength() + getWidth())); 
    }
    public boolean isSquare() {
        return length == width; 
    }

    public String toString() {
        return "Rectangle with a width of " + width + "and a length of " + length; 
    }

    public boolean equals(Object obj){
        if (obj == this)
            return true; 
        
            if (obj instanceof Rectangle) {
                Rectangle r = (Rectangle) obj; 
                return length == r.length && width == r.width; 
            }else {
                return false; 
            }

    }

}
