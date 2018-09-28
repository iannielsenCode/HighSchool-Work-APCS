package Grades;

/**
 * Author: Ian Nielsen
 * Date: October 3rd 2011
 * Reads integer scores from a file and 
 * prints out their average.
 */
import java.io.*;
import java.util.Scanner;

public class GradeAvg
{
  public static void main(String[] args)
  {
    Scanner input = null;
    int total = 0;
    int i = 0;

    try
    {
      input = new Scanner(new File("scores.dat"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("***  Can't open scores.dat ***");
      System.exit(1);
    }
    for(;input.hasNextInt(); i++){
        total = total + input.nextInt();
    }
    System.out.println("The average of the scores is " + total/i + ".");
    
  }

    
}
