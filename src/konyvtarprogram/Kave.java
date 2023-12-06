
package konyvtarprogram;

import java.util.UUID;

public class Kave extends AbstractTermek{
    private UUID id;
    private String tipus;

    public Kave(String tipus) {
        this.id = UUID.randomUUID();
        this.tipus = tipus;
    }

    public UUID getId() {
        return id;
    }

    public String getTipus() {
        return tipus;
    }
    
    @Override
    public String toString() {
        return "Kave{" + "id=" + id + ", tipus=" + tipus + '}';
    }     
}
