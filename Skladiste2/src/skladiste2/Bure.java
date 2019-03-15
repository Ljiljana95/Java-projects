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
public class Bure extends Proizvod {
    private Double r,h;
    
    public Bure(){}
    public Bure(Double cena, Double r, Double h){
        super(cena);
        this.r=r;
        this.h=h;
    }
    
    @Override
    public char getOznaka(){
        return 'B';
    }
    
    @Override
    public Double zapremina(){
        return r*r*3.14*h;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Visina: " + h.toString() + "\n" +
                "Poluprecnik: " + r.toString() + "\n";
    }
    
}
