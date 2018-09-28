package SortMethods;

/**
 * Author: Ian Nielsen
 * Date: February 8th 2012
 * Comparator for the name type.
 */

import java.util.Comparator;

public class NameComparator implements Comparator<Name>{
    
    @Override
    public int compare(Name a, Name b){
        if((a.last.compareTo(b.last)) > 0){
            return 1;
        }
        else if((a.last.compareTo(b.last)) < 0){
            return -1;
        }
        else{
            if((a.first.compareTo(b.first)) > 0){
                return 1;
            }
            else if((a.first.compareTo(b.first)) < 0){
                return -1;
            }
            else{
                if(a.age > b.age){
                    return 1;
                }
                else if(a.age < b.age){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        }
    }
    
}
