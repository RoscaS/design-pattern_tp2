package tp2.partie2_state;

import tp2.partie2_state.states.StateAttente;


public class Commande {
    private State state;

    public Commande() {
        this.state = new StateAttente(this);
    }

    public void traiter() {
        state.traiter();
    }

    public void setState(State state) {
        this.state = state;
    }
}
