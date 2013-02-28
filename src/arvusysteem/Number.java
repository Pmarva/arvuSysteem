/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arvusysteem;

import java.math.BigInteger;

/**
 *
 * @author kasutaja
 */
public class Number {

    String number;
    public Number(String number,int arvusysteem){
        this.number=new BigInteger(number,arvusysteem).toString(2);
    }
    
    public String toX(int toArvuSysteem) {
        return new BigInteger(number,2).toString(toArvuSysteem);
    }
    /*
    public String toDec() {
         return new BigInteger(number,2).toString(10);
    }
    
    public String toHex() {
         return new BigInteger(number,2).toString(16);
    }
    
    public String toOct() {
         return new BigInteger(number,2).toString(8);
    }
    
    public String toBin() {
         return number;
    }
    */
}
