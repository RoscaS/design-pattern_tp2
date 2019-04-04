package tp2.partie1_decorator.variante2;

import tp2.partie1_decorator.Style;
import tp2.partie1_decorator.Component;

public class DecoratorB extends BaseDecorator {

    public DecoratorB(Component target) {
        super(target, Style.CHEVRONS);
    }
}
