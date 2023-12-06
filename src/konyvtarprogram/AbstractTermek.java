
package konyvtarprogram;

import java.util.UUID;

public abstract class AbstractTermek {
    private UUID id;

    public AbstractTermek(UUID id) {
       this.id = UUID.randomUUID();
    }
    
    
    
    @Override
    public String toString() {
        return "AbstractTermek{" + '}';
    }
    
}
