package SortMethods;

/**
 * Author: Ian Nielsen
 * Date: February 2nd 2012
 * Sorts an array of string in descending order.
 */

import java.util.Arrays;

public class StringArraySort {
    
    private String[] a = {"one", "two", "three", "four"};
    
    public String[] StringSort(){
        StringComparator x = new StringComparator();
        Arrays.sort(a,x);
        return a;
    }
    
    public static void main(String[] args){
        StringArraySort array = new StringArraySort();
        System.out.print("The array of strings is: ");
        for(int i = 0; i < 4; i++){
            System.out.print(array.a[i] + " ");
        }
        System.out.println();
        String[] b = array.StringSort();
        System.out.print("The array of strings sorted is: ");
        for(int i = 0; i < 4; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
