package MailCodeEncoder;

/**
 * Author: Ian Nielsen
 * Date: December 8th 2011
 * Tester class for ZipCodeEncoder and BarCodeDecoder.
 */

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        System.out.print("Enter a valid bar code:");
        Scanner in2 = new Scanner(System.in);
        String c = in2.next();
        BarCodeDecoder d = new BarCodeDecoder(c);
        if(d.isValid() == true){
            System.out.println("The corresponding zip code is " + d.getZipCode
                              ()+ ".");
        }
        else{
            System.out.println(d.getErrorText());
        }
        System.out.print("Enter a valid zip code:");
        Scanner in = new Scanner(System.in);
        String a = in.next();
        ZipCodeEncoder b = new ZipCodeEncoder(a);
        if(b.isValid() == true){
            System.out.println("The corresponding bar code is " + b.getBarCode
                              ()+ ".");
        }
        else{
            System.out.println("Your zipcode is invalid.");
        }
    }
}
