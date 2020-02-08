
public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle()
    {
        
    }
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        super();
        this.width = width;
        this.length = length; 
    }
    public double getWidth()
    {
        return width;
    }
    public double getLength()
    {
        return length;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    public double getArea()
    {
        return(length*width);
    }
    public double getPerimeter()
    {
        return(length*2 + width*2);
    }
    public String toString()
    {
        String myString3 = "Rectangle{ Width = " + getWidth() + ", length = " + getLength() + ", Color = " + getColor() + ", Filled = " + isFilled() + "]" ;
        return myString3;
    }
    
}
