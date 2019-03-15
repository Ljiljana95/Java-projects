/*
4. Kreirati klasu koja predstavlja memoriju računara. Memorija je jedna od 
specijalizacija komponenti računara i opsan je sledećim podacima:Kapacitet.
 */
package prodavnica;

/**
 *
 * @author Home
 */
public class Memorija extends Komponenta{
    private Double kapacitet;
    
    public Memorija(){}
    public Memorija(Double kapacitet){
        super("memorija"); //zasto ovde "memorija", da l moze bez?
        this.kapacitet = kapacitet;
    }
    public Memorija(Double kapacitet,String kategorija){
        super(kategorija);
        this.kapacitet = kapacitet;
    }
    public Memorija(Double kapacitet, String kategorija, String naziv,String sifra, Double cena, Integer rKolicina){
        super(kategorija,naziv,sifra,cena,rKolicina);
        this.kapacitet = kapacitet;
    }
    public Memorija(Double kapacitet, String naziv,String sifra, Double cena, Integer rKolicina){
        super(naziv,sifra,cena,rKolicina);
        this.kapacitet = kapacitet;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" + "Kapacitet memorije: " + kapacitet.toString() + "\n" ;               
    }
    
}
