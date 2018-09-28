package MailCodeEncoder;

/**
 * Author: Ian Nielsen
 * Date: November 3rd 2011
 * Represents a five digit zip code.
 */
public class ZipCodeEncoder {
    public String zip;
    
    ZipCodeEncoder(){
        zip = "";
    }
    
    ZipCodeEncoder(String zipCode){
        zip = zipCode;
    }
    
    public boolean isValid(){
        for(int i = 0; i < this.zip.length(); i++){
            if(Character.isDigit(zip.charAt(i)) == false){
                return false;
            }
        }
        if(this.zip.length() > 5){
            return false;
        }
        else{
            return true;
        }
    }
    
    public String getZipCode(){
        String a = this.zip;
        return a;
    }
    
    public String getCheckDigit(){
        String a = "";
        int total = Integer.parseInt(this.zip);
        int total2 = 0;
        int checkDigit = 0;
        int a1, a2, a3, a4, a5;
        if(total < 10000){
            a1 = total % 10;
            total /= 10;
            a2 = total % 10;
            total /= 10;
            a3 = total % 10;
            total /= 10;
            a4 = total % 10;
            total /= 10;
            a5 = 0;
            total2 = a1 + a2 + a3 + a4;
            checkDigit = 10 - (total2 % 10);
            return Digit.getEncodedBarCodeDigit(checkDigit);
        }
        else if(total < 1000){
            a1 = total % 10;
            total /= 10;
            a2 = total % 10;
            total /= 10;
            a3 = total % 10;
            total /= 10;
            a4 = 0;
            a5 = 0;
            total2 = a1 + a2 + a3;
            checkDigit = 10 - (total2 % 10);
            return Digit.getEncodedBarCodeDigit(checkDigit);
        }
        else if(total < 100){
            a1 = total % 10;
            total /= 10;
            a2 = total % 10;
            total /= 10;
            a3 = 0;
            a4 = 0;
            a5 = 0;
            total2 = a1 + a2;
            checkDigit = 10 - (total2 % 10);
            return Digit.getEncodedBarCodeDigit(checkDigit);
        }
        else{
            a1 = total % 10;
            total /= 10;
            a2 = 0;
            a3 = 0;
            a4 = 0;
            a5 = 0;
            total2 = a1;
            checkDigit = 10 - (total2 % 10);
            return Digit.getEncodedBarCodeDigit(checkDigit);
        }
    }
    
    public String getBarCode(){
        String a = "";
        if(this.isValid() == true){
            a+= "|";
            for(int i = 0; i < this.zip.length(); i++){
                if("0".equals(this.zip.substring(i,i+1))){
                    a+= "||:::";
                }
                else if("1".equals(this.zip.substring(i,i+1))){
                    a+= ":::||";
                }
                else if("2".equals(this.zip.substring(i,i+1))){
                    a+= "::|:|";
                }
                else if("3".equals(this.zip.substring(i,i+1))){
                    a+= "::||:";
                }
                else if("4".equals(this.zip.substring(i,i+1))){
                    a+= ":|::|";
                }
                else if("5".equals(this.zip.substring(i,i+1))){
                    a+= ":|:|:";
                }
                else if("6".equals(this.zip.substring(i,i+1))){
                    a+= ":||::";
                }
                else if("7".equals(this.zip.substring(i,i+1))){
                    a+= "|:::|";
                }
                else if("8".equals(this.zip.substring(i,i+1))){
                    a+= "|:|::";
                }
                else{
                    a+= "|::|:";
                }
            }
            a+= this.getCheckDigit();
            a+= "|";
            return a;
        }
        else{
            return null;
        }
    }
    
    public void setZipCode(String a){
        this.zip = a;
    }
    
}
