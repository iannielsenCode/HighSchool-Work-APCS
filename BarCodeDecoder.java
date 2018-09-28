package MailCodeEncoder;

/**
 * Author: Ian Nielsen
 * Date: December 1st 2011
 * Represents a bar code.
 */
public class BarCodeDecoder {
    public String bar;
    
    BarCodeDecoder(){
        bar = "";
    }
    
    BarCodeDecoder(String barcode){
        bar = barcode;
    }
    
    public boolean isValid(){
       for(int i = 0; i < this.bar.length(); i++){
           if(("|".equals(this.bar.substring(i,i+1)) == false) 
                   && (":".equals(this.bar.substring(i,i+1)) == false)){
               return false;
           }
       }
       if(("|".equals(this.bar.substring(0,1))) == false){
           return false;
       }
       else if(this.bar.length() > 32){
           return false;
       }
       else if(("|".equals(this.bar.substring(31,32))) == false){
           return false;
       }
       else{
           return true;
       }
   }
    
   public String getZipCode(){
       String a = "";
       if(this.isValid() == true){
           for(int i = 1; i < 26; i+= 5){
                if("||:::".equals(this.bar.substring(i,i+5))){
                    a+= "0";
                }
                else if(":::||".equals(this.bar.substring(i,i+5))){
                    a+= "1";
                }
                else if("::|:|".equals(this.bar.substring(i,i+5))){
                    a+= "2";
                }
                else if("::||:".equals(this.bar.substring(i,i+5))){
                    a+= "3";
                }
                else if(":|::|".equals(this.bar.substring(i,i+5))){
                    a+= "4";
                }
                else if(":|:|:".equals(this.bar.substring(i,i+5))){
                    a+= "5";
                }
                else if(":||::".equals(this.bar.substring(i,i+5))){
                    a+= "6";
                }
                else if("|:::|".equals(this.bar.substring(i,i+5))){
                    a+= "7";
                }
                else if("|:|::".equals(this.bar.substring(i,i+5))){
                    a+= "8";
                }
                else{
                    a+= "9";
                }
           }
       return a;
       }
       else{
           return null;
       }
   }
   
   public String getErrorText(){
       if(this.isValid() == true){
           return null;
       }
       else if(this.bar.length() != 32){
           return "Invalid Bar Code Length";
       }
       else if("|".equals(this.bar.substring(0,1)) == false){
           return "Invalid Start of Frame";
       }
       else{
           return "Invalid End of Frame";
       }
   }
   
    
}
