package Doctor;

/**
 * Author: Ian Nielsen
 * Date: November 25th 2011
 * Objects are records for a clinic's doctor.
 */
public class Doctor {
    private String speciality;
    private double fee;
    
    public Doctor(){
        speciality = null;
        fee = 0;
    }
    
    public Doctor(String a, double b){
        speciality = a;
        fee = b;
    }
    
    public String getSpeciality(){
        return speciality;
    }
    
    public double getFee(){
        return fee;
    }
    
    public String setSpeciality(String newSpeciality){
        speciality = newSpeciality;
        return speciality;
    }
    
    public double setFee(double newFee){
        fee = newFee;
        return fee;
    }
    
    public boolean equal(Doctor a){
        if((a.fee == this.fee) && (a.speciality.equals(this.speciality))){
            return true;
        }
        else{
            return false;
        }
    }
}
