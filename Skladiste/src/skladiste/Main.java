/*
Potrebno je implementirati funkciju main u kojoj je demonstirano kreiranje skladišta, izvršeno nekoliko operacija 
ubacivanja i izbacivanja proizvoda iz skladišta, ponašanje skladišta kada nema više mesta ili raspoložive zapremine 
te ispis sadržaja i ispis zarade skladišta.
 */
package skladiste;

/**
 *
 * @author Home
 */
public class Main {
    public static void main(String[] args) {
        Skladiste S = new Skladiste(3,500.0);
        Sanduk s1 = new Sanduk(1.0, 1.0,1.0,10.0);
        Sanduk s2 = new Sanduk(2.0,2.0,2.0,5.0);
        Bure b1 = new Bure(1.0,2.0,15.0);
        Bure b2 = new Bure(1.0,2.0,15.0);
        
        S.dodaj(s1);
        S.dodaj(b1);
        S.dodaj(s2);
        S.dodaj(b2);
        S.ispis();
        
        S.prodaja(s1);
        S.dodaj(b2);
        S.dodaj(b2);
        S.ispis();
        
        
        
        System.out.println("Zarada je :" + S.zarada());
        
    }
}
