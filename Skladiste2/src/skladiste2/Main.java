/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladiste2;

/**
 *
 * @author Home
 */
public class Main {
     public static void main(String[] args) {
        Skladiste2 S = new Skladiste2(1.0,5.0);
        
        Bure b1 = new Bure(5.0,5.0,5.0);
        Bure b2 = new Bure(3.0,3.0,3.0);
        
        Sanduk s1 = new Sanduk(1.0,2.0,3.0,4.0);
        Sanduk s2 = new Sanduk(2.0,2.0,2.0,4.0);
        
        S.dodaj(s2);
        S.prodaja(s2);
        S.dodaj(s1);
        S.dodaj(b2);
        S.dodaj(b2);
        S.ispis();
        System.out.println("Zarada u skladistu je :" + S.getZarada() );
        
    }
}
