package tp2.partie1_decorator.variante1;

import tp2.partie1_decorator.Fruit;
import tp2.partie1_decorator.Panier;
import tp2.partie1_decorator.Style;

public class Client {

    public static void main(String[] args) {
        Fruit f1 = new Fruit("Banane", false);
        Fruit f2 = new Fruit("Pomme", true);
        Fruit f3 = new Fruit("Orange", true);
        Panier p = new Panier();

        System.out.println(f1); // Banane
        System.out.println(new Decorator(f1, Style.ACCOLADES)); // {Banane|Sans pépin}
        System.out.println(new Decorator(new Decorator(f1, Style.CHEVRONS), Style.ACCOLADES)); // {<Banane/Sans pépin>|Sans pépin}

        p.ajouter(f1);
        p.ajouter(f2);

        Decorator dAP = new Decorator(p, Style.ACCOLADES);

        System.out.println(p);   // Panier[Banane,Orange]
        System.out.println(dAP); // {Panier[Banane,Orange]|Avec pépin}

        p.ajouter(f3);

        System.out.println(p);   // Panier[Banane,Orange, Pomme]
        System.out.println(dAP); // {Panier[Banane,Orange, Pomme]|Avec pépin}

        System.out.println(new Decorator(p, Style.PARENTHESES)); // (Panier[Banane,Orange,Banane];Avec pépin)
    }
}
