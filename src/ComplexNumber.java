public class ComplexNumber{
    //for real and imaginary parts of complex numbers
    private double real, imaginary;

    //constructor to initialize the complex number
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal()
    {
        return real ;
    }
    public double getImaginary()
    {
        return imaginary ;
    }

    public void add(double real, double imaginary)
    {
        System.out.println( this.real+  this.imaginary);
    }

    public void add(ComplexNumber other)
    {
        System.out.println( (this.real + other.real)+ " " +(this.imaginary + other.imaginary));
    }

    public void subtract(double real, double imaginary)
    {
        System.out.println(  this.real- this.imaginary);
    }

    public void subtract (ComplexNumber other)
    {
        System.out.println( (this.real - other.real)+ " " +(this.imaginary - other.imaginary));
    }

    public static void main(String args[]) {
        ComplexNumber c1 = new ComplexNumber(100,100);
        ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
//        ComplexNumber temp = sum(c1, c2);
        c1.add(3,3);
        c1.add(c2);
        c1.subtract(2,3);
        c1.subtract(c2);
    }
}