/*
3. Kreirati klasu koja predstavlja gotove konfiguracije računara. Gotova konfiguracija
je artikl koji se prodaje i opsana je sledećim podacima: Komponente (lista referenci ka komponentama).
 */
package prodavnica;

import java.util.*;

/**
 *
 * @author Home
 */
public class Konfiguracije extends Artikl{
    private ArrayList<Komponenta> K;
    
   // public Konfiguracije(){}
    public Konfiguracije(){
        //super();
        K = new ArrayList<Komponenta>();
    }
    public Konfiguracije(String naziv,String sifra, Double cena, Integer rKolicina){
        super(naziv,sifra,cena,rKolicina);
        K = new ArrayList<Komponenta>();
    }
    
    public void dodajKomponentu(Komponenta k){
        K.add(k);
        //super.cena += k.cena; //--
        System.out.println("Dodata komponenta!");
    }
    
   @Override   //zasto se ne pise ovde toString
    public String toString(){
        for(int i = 0; i< K.size(); i++)
            return "Komponenta: " + K.get(i).toString() + "\n" +
                    super.toString() + "\n";
        return "Blabla!";
    }
}
