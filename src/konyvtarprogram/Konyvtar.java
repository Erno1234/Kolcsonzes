
package konyvtarprogram;

public class Konyvtar {
    private AbstractTermek[] termekek;

    
    public void kolcsonozheto(){
        for (int i = 0; i < termekek.length; i++) {
            AbstractTermek aktTermek = this.termekek[i];
            
        }
    }
    
    public void felvesz(){
       termekek = new AbstractTermek[4];
       termekek[0] = new Kave("fekete");
       termekek[1] = new Konyv("Forest");
       termekek[2] = new Konyv("Alma élete");
       termekek[3] = new Kave("fekete");
        
    }

}
