package tp2.partie2_state.states;

import tp2.partie2_state.Commande;
import tp2.partie2_state.State;

public class StateAttente extends State {
    public StateAttente(Commande commande) {
        super(commande);
    }

    @Override
    public void traiter() {
        commande.setState(new StatePayee(commande));
    }
}
