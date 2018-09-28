package ComplexNumbers;

/**
 * Author: Ian Nielsen
 * Date: October 25th 2011
 * Class that represents the time of day in hours and minutes.
 */

import java.util.Scanner;

public class Time {
    private int hours;
    private int minutes;
    Scanner in = new Scanner(System.in);
    
    Time(){
        hours = 0;
        minutes = 0;
    }
    
    Time(int h, int m){
        if(h < 0 || h > 23){
            throw new IllegalArgumentException("Value for hours is invalid.");
        }
        hours = h;
        if(m < 0 || m > 60){
            throw new IllegalArgumentException("Value for mins is invalid.");
        }
        minutes = m;
    }
    
    private int toMins(){
        return ((hours * 60) + minutes);
    }
    
    public boolean lessThan(Time t){
        if(this.hours < t.hours){
            return true;
        }
        else if(this.hours == t.hours && this.minutes <= t.minutes){
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public int elapsedSince(Time t){
        if(this.lessThan(t) == true){
            if(t.minutes > this.minutes){
                int a = t.minutes - this.minutes;
                int b = t.hours - this.hours;
                return((60 * b) + a);
            }
            else{
                int a = 60 - this.minutes;
                int b = a + t.minutes;
                int c = t.hours - (this.hours + 1);
                return((c * 60) + b);
            }
        }
        else{
            if(this.minutes > t.minutes){
                int a = 60 - this.minutes;
                int b = 24 - this.hours;
                int c = b + t.hours;
                return((c * 60) + a);
            }
            else{
                int a = t.minutes - this.minutes;
                int b = 24 - this.hours;
                int c = b + t.hours;
                return((c * 60) + a);
            }
                
            }
    }
    
    public String toString(){
        String a = new String("");
        if(this.hours < 10){
            a += "0";
        }
        a += hours;
        a += ":";
        if(this.minutes < 10){
            a += "0";
        }
        a += minutes;
        return a;
    }
}
