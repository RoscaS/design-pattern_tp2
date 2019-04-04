package tp2.partie2_state.states;

import tp2.partie2_state.Commande;
import tp2.partie2_state.State;

public class StateEnvoyee extends State {
    public StateEnvoyee(Commande commande) {
        super(commande);
    }

    @Override
    public void traiter() {
        System.out.println("SENT");
    }
}
