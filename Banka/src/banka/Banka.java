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
public class Banka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Osoba o1 = new Osoba(123.0, "Marko", "Markovic");
        Osoba o2 = new Osoba(133.0, "Pera", "Peric");
        Osoba o3 = new Osoba(143.0, "Jovan", "Jovic");
        
        TekuciRacun t1 = new TekuciRacun(o1, 5.0,2.0);
        TekuciRacun t2 = new TekuciRacun(o2, 4.0,3.0);
        TekuciRacun t3 = new TekuciRacun(o3, 6.0,4.0);
        
        RacunStednje r1 = new RacunStednje(o1, 5.0, true, 50.0);
        RacunStednje r2 = new RacunStednje(o2, 7.0, false, 40.0);
        RacunStednje r3 = new RacunStednje(o3, 4.0, true, 51.0);
        
        t1.podigniPare(2.0);
        t1.obracunajMesecnuNaknadu();
        t1.uplatiPare(3.0);
        t1.obracunajMesecnuNaknadu();
        System.out.println(t1.toString());
        
        r2.podigniPare(2.0);
        r2.obustaviStednju(10);
        r2.uplatiPare(3.0);
        r2.pokreniStednju();
        System.out.println(r2.toString());
        
    }
    
}
