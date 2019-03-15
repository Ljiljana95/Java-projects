/*
5. Kreirati klasu koja predstavlja procesor računara. Procesor je jedna od 
specijalizacija komponenti računara i opsan je sledećim podacima: Radni takt, Broj jezgara.
 */
package prodavnica;

/**
 *
 * @author Home
 */
public class Procesor extends Komponenta{
    private Double radniTakt;
    private Integer brJezgara;
    
    public Procesor(){}
    /*public Procesor(Double radniTakt, Integer brJezgara){
        super();
        this.brJezgara=brJezgara;
        this.radniTakt = radniTakt;
    }*/
    public Procesor(Double radniTakt, Integer brJezgara){
        super("Procesor"); //zasto ovakko??
        this.brJezgara=brJezgara;
        this.radniTakt = radniTakt;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" + "Radni takt: " + 
                radniTakt.toString() + "\n" + "Broj jezgara: " +
                brJezgara.toString() + "\n";
    }
    
}
