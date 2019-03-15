/*
Aerodrom karakterišu maksimalan broj mesta za avione, maksimalna težina aviona
koji može da sleti na njega i cena aerodromske takse po jedinici ukupne težine,
tj. po kilogramu, aviona. Aerodrom se kreira prazan. Nakon toga, pomoću metode 
"getFlightPermission" konkretan avion traži dozvolu da sleti na aerodrom.
U zavisnosti od težine aviona, kao i popunjenosti aerodroma, odgovor može da 
bude pozitivan ili negativan. Ukoliko je pozitivan, avion se "smešta" na aerodrom.
Pomoću metode "takeOff" avion sa zadate pozicije mesta na aerodromu napušta isti.
Ukoliko se zada pozicija na kojoj nema aviona, rezultat operacije je negativan.
U suprotnom je pozitivan. Metodom "income" određuje se trenutni prihod aerodroma 
tako što se sabiraju takse po svakom avionu koji se nalazi na aerodromu. 
Za aerodrom treba obezbediti i adekvatan tekstualni ispis informacija 
(metoda "toString") i to tako što se redom, u zasebnim linijama, ispisuju redni 
broj aerodromskog mesta praćen informacijom o avionu koji se nalazi na tom mestu. 
Ukoliko je mesto prazno, tada se nakon rednog broja ispisuje tekst "<empty>". 
Redni brojevi aerodromskih mesta počinju brojem 1!
 */
package aerodrom;

import java.util.*;

/**
 *
 * @author Home
 */
public class Aerodrom {

    /**
     * @param args the command line arguments
     */
    private int maxMesta;
    //private int slMesta;
    private LinkedList<Avion> terminali;
    private double maxTezinaAviona;
    private double cena;
    
    
    
    public Aerodrom(double m, int n,double c){
        maxTezinaAviona = m;
        cena = c;
        maxMesta = n;
        terminali = new LinkedList<>();
        
    }
    
    public boolean getFlightPermission(Avion a){
        //slMesta = maxMesta;
       if(a.getWeight() < maxTezinaAviona && terminali.size() < maxMesta){
           terminali.add(a);
           System.out.println( "Avion je sleteo! ") ;
           maxMesta--;
           return true;   
       }
       else{
           System.out.println( "Avion ne moze da sleti! ") ;
           return false;
       } 
    }  
    public boolean takeOff(int i){
        if( i <= terminali.size() && terminali.get(i) != null){
            Avion a = terminali.get(i);
            terminali.remove(a);
            maxMesta++;
            System.out.println( "Avion je poleteo! ") ;
        return true;
        }else{
            return false;
        }
    }   
    
    public double income(){
        double prihod = 0;
        for(int i = 0; i < terminali.size(); i++){
            prihod = prihod + cena*(terminali.get(i).getWeight());
        }
        return prihod; 
    }
    
    @Override
    public String toString(){
        for(int i = 0; i < terminali.size(); i++){
            if(terminali.get(i) != null){
                return i+1 + "." + terminali.get(i).toString() + "\n";
            }else{
                return i+1 + ". je prazno." +  "\n";
            }   
        }  
        return "Ceo aerodrom.";
    }
}
