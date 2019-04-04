package tp2.partie1_decorator;

public class Fruit implements Component {

    private String nom;
    private boolean pepin;

    public Fruit(String nom, boolean pepin) {
        this.nom = nom;
        this.pepin = pepin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean contientPepin() {
        return pepin;
    }

    @Override
    public String toString() {
        return nom;
    }
}
