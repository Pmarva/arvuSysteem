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
            Number n1 = new Number("1002",2);
            System.out.println(n1.toBin());
    
        } catch(NumberFormatException e) {
            System.out.println("Sisendiks vigane number");
        }
        
               
    }    
}
