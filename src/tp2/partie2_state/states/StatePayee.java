package tp2.partie2_state.states;

import tp2.partie2_state.Commande;
import tp2.partie2_state.State;

public class StatePayee extends State {
    public StatePayee(Commande commande) {
        super(commande);
    }

    @Override
    public void traiter() {
        System.out.println("DONE");
        commande.setState(new StateEnvoyee(commande));
    }
}
