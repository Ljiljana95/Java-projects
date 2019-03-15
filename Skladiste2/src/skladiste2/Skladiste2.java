/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladiste2;

import java.util.*;

/**
 *
 * @author Home
 */
public class Skladiste2 {

    /**
     * @param args the command line arguments
     */
    private ArrayList<Proizvod> P;
    private Double kapacitet;
    private Double maxV;
    
    public Skladiste2(Double kapacitet, Double maxV){
        this.kapacitet=kapacitet;
        this.maxV=maxV;
        P = new ArrayList<Proizvod>();
    }  
    public Integer tbrProizvoda(){
        return P.size();
    }  
    public Double maxbrProizvoda(){
        return kapacitet;
    }   
    public Double getV(){
        Double V = 0.;
        for(int i = 0; i < P.size(); i++){
            V = V + P.get(i).zapremina();
        }
        return V;
    }  
    public Double trV(){
        return maxV - getV();
    }
    public Double getZarada(){
        Double zarada = 0.;
        for(int i = 0; i < P.size(); i++){
            zarada = zarada + P.get(i).getCena();
            zarada = 0.2*zarada;
        }
        return zarada;
    }
    public void dodaj(Proizvod p){
        if( trV() <= maxV && tbrProizvoda() < kapacitet ){
            P.add(p);
            System.out.println("Proizvod je dodat!");
        }else{
            System.out.println("Nije moguce dodati proizvod!");
        }
    }
    public void prodaja(Proizvod p){
        P.remove(p);
        System.out.println("Proizvod je prodat!");
    }
    public void ispis(){
        for(int i = 0; i < P.size(); i++){
            System.out.println("\n" + "Ispis proizvoda:" + P.get(i).toString());
        }
    }
    
}
