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
public class Aerodrom2 {
    private Integer maxMesta;
    private Double maxTezina;
    private Double cena;
    
    private Avion []terminali;
    
    public Aerodrom2(){}
    public Aerodrom2(Integer maxMesta, Double maxTezina, Double cena){
        this.maxMesta = maxMesta;
        this.maxTezina = maxTezina;
        this.cena = cena;
        terminali = new Avion[maxMesta];
    }
    
    //VRATITI SE OVDE!!
    
    public boolean getFlightPermission(Avion a, int i){
        if(a.getTezina() > maxTezina || terminali[i] != null){
            System.out.println("Avion ne moze da sleti na " + i +". poziciju.");
            return false;   
        }
        terminali[i] = a;
        System.out.println("Avion je sleteo na " + i + ". poziciju.");        
        return true;       
    }
    public boolean takeOff(int i){
        if( terminali[i] == null && i < 0 && i > terminali.length ){
            System.out.println("Na ovoj poziciji nema nijednog aviona.");
            return false;
        }
        terminali[i] = null;
        System.out.println("Avion je odleteo sa " + i + ". pozicije.");    
        return true;
    }
    
    public Double income(){
        Double prihod = 0.;
        for(int i = 0; i < terminali.length; i++){
            if(terminali[i] != null){
                prihod += terminali[i].getTezina()*cena;}
        }
        return prihod;
    }
    
    @Override   //ZASTO NECE SVE DA MI ISPISE NEGO SAMO 1 ?!!
    public String toString(){
        for(int i = 0; i < terminali.length; i++){
            if( terminali[i] == null){
                return i + "." + " mesto je prazno!" + "\n" ;
            }
            return i + "." + terminali[i].toString() + "\n" ;
        }
           return "A" ;
    }
    
}
