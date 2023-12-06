
package konyvtarprogram;

import java.util.UUID;

public class Konyv extends AbstractTermek implements Kolcsonozheto {
    private UUID id;
    private String cim;
    
    public Konyv(String cim) {
        this.id = UUID.randomUUID();
        this.cim = cim;
        
    }

    public UUID getId() {
        return id;
    }

    public String getCim() {
        return cim;
    }
    
    @Override
    public String toString() {
        return "Konyv{" + "id=" + id + ", cim=" + cim + '}';
    }

    @Override
    public void kolcsonzes() {
        System.out.println("Kölcsönözhető");
    }
    
    
}
