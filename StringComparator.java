package SortMethods;

/**
 * Author: Ian Nielsen
 * Date: February 2nd 2012
 * Comparator for Strings.
 */

import java.util.Comparator;

public class StringComparator implements Comparator<String>{
    
    @Override
     public int compare(String a, String b){
         int c = a.compareToIgnoreCase(b);
         if(c > 0){
             return -1;
         }
         else if(c < 0){
             return 1;
         }
         else{
             return 0;
         }
     }
    
}
