package tp2.partie1_decorator.variante1;

import tp2.partie1_decorator.Component;
import tp2.partie1_decorator.Style;

public class Decorator implements Component {

    private Component target;
    private Style style;

    public Decorator(Component target, Style style) {
        this.target = target;
        this.style = style;
    }

    @Override
    public boolean contientPepin() {
        return target.contientPepin();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(style.getLeft());
        sb.append(target).append(style.getSep());
        sb.append(contientPepin() ? "Avec" : "Sans");
        sb.append(" pépin").append(style.getRight());
        return sb.toString();
    }
}
