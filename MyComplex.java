import java.lang.Math;

public class MyComplex {
    private double imag = 0.0;
    private double real = 0.0;
    
    public MyComplex()
    {
        
    }
    public MyComplex(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }
    public double getReal()
    {
        return real;
    }
    public void setReal(double real)
    {
        this.real = real;
    }
    public double getImag()
    {
        return imag;
    }
    public void setImag(double imag)
    {
        this.imag = imag;
    }
    public void setValue(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }
    public String toString()
    {
        String myString = "(" + getReal() + "+" + getImag() + "i)";
        return myString;
    }
    public boolean isReal()
    {
        if(imag == 0)
            return true;
        else
            return false;
    }
    public boolean isImaginary()
    {
        if(real == 0)
            return true;
        else
            return false;
    }
    public boolean equals(double real, double imag)
    {
        if(this.real == real && this.imag == imag)
            return true;
        else
            return false;
    }
    public boolean equas(MyComplex another)
    {
        if(another.getReal() == this.real && another.getImag() == this.imag)
            return true;
        else
            return false;
    }
    public double magnitude()
    {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }
    
    public double argument()
    {
        return Math.atan(imag/ real);
    }
    public MyComplex add(MyComplex right)
    {
        this.real = right.real + this.real;
        this.imag = this.imag + right.imag;
        return MyComplex.this;
    }
    public MyComplex addNew(MyComplex right)
    {
        right.real = right.real + this.real;
        right.imag = right.imag + this.imag;
        return right;
    }
    public MyComplex subtract( MyComplex right)
    {
        this.real = this.real - right.real;
        this.imag = this.imag - right.imag;
        return MyComplex.this;
    }
    public MyComplex subtractNew(MyComplex right)
    {
        right.real = right.real - this.real;
        right.imag = right.imag - this.imag;
        return right;
    }
    public MyComplex divide(MyComplex right)
    {
        double mag = this.magnitude() / right.magnitude();
        double angle = this.argument() - right.argument();
        this.real = mag*Math.cos(angle);
        this.imag = mag*Math.sin(angle);
        return MyComplex.this;
    }
    public MyComplex multiply(MyComplex right)
    {
        double mag = this.magnitude() * right.magnitude();
        double angle = this.argument() + right.argument();
        this.real = mag*Math.cos(angle);
        this.imag = mag*Math.sin(angle);
        return MyComplex.this;
    }
    
    public MyComplex conjugate()
    {
        imag = -imag;
        return MyComplex.this;
    }
}
