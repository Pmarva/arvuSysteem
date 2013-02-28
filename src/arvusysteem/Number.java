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

    private String number;
    
    /**
     * 
     * @param number number mida tahetakse teisendada 
     * @param radix  arvusüsteem milles number on.
     */
    public Number(String number,int radix){
        this.number=new BigInteger(number,radix).toString(2);
    }
    /**
     * Teisendab ühest arvusüsteemist teise.
     * @param radix arvusüsteem,millesse tahetakse teisendada.
     * @return 
     */
    public String toX(int radix) {
        return new BigInteger(number,2).toString(radix);
    }
}
