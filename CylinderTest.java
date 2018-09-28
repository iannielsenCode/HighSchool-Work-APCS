package Coin;

import java.util.Scanner;

/**
 * Author: Ian Nielsen
 * Date: October 10th 2011
 * Tester class for Cylinder class.
 */
public class CylinderTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = in.nextDouble();
        System.out.println("Enter the height:");
        double h = in.nextDouble();
        Circle circle = new Circle(r);
        Cylinder cylinder = new Cylinder(r,h);
        double volume = cylinder.getVolume(circle, h);
        System.out.println("Volume = " + volume + ".");
        
        
                
    }
    
}
