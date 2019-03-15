/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

/**
 *
 * @author Home
 */
public abstract class Racun {
    private Osoba vlasnikRacuna;
    private Double stanjeRacuna;
    
    public abstract boolean podigniPare(Double suma);
    public abstract void uplatiPare(Double suma);
    
    public Racun(){}
    public Racun(Osoba vlasnikRacuna, Double stanjeRacuna){
        this.vlasnikRacuna = vlasnikRacuna;
        this.stanjeRacuna = stanjeRacuna;
    }
    public Double getStanjeRacuna(){
        return stanjeRacuna;
    }
    public void setStanjeRacuna(Double stanjeRacuna){
         this.stanjeRacuna = stanjeRacuna;
    }
    public Osoba getVlasnikRacuna(){
        return vlasnikRacuna;
    }
    public void setVlasnikRacuna(Osoba vlasnikRacuna){
         this.vlasnikRacuna = vlasnikRacuna;
    }
    
    @Override
    public String toString(){
        return " Trenutno stanje na racunu je: " + getStanjeRacuna() + 
                " Podaci o vlasniku racuna su: " + getVlasnikRacuna();
    }
}
