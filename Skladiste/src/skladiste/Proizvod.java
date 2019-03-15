/*
Skladište
Implementirati program za vođenje evidencije o broju i ukupnoj zapremini proizvoda u zamišljenom skladištu.
Definisati abstraktnu klasu proizvod. Svaki proizvod ima jedinstven celobrojni identifikator, oznaku proizvoda
(jedno slovo) i cenu. Za svaki proizvod moguće je odrediti zapreminu i moguće je ispisati informacije o proizvodu pomoću
funkcije "toString" koja ispisuje vrstu proizvoda, jedinstveni identifikator kao i dodatne informacije specifične za određeni
proizvod. 
 */
package skladiste;

/**
 *
 * @author Home
 */
public abstract class Proizvod {
    private static Integer countID = 0;
    private final Integer id = countID++;
    private Double cena;
    
    public Proizvod(){}
    
    public Proizvod(Double cena){
        this.cena = cena;
    }
    
    public abstract Double zapremina();
    
    public abstract char getOznaka();
    
    public Double getCena(){
        return cena;
    }
    
    @Override
    public String toString(){
        return getOznaka() + "_" + id.toString() + "_" + cena.toString();
    }
    
}
