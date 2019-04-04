package tp2.partie1_decorator.variante2;

import tp2.partie1_decorator.Fruit;
import tp2.partie1_decorator.Panier;

public class Client {

    public static void main(String[] args) {
        Fruit f1 = new Fruit("Banane", false);
        Fruit f2 = new Fruit("Pomme", true);
        Fruit f3 = new Fruit("Orange", true);
        Panier p = new Panier();

        System.out.println(f1); // Banane
        System.out.println(new DecoratorA(f1)); // {Banane|Sans pépin}
        System.out.println(new DecoratorA(new DecoratorB(f1))); // {<Banane/Sans pépin>|Sans pépin}

        p.ajouter(f1);
        p.ajouter(f2);

        DecoratorA dAP = new DecoratorA(p);

        System.out.println(p);   // Panier[Banane,Orange]
        System.out.println(dAP); // {Panier[Banane,Orange]|Avec pépin}

        p.ajouter(f3);

        System.out.println(p);   // Panier[Banane,Orange, Pomme]
        System.out.println(dAP); // {Panier[Banane,Orange, Pomme]|Avec pépin}

        System.out.println(new DecoratorC(p)); // (Panier[Banane,Orange,Banane];Avec pépin)
    }
}
