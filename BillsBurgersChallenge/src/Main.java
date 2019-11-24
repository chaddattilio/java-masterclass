import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "White");

        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Cheese", 0.50);
        hamburger.addHamburgerAddition3("Lettuce", 0.38);

        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyHamburger healthyHamburger = new HealthyHamburger("Bacon", 5.67);
        healthyHamburger.addHealthyHamburgerAddition1("Egg", 5.43);
        healthyHamburger.addHealthyHamburgerAddition2("Hummus", 3.45);

        System.out.println("Total healthy burger price is " + healthyHamburger.itemizeHamburger());
    }
}
