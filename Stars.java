package Stars;

/**
 * Author: Ian Nielsen
 * Date: October 3rd 2011
 * Displays rows of stars, the next row being
 * one more than the last until n rows, both 
 * recursively and iteratively.
 */
import java.util.Scanner;

public class Stars {
    
    public void printStars(int n){
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
                    
      }
    public void printTriangle(int n){
        Stars b = new Stars();
        for(int i = 1; i <= n; i++){
            b.printStars(i);
            System.out.println("\n");
        }
        
    }
    public int printTriangle2(int n, int j){
        Stars c = new Stars();
        if(n < j)
           return 0;
        else
            c.printStars(j);
            System.out.println("\n");
            return printTriangle2(n, j + 1);
    }
    public int printTriangle3(int n)
    {
        int i = 0;
        int j = n;
        Stars c = new Stars();
        if(n <= i)
           return 0;
        else
            c.printStars(j);
            System.out.println("\n");
            return printTriangle3(n - 1);
    }
    public static void main(String[] args){
        int j = 1;
        Stars a = new Stars();
        System.out.println("Enter an integer:");
        Scanner in = new Scanner(System.in);
        System.out.println("\n");
        int n = in.nextInt();
        System.out.println("Iterative Method:\n");
        a.printTriangle(n);
        System.out.println("Recursive Method:\n");
        a.printTriangle2(n, j);
        System.out.println("Modified Recursive Method:\n");
        a.printTriangle3(n);
        
    }
}