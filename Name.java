package SortMethods;

/**
 * Author: Ian Nielsen
 * Date: February 7th 2011
 * Represents the name and age of a person.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Name {
    
    public String first;
    public String last;
    public int age;
    
    public Name(String a, String b, int c){
        first = a;
        last = b; 
        age = c;
    }
    
    public  static ArrayList<Name> addNames(Name a, ArrayList<Name> b){
        int c = b.size();
        b.add(c,a);
        return b;
    }
    
    public String toString(){
        String str = "";
        str += last;
        str += ", ";
        str += first;
        str += ", ";
        str += age;
        return str;
    }
    
    public static void main(String[] args){
        Name jack = new Name("Jack", "Smith", 34);
        Name al = new Name("Al", "Smith", 23);
        ArrayList<Name> a = new ArrayList<Name> ();
        a = Name.addNames(jack, a);
        a = Name.addNames(al, a);
        System.out.println("The list of names is:");
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i).toString());
        }
        NameComparator x = new NameComparator();
        Collections.sort(a,x);
        System.out.println("The list of names sorted is:");
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i).toString());
        }
        
    }
    
    
    
}
