package DogYearsConverter;

/**
 * Author: Ian Nielsen
 * Date: September 14th 2011.
 * This program converts a given integer in dog years and converts it into human years.
 */
import java.util.Scanner;

class AgeConverter{
    public static void main(String[] args){
        int dogYears = 0;
        double b = 0;
        b = convertToHumanAge(dogYears);
        System.out.println("The human age of the dog age is " + b + ".");
    }
    public static int convertToHumanAge(int dogYears){
        double b = 0;
        System.out.println("Enter a number in dog years:");
        Scanner in = new Scanner(System.in);
        dogYears = in.nextInt();
        if(dogYears == 1){
            b = 13;
           }
        else if(dogYears > 1){
            b = (dogYears * (5 + .333) + 13) / 1;
           }
        else{
            b = 0;
            }
        return (int) b;
    }
}
