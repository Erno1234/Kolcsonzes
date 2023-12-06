
package konyvtarprogram;

import java.util.UUID;

public class Konyv extends AbstractTermek implements Kolcsonozheto {
    
    private String cim;

    public Konyv(UUID id,String cim) {
        super(id);
        this.cim = cim;
    }
   

    public String getCim() {
        return cim;
    }

    @Override
    public String toString() {
        return "Konyv{" + "cim=" + cim + '}';
    }
    
  

    @Override
    public void kolcsonzes() {
       
    }
    
    
}
