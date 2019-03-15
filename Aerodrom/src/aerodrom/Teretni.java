/*
Teretni avion ima sledeće dodatne karakteristike: nosivost (u kilogramima).
Podrazumevana vrednost za nosivost iznosi 40000. Prilikom određivanja
ukupne težine, smatra se da je teretni avion opterećen maksimalnom količinom tereta.
 */
package aerodrom;

/**
 *
 * @author Home
 */
public class Teretni extends Avion {
    private double nosivost;
    
    public Teretni(double d){
        super(d);
        nosivost = 40000;
    }
    public Teretni(double d,double n){
        super(d);
        nosivost = n;
    }
    
    @Override
    public char getType(){
        return 'T';
    }
    
    @Override
    public double getWeight(){
        return nosivost + super.getWeight();
    }
}
