/*
Drugi mogući proizvod u skladištu je tipa bure. Ovo je proizvod u obliku valjka i karakterišu ga dužina poluprečnika 
osnove i visina. Oznaka ovog proizvoda je 'B'. Prilikom ispisa, kod ovog proizvoda se ispisuju i dužina poluprečnika i
visina i to u formatu (r, h). 
 */
package skladiste;

/**
 *
 * @author Home
 */
public class Bure extends Proizvod {
    private Double r;
    private Double h;
    
    public Bure(){}
    public Bure(Double r, Double h, Double cena){
        super(cena);
        this.r = r;
        this.h = h;
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
        return super.toString() + "_(" + r.toString() + "," + h.toString() + ")";
    }
            
}
