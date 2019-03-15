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
public abstract class Avion {
    private static Integer countID = 0;
    private final Integer id = countID++;
    private Double tezina;
    
    public Avion(){}
    public Avion(Double tezina){
        this.tezina = tezina;
    }
    
    public Integer getID(){
        return id;
    }
    
    public Double getTezina(){
        return tezina;
    }
    
    public abstract char getType();
    
    @Override
    public String toString(){
        return getType() + "_" + getID() + "[" + getTezina() + "] \n" ;
    }
}
