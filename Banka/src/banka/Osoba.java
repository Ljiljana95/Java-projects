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
public class Osoba {
    private Double JMBG;
    private String ime;
    private String prezime;
    
    public Osoba(){}
    public Osoba(Double JMBG,String ime,String prezime){
        this.JMBG = JMBG;
        this.ime = ime;
        this.prezime = prezime;
    }
    public Double getJMBG(){
        return JMBG;
    }
    public void setJMBG(Double JMBG){
         this.JMBG = JMBG;
    }
    public String getIme(){
        return ime;
    }
    public void setIme(String ime){
         this.ime = ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public void setPrezime(String prezime){
         this.prezime = prezime;
    }
    @Override
    public String toString(){
        return "Ime: " + getIme() + " Prezime: " + getPrezime() + " JMBG: " + getJMBG();
    }
    
}
