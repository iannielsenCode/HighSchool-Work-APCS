package Chomp;

/**
 * Author: Ian Nielsen
 * Date: January 30th 2012
 * Defines and displays a magic square.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Square {
    private ArrayList<Integer> a;
    
    public Square(){
        a = null;
    }
    
    public void add(int i){
        a.add(i);
    }
    
    public int[] enterValues(){
        System.out.println("Enter a sequence of integers, followed by Q:");
        Scanner in = new Scanner(System.in);
        int[] b = null;
        for(int i = 0; b[i] != 'Q'; i++){
            b[i] = in.nextInt();
        }
        return b;
    }
    
    public boolean isMagic(){
        int b = 0;
        for(int i = 0; i < a.size(); i+=4){
            b += a.get(i);
        }
        int c = 0;
        for(int i = 1; i < a.size(); i+=4){
            c += a.get(i);
        }
        int d = 0;
        for(int i = 2; i < a.size(); i+=4){
            d += a.get(i);
        }
        int e = 0;
        for(int i = 3; i < a.size(); i+=4){
            e += a.get(i);
        }
        int f = 0;
        for(int i = 0; i < 4; i++){
            f += a.get(i);
        }
        int g = 0;
        for(int i = 4; i < 8; i++){
            g += a.get(i);
        }
        int h = 0;
        for(int i = 8; i < 12; i++){
            h += a.get(i);
        }
        int j = 0;
        for(int i = 12; i < 16; i++){
            j += a.get(i);
        }
        int l = 0;
        for(int i = 0; i < a.size(); i+=5){
            l += a.get(i);
        }
        int k = 0;
        for(int i = 3; i < a.size(); i+=3){
            k += a.get(i);
        }
        if((c == b) && (d == b) && (e == b) && (f == b) && (g == b) &&
           (h == b) && (j == b) && (l == b) && (k == b)){
            return true;
        }
        else{
            return false;
        }
    
    }
    
    public boolean isPerfectSquare(int n) 
    { 
        if (n < 0){
            return false; 
        }
 
        int tst = (int)(Math.sqrt(n) + 0.5); 
        return tst*tst == n; 
    }
    
    public String toString(){
        String str = null;
        for(int i = 0;i < a.size();i++){
            str += a.get(i);
        }
        for(int i = 0; i < a.size(); i+= Math.ceil(Math.sqrt(a.size()))){
            str += '\n';
        }
        return str;
    }

    public static void main(String[] args){
        Square a = new Square();
        int[] b = a.enterValues();
        for(int i = 0; i < b.length; i++){
            a.add(b[i]);
        }
        String c = a.toString();
        if((a.isPerfectSquare(a.a.size()) == true) && (a.isMagic() == true)){
            System.out.print(c);
            System.out.print("It's a magic square.");
        }
        else if((a.isPerfectSquare(a.a.size())==true)&&(a.isMagic() == false)){
            System.out.print("It's not a magic square.");
        }
        else{
            System.out.print("It's not a square.");
        }
    }
}
