package BookOrder;
/**
 *Author: Ian Nielsen
 * Date: September 14th 2011.
 * This program takes the total of an order of test prep books according to the sales.
 */
import java.util.Scanner;
        
public class BookTotal {
    public static void main(String[] args){
        double a = 0;
        int b = 0;
        int c = 0;
        a = getOrderTotal(b, c);
        System.out.println("The total for your order of Be Prepared copies and Next Best copies is " + a + ".");
           
        
    }
    public static double getOrderTotal(int b, int c){
        System.out.println("How many Be Prepared books do you want to order?:");
        Scanner in = new Scanner(System.in);
        b = in.nextInt();
        System.out.println("How many Next Best books do you want to order?:");
        Scanner in2 = new Scanner(System.in);
        c = in2.nextInt();
        if((b == 0) && (c == 0)){
            return 0;
        }
        else if((b == 1) && (c == 0)){
            return 18.95;
        }
        else if((b == 0) && (c == 1)){
            return 21.95;
        }
        else if((b == 1) && (c == 1)){
            return 37.95;
        }
        else if(((b + c) >= 3) && ((b + c) < 12)){
            return (15.95 * (b + c));
        }
        else if((b + c) >= 12){
            return (14.00 * (b + c));
        }
        else{
            return 0;
        }
    }
    
}
