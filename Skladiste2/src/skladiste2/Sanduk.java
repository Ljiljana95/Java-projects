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
public class Sanduk extends Proizvod {
    private Double a,b,c;
    
    public Sanduk(){}
    public Sanduk(Double a, Double b, Double c, Double cena){
        super(cena);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    @Override
    public char getOznaka(){
        return 'S';
    }
    
    @Override
    public Double zapremina(){
        return a*b*c;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Duzine ivica: " +  a.toString() + ", " + b.toString() + ", " + c.toString() + "\n";
    }
    
}
