/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arvusysteem;

/**
 *
 * @author kasutaja
 */
public class ArvuSysteem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String number="01234567";
            int systeem=8;
            Number n1 = new Number(number,systeem);
            System.out.println("Algne arv "+number+ " systeemis "+systeem);
            System.out.println("Binaar "+n1.toX(2));
            System.out.println("Kymnend "+n1.toX(10));
            System.out.println("Kuusteist "+n1.toX(16));
            System.out.println("Kaheksa "+n1.toX(8));
    
        } catch(NumberFormatException e) {
            System.out.println("Sisendiks vigane number");
        } catch(Exception e) {
            System.out.println("Tundmatu viga");
        }
        
               
    }    
}
