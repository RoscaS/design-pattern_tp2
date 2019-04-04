package tp2.partie2_state;

public abstract class State {
    protected Commande commande;

    public State(Commande commande) {
        this.commande = commande;
    }

    public abstract void traiter();
}
