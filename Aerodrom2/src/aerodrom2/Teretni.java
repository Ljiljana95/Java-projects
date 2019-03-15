/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerodrom2;

/**
 *
 * @author Home
 */
public class Teretni extends Avion {
    private Double nosivost;
    
    public Teretni(){}
    public Teretni(Double nosivost, Double tezina){
        super(tezina);
        this.nosivost = nosivost;   //40 000
    }
    
    @Override
    public char getType(){
        return 'T';
    }
    
    @Override
    public Double getTezina(){
        return nosivost + super.getTezina();
    }
    
}

