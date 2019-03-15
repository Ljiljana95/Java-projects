/*
Jedan od mogućih proizvoda u skladištu je tipa sanduk. Ovo je proizvod u obliku kvadra i karakterišu ga dužine ivica.
Oznaka ovog proizvoda je 'S'. Prilikom ispisa, kod ovog proizvoda se ispisuju i dužine ivica i to u formatu (a, b, c). 
Jedan od mogućih proizvoda u skladištu je tipa sanduk. Ovo je proizvod u obliku kvadra i karakterišu ga dužine ivica.
Oznaka ovog proizvoda je 'S'. Prilikom ispisa, kod ovog proizvoda se ispisuju i dužine ivica i to u formatu (a, b, c). 
 */
package skladiste;

/**
 *
 * @author Home
 */
public class Sanduk extends Proizvod {
    private Double a,b,c;
    
    public Sanduk(){}
    public Sanduk(Double a, Double b, Double c, Double cena){
        super(cena);
        this.a = a;
        this.b = b;
        this.c = c;
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
        return super.toString()+ "_(" + a.toString() + "," + b.toString() + "," + c.toString() + ")" ;
    }
    
    
}
