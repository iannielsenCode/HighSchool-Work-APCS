package SortMethods;

/**
 * Author: Ian Nielsen
 * Date: January 31st 2012
 * Represents a quadratic function, with coefficients a,b,and c.
 */
public class QuadraticFunction implements Comparable<QuadraticFunction> {
    public int a;
    public int b;
    public int c;
    
    public QuadraticFunction(){
        a = 0;
        b = 0;
        c = 0;
    }
    
    public QuadraticFunction(int one, int two, int three){
        a = one;
        b = two;
        c = three;
    }
    
    public double valueAt(double x){
        return((a *(x * x)) + (b * x) + c);
    }
    
    @Override
    public String toString(){
        String str = "";
        if(a < 1){
            str += "-";
            str += a;
            str += "x^2";
        }
        else if(a == 1){
            str += "x^2";
        }
        else if(a > 0){
            str += a;
            str += "x^2";
        }
        else{
            str += "";
        }
        if(b < 1){
            str += "-";
            str += b;
            str += "x";
        }
        else if(b == 1){
            str += "x";
        }
        else if(b > 0){
            str += "+";
            str += b;
            str += "x";
        }
        else{
            str += "";
        }
        if(c < 0){
            str += "-";
            str += c;
        }
        else if(c > 0){
            str += "+";
            str += c;
        }
        else{
            str += "";
        }
        return str;
    }
    
    @Override
    public boolean equals(Object other){
        QuadraticFunction d = (QuadraticFunction) other;
        if((this.a == d.a) && (this.b == d.b) && (this.c == d.c)){
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public int compareTo(QuadraticFunction other){
        int diff = this.a - other.a;       
        if(diff > 0){
            return diff;
        }
        else if(diff < 0){
            return diff;
        }
        int diff2 = this.b - other.b;
        if(diff2 > 0){
            return diff2;
        }
        else if(diff2 < 0){
            return diff2;
        }
        int diff3 = this.c - other.c;
        if(diff3 > 0){
            return diff3;
        }
        else{
            return diff3;
        }
        
     }
}
