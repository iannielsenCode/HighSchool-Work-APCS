package SortMethods;

/**
 * Author: Ian Nielsen
 * Date: February 9th 2012
 * Represents a list of words sorted alphabetically.
 */

import java.util.ArrayList;

public class SortedWordList extends ArrayList<String>{
    
    private int initial;
    private ArrayList<String> list;
    
    public SortedWordList(){
        initial = 0;
    }
    
    public SortedWordList(int a){
        initial = a;
    }
    
    @Override
    public boolean contains(Object o){
        String b = (String) o;
        int left = 0;
        int right = this.list.size() - 1;
        while(left <= right){
            int middle = (left + right) / 2;
            int diff = b.compareTo(this.list.get(middle));
            if(diff > 0){
                left = middle + 1;
            }
            else if(diff < 0){
                right = middle - 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int indexOf(Object o){
        String b = (String) o;
        int left = 0;
        int right = this.list.size() - 1;
        while(left <= right){
            int middle = (left + right) / 2;
            int diff = b.compareTo(this.list.get(middle));
            if(diff > 0){
                left = middle + 1;
            }
            else if(diff < 0){
                right = middle - 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
    
    @Override
    public String set(int i, String word){
        if(((i < 0) && (word.compareTo(get(i-1)) <= 0) || 
                ((i < this.list.size()-1) && 
                (word.compareTo(get(i+1)) >= 0)))){
            throw new IllegalArgumentException("word=" + word + " i=" + i);
        }
        return super.set(i,word);
    }
    
    @Override
    public void add(int i, String word){
        if(((i < 0) && (word.compareTo(get(i - 1)) <= 0)) || 
                ((word.compareTo(get(i)) >= 0))){
            throw new IllegalArgumentException("word=" + word + " i=" + i);
        }
        super.add(i,word);
    }
    
    @Override
    public boolean add(String word){
        int left = 0;
        int right = this.list.size() - 1;
        while(left <= right){
            int middle = (left+right) / 2;
            int diff = word.compareToIgnoreCase(this.list.get(middle));
            if(diff < 0){
                left = middle + 1;
            }
            else if(diff > 0){
                right = middle - 1;
            }
            else{
                super.add(middle, word);
                return true;
            }
        }
        return false;
    }
    
}
