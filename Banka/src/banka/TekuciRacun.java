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
public class TekuciRacun extends Racun{
    private Double mesecnaNaknada;
    
    public TekuciRacun(){}
    public TekuciRacun(Osoba vlasnikRacuna, Double stanjeRacuna, Double mesecnaNaknada){
        super(vlasnikRacuna, stanjeRacuna);
        this.mesecnaNaknada = mesecnaNaknada;
    }
    
    public Double getMesecnaNaknada(){
        return mesecnaNaknada;
    }
    public void setMesecnaNaknada(Double mesecnaNaknada){
         this.mesecnaNaknada = mesecnaNaknada;
    }
    
    
    public Double obracunajMesecnuNaknadu(){
        Double d = super.getStanjeRacuna();
        if( mesecnaNaknada < super.getStanjeRacuna()){            
            d -= mesecnaNaknada; 
        }  
        System.out.println("Mesecna naknada je: " + d);
        super.setStanjeRacuna(d);
        return d;
    }
    
    @Override
    public void uplatiPare(Double suma){
        suma = suma - 0.01/100;
        super.setStanjeRacuna(super.getStanjeRacuna() + suma );
        System.out.println("Pare su uplacene na tekuci racun.");
    }
    
    @Override
    public boolean podigniPare(Double suma){
        super.setStanjeRacuna(super.getStanjeRacuna() - suma);
        System.out.println("Pare su podignute sa tekuceg racuna.");
        return true;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Mesecna naknada je :" + getMesecnaNaknada();
    }
    
}
