/*
Program realizovati poštujući sledeća uputstva:

* Sve klase treba da budu deo paketa "aerodrom".
* Svaka klasa treba da se nalazi u posebnom *.java fajlu
* U poseban Main.java fajl smestiti klasu "Main" u kojoj se nalazi funkcija "main".
 */
package aerodrom;

/**
 *
 * @author Home
 */
public class Main {
    public static void main( String[] args ){
        Aerodrom a = new Aerodrom(20,2,5);
        Putnicki a1 = new Putnicki(3,15);
        Putnicki a2 = new Putnicki(2,15);
        Teretni a3 = new Teretni(3,20);
        
        a.getFlightPermission(a1);
        a.getFlightPermission(a2);
        a.getFlightPermission(a3);
        
        a.takeOff(0);
      
       // a.takeOff(1);
        //a.takeOff(2);
        
       System.out.println( "Prihod je: " + a.income( )) ;
       System.out.println( a.toString( )) ;
        
    }
}
