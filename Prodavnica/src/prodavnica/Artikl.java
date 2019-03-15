/*
1. Kreirati apstraktnu klasu koja predstavlja artikl prodaje. Artikl prodaje je
opisan sledećim podacima: Šifra (jedinstveno), Naziv, Cena, Raspoloživa količina.
 */
package prodavnica;

/**
 *
 * @author Home
 */
public abstract class Artikl {
    private String sifra;
    private String naziv;
    protected Double cena;
    private Integer rKolicina;
    
    public Artikl(){}
    public Artikl(String sifra){
        this.sifra = sifra;
    }
    public Artikl(String sifra,String naziv){
        this.sifra=sifra;
        this.naziv=naziv;
    }
    public Artikl(String sifra, String naziv, Double cena){
        this.sifra=sifra;
        this.naziv=naziv;
        this.cena=cena;
    }
    public Artikl(String sifra,String naziv, Double cena, Integer rKolicina){
        this.sifra = sifra;
        this.cena = cena;
        this.rKolicina = rKolicina;
        this.naziv = naziv;
    }
    
    @Override
    public String toString(){
        return "Sifra: " + sifra + "\n"
             + "Naziv: " + naziv + "\n"
             + "Cena: " + cena + "\n"
             + "Raspoloziva kolicina: " + rKolicina + "\n";       
    }
}

