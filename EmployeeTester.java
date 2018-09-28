package Doctor;

/**
 * Author: Ian Nielsen
 * Date: November 29th 2011
 * Tester class for the employee class.
 */

import java.util.Scanner;

public class EmployeeTester {
    public static void main(String[] args){
        Employee a = new Employee();
        Employee b = new Employee();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the employee's salary:");
        a.setSalary(in.nextDouble());
        System.out.print("Enter the year the employee was hired:");
        a.setYear(in.nextInt());
        System.out.print("Enter the employee's ID:");
        a.setID(in.next());
        System.out.print("Enter another employer's salary:");
        b.setSalary(in.nextDouble());
        System.out.print("Enter when the second employer was hired:");
        b.setYear(in.nextInt());
        System.out.print("Enter the employer's ID:");
        b.setID(in.next());
        if(a.equals(b) == true){
            System.out.println("The employee's info are identical.");
        }
        else{
            System.out.println("The employee's info are not identical.");
        }
    }
}

