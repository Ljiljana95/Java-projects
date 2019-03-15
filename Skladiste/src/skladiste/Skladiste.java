/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladiste;

import java.util.*;

/**
 *
 * @author Home
 */
public class Skladiste {
    private Integer maxMesta;
    private Double maxV;
    private ArrayList<Proizvod> P;
    
    public Skladiste(){}
    public Skladiste(Integer maxMesta, Double maxV){
        this.maxMesta = maxMesta;
        this.maxV = maxV;
        P = new ArrayList<Proizvod>();
    }
    
    public Integer tbrP(){
        return P.size();
    }
    public Integer mbrP(){
        return maxMesta;
    }
    
    public Double getV(){
        Double V = 0.0;
        for(int i = 0; i < P.size(); i++){
            V = V + P.get(i).zapremina();
        }
        return V;
    }
    public Double preostalaV(){
        return maxV - getV();
    }
    
    public Double zarada(){
        Double C = 0.0;
        for(int i = 0; i < P.size(); i++){
            C += P.get(i).getCena();
        }
        return C*0.2;
    }
    
    public void dodaj(Proizvod p){
        if(P.size() < maxMesta && preostalaV() <= maxV){
            P.add(p);
            System.out.println("Proizvod je dodat!");
        }else{
            System.out.println("Proizvod nije dodat!");
        }
    }
    public void prodaja(Proizvod p){
        P.remove(p);
        System.out.println("Proizvod je prodat!");
    }
    
    public void ispis(){
        P.forEach((l) -> { System.out.println(l);   });
    }
    
    /*@Override
    public String toString(){
        for(int i = 0; i < P.size(); i++){
            return i+1 + "." + P.get(i).toString() + "\n";
        }
        return "blalaalla";
    }*/
    
    
}
