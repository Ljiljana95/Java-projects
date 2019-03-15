/*
6. Napraviti glavnu klasu i definisati listu komponenti. Omogućiti korisniku da 
unese novu komponentu i da ispiše sve komponente ili sve komponente iz date 
kategorije - sortirane po ceni (rastući ili opadajući). Sem izgled menija je prepušten studentu.
 */
package prodavnica;

import java.util.*;




/**
 *
 * @author Home
 */
public class Prodavnica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Konfiguracije K = new Konfiguracije(); 
       Komponenta k1 = new Komponenta("Memorija");
       Komponenta k2 = new Komponenta("Memoirija");
       Komponenta k3 = new Komponenta("Procesor");
       Komponenta k4 = new Komponenta("Procesor");
       ArrayList<Komponenta> Konfig = new ArrayList<Komponenta>();
       Memorija m1 = new Memorija(3.0);
       Memorija m2 = new Memorija(4.0);
       Procesor p1 = new Procesor(5.0,3);
       Procesor p2 = new Procesor(6.0,4);
       K.dodajKomponentu(m1);
       K.dodajKomponentu(m2);
       K.dodajKomponentu(p1);
       K.dodajKomponentu(p2);
       
       
       System.out.println("Komponente: " + m1.toString() );
       
       
       
    }
    
}
