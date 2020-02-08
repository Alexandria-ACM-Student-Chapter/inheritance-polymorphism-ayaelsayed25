
public class Circle extends Shape{
    private double radius = 1.0;
    public Circle()
    {
        
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        super();
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return ((22.0/7.0) *radius*radius );
    }
    public double getPerimeter()
    {
        return(2*(22.0/7.0) * radius);
    }
    public String toString()
    {
        String myString2 = "Circle[ radius = " + getRadius() + ", Color = " + getColor() + ", filled = " + isFilled() + "]";
        return myString2;
    }
    }
