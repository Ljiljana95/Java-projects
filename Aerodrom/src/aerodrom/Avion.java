/*
Aerodrom
Kreirati program u programskom jeziku Java koji predstavlja uprošćenu verziju 
aplikacije za evidenciju i upravljanje aerodromskim troškovima. Ovaj program 
treba da omogući evidentiranje svih aviona prisutnih na aerodromu.

Avione delimo na putničke i teretne. Svaki avion ima jedinstven, automatski
generisan, celobrojni serijski broj kao i sopstvenu težinu u kilogramima. 
Pomoću metoda "getID" i "getWeight" moguće je dobiti informacije o serijskom 
broju odnosno težini aviona. Osim toga, svaki avion ima i jednoslovnu oznaku 
tipa i to 'P' za putnički te 'T' za teretni. Pomoću apstraktne metode "getType"
moguće je dobiti informaciju o tipu aviona. Za svaki avion treba obezbediti i
adekvatan tekstualni ispis informacija (metoda "toString") i to u sledećem 
formatu: tip_serBroj [tezina] (npr. P_12 [34967]). 
 */
package aerodrom;
/**
 *
 * @author Home
 */
public abstract class Avion {
    private static int countID = 0;
    private final int id = countID++;
    private double tezina;
    
    public Avion(){}
    
    public Avion(double tezina){
        this.tezina = tezina;
    }
    
    public int getId(){
        return id;
    }
    
    public double getWeight(){
        return tezina;
    }
    
    public abstract char getType();
    
    @Override
    public String toString(){
        return getType() + "_" + 
               getId() + "[" + 
               getWeight() + "]";
    }
}
