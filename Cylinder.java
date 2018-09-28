package Coin;

/**
 * Author: Ian Nielsen
 * Date: October 10th 2011
 * Provides a method that returns the volume of a cylinder.
 */
public class Cylinder {
    
    Circle base;
    double height;
    
    public Cylinder(double r, double h){
        height = h;
        Circle base = new Circle(r);
    }
    
    public double getVolume(Circle base, double height){
        return (base.getArea() * height);
    }
    
}
