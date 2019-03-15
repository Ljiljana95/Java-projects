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
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aerodrom2 A = new Aerodrom2(3, 50.0, 3.0);
        
        Putnicki p1 = new Putnicki(15, 3.0);
        Putnicki p2 = new Putnicki(20, 4.0);
        
        Teretni t1 = new Teretni(40.0, 5.0); 
        Teretni t2 = new Teretni(20.0, 6.0);
        
        System.out.println("Trenutni prihod na aerodromu je: " + A.income());
        
        A.getFlightPermission(p1, 1);
        System.out.println("Trenutni prihod na aerodromu je: " + A.income());
        
        A.getFlightPermission(p2, 1);
        System.out.println("Trenutni prihod na aerodromu je: " + A.income());
        
        A.getFlightPermission(p2, 2);
        System.out.println("Trenutni prihod na aerodromu je: " + A.income());
        
        A.takeOff(1);
        System.out.println("Trenutni prihod na aerodromu je: " + A.income());
       
        A.getFlightPermission(p2, 0);       
        System.out.println("Trenutni prihod na aerodromu je: " + A.income());
        
        System.out.println(A);
    }
}
