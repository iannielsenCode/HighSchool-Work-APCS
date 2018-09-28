package ComplexNumbers;

/**
 * Author: Ian Nielsen
 * Date: November 2nd 2011
 * Tester class for the complex class
 */

public class ComplexTester {
    public static void main(String[] args){
        Complex a = new Complex(3,4);
        Complex b = new Complex(-2,5);
        Complex c = new Complex();
    
        System.out.println("The first complex number is " + a.toString());
        System.out.println("The second complex number is " + b.toString());
        System.out.println("The absolute value of the first is " + a.abs());
        System.out.println("The absolute value of the second is " + b.abs());
        System.out.println("The sum of the two complex numbers is " + a.add(b));
        c = a.multiply(b);
        System.out.println("The product of the two complex numbers is " + c.toString());
    }
}
