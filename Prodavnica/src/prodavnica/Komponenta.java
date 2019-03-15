/*
2. Kreirati klasu koja predstavlja komponentu računara. Komponenta je artikl koji
se prodaje i opsana je sledećim podacima: Kategorija.
 */
package prodavnica;

/**
 *
 * @author Home
 */
public class Komponenta extends Artikl{
    private String kategorija;
    
    public Komponenta(){}
    public Komponenta(String kategorija){
        this.kategorija = kategorija;
    }
    public Komponenta(String kategorija, String naziv,String sifra, Double cena, Integer rKolicina){
        super(naziv,sifra,cena,rKolicina);
        this.kategorija= kategorija;
    }
    public Komponenta( String naziv,String sifra, Double cena, Integer rKolicina){
        super(naziv,sifra,cena,rKolicina);
    }
    @Override
    public String toString(){
        return super.toString() + "\n" + "Kategorija: " + kategorija + "\n" ;
                      
    }
    
}
