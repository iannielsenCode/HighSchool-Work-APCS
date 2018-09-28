package Grades;

/**
 * Author: Ian Nielsen
 * Date: October 3rd 2011
 * Prints the total price for the
 * amount of ripples ordered.
 */
import java.util.Scanner;

public class Ripples {
    public int input(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter quantity:");
        int quantity = keyboard.nextInt();
        keyboard.nextLine();
        return quantity;
    }
    public void printTotal(int a){
        boolean b;
        for(int i = 1;(b = false) && (i > a);i++){
            if((a / 75) == i){
                b = true;
            }
            else
                b = false;
        }
        if(b == false){
            System.out.println("Ripples can be ordered only in packs of 25.");
        }
        else
            System.out.println("You have ordered " + a + " Ripples -- " + (a * .026) + ".\n");
    }
    public String next(){
        System.out.println("Next customer (y/n):");
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.nextLine().trim();
        return str;
    }
    public static void main(String[] args){
        //do{
           Ripples a = new Ripples();
           int b = 0;
           String c = "";
           b = a.input();
           a.printTotal(b);
           c = a.next();
           if(!"y".equals(c)){
               c = a.next();
           }
               
         //}while("y".equals(c));
          
        }
        
    }

