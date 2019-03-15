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
public class RacunStednje extends Racun {
    private boolean pokrenutaStednja;
    private Double godisnjiKoeficijentStednje;
    
    public RacunStednje(){}
    public RacunStednje(Osoba vlasnikRacuna, Double stanjeRacuna, boolean pokrenutaStednja, Double godisnjiKoeficijentStednje){
        super(vlasnikRacuna, stanjeRacuna);
        this.godisnjiKoeficijentStednje = godisnjiKoeficijentStednje;
        this.pokrenutaStednja = pokrenutaStednja;
    }
    
    public Double getGodisnjiKoeficijentStednje(){
        return godisnjiKoeficijentStednje;
    }
    public void setGodisnjiKoeficijentStednje(Double godisnjiKoeficijentStednje){
         this.godisnjiKoeficijentStednje = godisnjiKoeficijentStednje;
    }  
    public boolean getPokrenutaStednja(){
        return pokrenutaStednja;
    }
    public void setPokrenutaStednja(boolean pokrenutaStednja){
         this.pokrenutaStednja = pokrenutaStednja;
    }
    
    @Override
    public boolean podigniPare(Double suma){
        boolean retVal;
        if(pokrenutaStednja == true || suma > super.getStanjeRacuna()){
            System.out.println("Pokrenuta je stednja i ne mozete podici pare sa racuna stednje.");
            retVal = false;
        }else{
            super.setStanjeRacuna(super.getStanjeRacuna() - suma);
            System.out.println("Pare su podignute sa racuna stednje.");
            retVal = true;
            
        }
        return retVal;
    }
    @Override
    public void uplatiPare(Double suma){
        super.setStanjeRacuna(super.getStanjeRacuna() + suma );
        System.out.println("Pare su uplacene na racun stednje.");
    }
    
    public void pokreniStednju(){
       System.out.println("Stednja je pokrenuta.");
       pokrenutaStednja = true;
    }
    
    public void obustaviStednju(int meseci){
        pokrenutaStednja = false;
        super.setStanjeRacuna(super.getStanjeRacuna() + super.getStanjeRacuna()*(godisnjiKoeficijentStednje*0.01*(int)(meseci/12)) +
                              super.getStanjeRacuna()*(godisnjiKoeficijentStednje*0.01*(meseci%12)));
         System.out.println("Stednja je obustavljena.");
    }
    
    @Override
    public String toString(){
        return super.toString() + " God koef. stednje je :" +  getGodisnjiKoeficijentStednje();
    }
    
}
