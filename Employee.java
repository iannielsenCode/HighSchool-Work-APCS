package Doctor;

/**
 * Author: Ian Nielsen
 * Date: November 25th 2011
 * Objects are records for employees.
 */
public class Employee extends Person {
    private double salary;
    private int year;
    private String iD;
    
    public Employee(){
        salary = 0;
        year = 0;
        iD = null;
    }
    
    public Employee(double a, int b, String c){
        salary = a;
        year = b;
        iD = c;
    }
    
    public double getSablary(){
        return salary;
    }
    
    public int getYear(){
        return year;
    }
    
    public String getID(){
        return iD;
    }
    
    public double setSalary(double newSalary){
        salary = newSalary;
        return salary;
    }
    
    public int setYear(int newYear){
        year = newYear;
        return year;
    }
    
    public String setID(String newID){
        iD = newID;
        return iD;
    }
    
    public boolean equals(Employee a){
        if((a.salary == this.salary) && (a.year == this.year) && (a.iD.equals(this.iD))){
            return true;
        }
        else{
            return false;
        }
    }
}
            