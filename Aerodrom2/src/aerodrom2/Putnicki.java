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
public class Putnicki extends Avion{
    private Integer maxBrPutnika;
    private static final Double tezinaPutnika = 80.0;
    private static final Double prtljag = 30.0;
    
    public Putnicki(){}
    public Putnicki(Integer maxBrPutnika, Double tezina){
        super(tezina);
        this.maxBrPutnika = maxBrPutnika;   //300
    }
    
    @Override
    public char getType(){
        return 'P';
    }
    
    @Override
    public Double getTezina(){
        return maxBrPutnika*(tezinaPutnika + prtljag)/1000 + super.getTezina();
    }
    
}
