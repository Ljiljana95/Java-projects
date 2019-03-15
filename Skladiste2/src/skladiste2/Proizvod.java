/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladiste2;

/**
 *
 * @author Home
 */
public abstract class Proizvod {
    private static Integer countID = 0;
    private final Integer id = countID++;
    //private char oznaka;
    private Double cena;
    
    public Proizvod(){}
    public Proizvod(Double cena){
        this.cena = cena;
    }
    public abstract char getOznaka();
    public abstract Double zapremina();
    public Double getCena(){
        return cena;
    }
    
    @Override
    public String toString(){
        return "\n" + "ID: " + id.toString() + "\n" +
               "Oznaka: " + getOznaka() + "\n" + 
               "Cena: " + getCena() + "\n" ;                 
    }
    
}
