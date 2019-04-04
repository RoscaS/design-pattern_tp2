package tp2.partie1_decorator.variante2;

import tp2.partie1_decorator.Style;
import tp2.partie1_decorator.Component;

public abstract class BaseDecorator implements Component {

    private Component target;
    protected Style style;

    public BaseDecorator(Component target, Style style) {
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
        sb.append( " pépin").append(style.getRight());
        return sb.toString();
    }
}
