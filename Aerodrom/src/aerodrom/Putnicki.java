/*
Putnički avion ima sledeće dodatne karakteristike: kapacitet, tj. maksimalan 
broj putnika. Podrazumevana vrednost za kapacitet iznosi 300. Prilikom 
određivanja ukupne težine, smatra se da je putnički avion popunjen 
(ima maksimalan broj putnika) pri čemu svaki putnik ima i prtljag. 
Prosečna težina putnika u avionu iznosi 80kg, a prtljaga 30kg.
 */
package aerodrom;

/**
 *
 * @author Home
 */
public class Putnicki extends Avion {
    private int maxBrPutnika;
    private static final double tezinaPutnika = 80;
    private static final double tezinaPrtljaga = 30;
    
    public Putnicki( double d){
        super(d);
        maxBrPutnika = 300;
    }
    public Putnicki( double d, int s){
        super(d);
        maxBrPutnika = s;
    }
    
    @Override
    public char getType(){
        return 'P';
    }
    
    @Override
    public double getWeight(){
        return maxBrPutnika*(tezinaPutnika + tezinaPrtljaga)/1000 + super.getWeight();
    }
    
}
