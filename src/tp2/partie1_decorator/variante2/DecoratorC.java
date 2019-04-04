package tp2.partie1_decorator.variante2;

import tp2.partie1_decorator.Style;
import tp2.partie1_decorator.Component;

public class DecoratorC extends BaseDecorator {

    public DecoratorC(Component target) {
        super(target, Style.PARENTHESES);
    }
}
