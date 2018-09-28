package ComplexNumbers;

/**
 * Author: Ian Nielsen
 * Date: October 24th 2011
 * Class that represents a rectangle with a width and height.
 */

import java.util.Scanner;

public class Rectangle {
    Scanner in = new Scanner(System.in);
    int width = 0;
    int height = 0;
    
    Rectangle(int a, int b){
        while(a <= 0){
            System.out.println("Please enter a correct width:");
            a = in.nextInt();
        }
        width = a;
        while(b <= 0){
            System.out.println("Please enter a correct height:");
            b = in.nextInt();
        }
        height = b;
    }
    
    Rectangle(int a){
        while(a <= 0){
            System.out.println("Please enter a correct width:");
            a = in.nextInt();
        }
        width = a;
    }
    
    Rectangle(){
        width = 1;
    }
    
    public boolean isSquare(int width, int height){
        if(width == height){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double quadratize(int width, int height){
        int a;
        a = width * height;
        return Math.sqrt(a);
    }
    
    
}
