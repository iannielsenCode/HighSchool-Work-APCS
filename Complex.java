package ComplexNumbers;

/**
 * Author: Ian Nielsen
 * Date: November 2nd 2011
 * Represents two complex numbers of a+bi.
 */
public class Complex {
    public double a;
    public double b;
    
    Complex(){
        a = 0;
        b = 0;
    }
    
    Complex(double x){
        a = x;
        b = 0.0;
    }
    
    Complex(double x, double y){
        a = x;
        b = y;
    }
    
    public double abs(){
        double c = a * a;
        double d = b * b;
        double e = Math.sqrt(c + d);
        return e;
    }
    
    public double add(Complex e){
        double total = (this.a +  e.a) + (this.b + e.b);
        return total;
    }
    
    public String toString(){
        String unreal = this.a + " + " + this.b + "i";
        return unreal;
    }
    
    public Complex multiply(Complex e){
        Complex n = new Complex();
        n = e;
        double c = this.a * e.a;
        double d = this.a * e.b;
        double f = this.b * e.a;
        double g = this.b * e.b;
        n.a = c + (-g);
        n.b = d + f;
        return n;
     }
    
}
