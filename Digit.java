package MailCodeEncoder;

/**
 * Author: Ian Nielsen
 * Date: November 8th 2011
 * Includes methods that returns either the encoding of a digit or the 
 * integer value associated with a bar code.
 */
public class Digit {
    public static int getValue(String encodedBarCodeDigit){
        String a = encodedBarCodeDigit;
        if("||:::".equals(a)){
            return 0;
        }
        else if(":::||".equals(a)){
            return 1;
        }
        else if("::|:|".equals(a)){
            return 2;
        }
        else if("::||:".equals(a)){
            return 3;
        }
        else if(":|::|".equals(a)){
            return 4;
        }
        else if(":|:|:".equals(a)){
            return 5;
        }
        else if(":||::".equals(a)){
            return 6;
        }
        else if("|:::|".equals(a)){
            return 7;
        }
        else if("|:|::".equals(a)){
            return 8;
        }
        else if("|::|:".equals(a)){
            return 9;
        }
        else{
            return -1;
        }
    }
    
    public static String getEncodedBarCodeDigit(int digit){
        if(digit == 0){
            return "||:::";
        }
        else if(digit == 1){
            return ":::||";
        }
        else if(digit == 2){
            return "::|:|";
        }
        else if(digit == 3){
            return "::||:";
        }
        else if(digit == 4){
            return ":|::|";
        }
        else if(digit == 5){
            return ":|:|:";
        }
        else if(digit == 6){
            return ":||::";
        }
        else if(digit == 7){
            return "|:::|";
        }
        else if(digit == 8){
            return "|:|::";
        }
        else if(digit == 9){
            return "|::|:";
        }
        else{
            return null;
        }
    }
}
