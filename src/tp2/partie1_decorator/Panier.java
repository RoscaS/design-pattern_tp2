package tp2.partie1_decorator;

import java.util.ArrayList;
import java.util.List;

public class Panier implements Component {

    private List<Component> components;

    public Panier() {
        this.components = new ArrayList<>();
    }

    public void ajouter(Component component) {
        components.add(component);
    }

    @Override
    public boolean contientPepin() {
        for (Component component : components) {
            if (component.contientPepin()) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        components.forEach(i -> sb.append(i).append(" "));
        return "Panier" + sb.toString().trim().replaceAll(" ", ",") + "]";
    }
}
