
public class Square extends Rectangle {
    private double side;
    Square()
    {
        
    }
    Square(double side)
    {
        this.side = side;
    }
    Square(double side, String color, boolean filled)
    {
        super();
        this.side = side;
    }
    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        this.side = side;
    }
    public void setWidth( double side )
    {
        this.side = side;
    }
    public void setLength(double side)
    {
        this.side = side;
    }
    public String toString()
    {
        String myString4 = "Square[ Side = " + getSide() + ", color = " + getColor() + ", filled = " + isFilled() + "]";
        return myString4;
    }
            
}
