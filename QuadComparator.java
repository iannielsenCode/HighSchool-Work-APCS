package SortMethods;

/**
 * Author: Ian Nielsen
 * Date: February 1st 2011
 * Comparator class for comparing two QudraticFunction objects.
 */

import java.util.Comparator;

public class QuadComparator implements Comparator<QuadraticFunction>{
    private double x;
    
    public QuadComparator(){
        x = 0;
    }
    
    public QuadComparator(double a){
        x = a;
    }
    
    public int compare(QuadraticFunction one, QuadraticFunction two){
        double a = one.valueAt(this.x);
        double b = two.valueAt(this.x);
        if(a > b){
            return 1;
        }
        else if(a < b){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    public static void main(String[] args){
        QuadraticFunction one = new QuadraticFunction(1,4,3);
        QuadraticFunction two = new QuadraticFunction(2,5,1);
        QuadComparator a = new QuadComparator(4);
        if(a.compare(one, two) == 1){
            System.out.print("At x=4 " + one + " is bigger than " + two);
        }
        else if(a.compare(one, two) == -1){
            System.out.print("At x=4 " + one + " is smaller than " + two);
        }
        else{
            System.out.print("At x=4 " + one + " is equal to " + two);
        }
    }
}
