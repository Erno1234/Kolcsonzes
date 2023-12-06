
package konyvtarprogram;

import java.util.UUID;

public class Kave extends AbstractTermek{
    private UUID id;
    private String tipus;

    public Kave(UUID id, String tipus) {
        super(id);
         this.tipus = tipus;
    }



    public String getTipus() {
        return tipus;
    }
    
    @Override
    public String toString() {
        return "Kave{" + "id=" + id + ", tipus=" + tipus + '}';
    }     
}
