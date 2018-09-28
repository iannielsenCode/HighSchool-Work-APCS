package Doctor;

/**
 * Author: Ian Nielsen
 * Date: November 29th 2011
 * Tester class for the Doctor class.
 */

import java.util.Scanner;

public class DoctorTester {
    public static void main(String[] args){
        Doctor a = new Doctor();
        Doctor b = new Doctor();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the doctor's speciality:");
        a.setSpeciality(in.next());
        System.out.print("Enter the doctor's fee:");
        a.setFee(in.nextDouble());
        System.out.print("Enter the second doctor's speciality:");
        b.setSpeciality(in.next());
        System.out.print("Enter the second doctor's fee:");
        b.setFee(in.nextDouble());
        if(a.equal(b) == true){
            System.out.println("The doctor's info are indentical.");
        }
        else{
            System.out.println("The doctor's info are not identical.");
        }
    }
}
