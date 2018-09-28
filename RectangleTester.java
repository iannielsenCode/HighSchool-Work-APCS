package ComplexNumbers;

/**
 * Author: Ian Nielsen
 * Date: October 24th 2011
 * Tester class for the Rectangle class.
 */
import java.util.Scanner;

public class RectangleTester {

    public static void main(String[] args) {
        int width = 0;
        int height = 0;
        Scanner in = new Scanner(System.in);
        boolean b;
        double c = 0;
  
        System.out.println("Constructor with two arguments:");
        System.out.print("Enter the width of a rectangle:");
        width = in.nextInt();
        System.out.print("Enter the height of a rectangle:");
        height = in.nextInt();

        Rectangle a = new Rectangle(width, height);
        Rectangle d = new Rectangle(width);
        Rectangle e = new Rectangle();

        b = a.isSquare(width, height);
        if (b == true) {
            System.out.println("Your rectangle is a square.");
        }
        else{
            System.out.println("Your rectangle is not a square.");
        }
        
        c = a.quadratize(width, height);
        System.out.println("The side of a square with the same area of your "
                + "rectangle is " + c + ".");
        
        System.out.println("Constructor with one argument:");
        b = d.isSquare(width, width);
        if (b == true) {
            System.out.println("Your rectangle is a square.");
        }
        else{
            System.out.println("Your rectangle is not a square.");
        }
        
        c = d.quadratize(width, width);
        System.out.println("The side of a square with the same area of your "
                + "rectangle is " + c + ".");
        
        System.out.println("Constructor with no arguments:");
        b = e.isSquare(width,width);
        if (b == true) {
            System.out.println("Your rectangle is a square.");
        }
        else{
            System.out.println("Your rectangle is not a square.");
        }
        
        c = e.quadratize(width, width);
        System.out.println("The side of a square with the same area of your "
                + "rectangle is " + c + ".");
        
    }
}
