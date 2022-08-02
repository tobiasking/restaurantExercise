package Restaurant;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    //main method
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>(Arrays.asList(
                new MenuItem(
                        "Pineapple Pizza",
                        9.99,
                        "Pizza and pineapple. Why would you ever need other toppings?",
                        "main course"),
                new MenuItem(
                        "Pineapple Pasta",
                        10.79,
                        "Durum wheat pasta and freshly ripened, locally sourced pineapples.",
                        "main course"),
                new MenuItem(
                        "Pineapple Upside Down Cake",
                        7.50,
                        "Our homemade recipe, famous the world around!",
                        "dessert"),
                new MenuItem(
                        "Pineapple Brined Pork Belly",
                        8.75,
                        "Pineapple and Pork belly. Can remove the Pork belly for a vegetarian option",
                        "appetizer")));

        Menu menu = new Menu(menuItems);
         menu.addMenuItem(new MenuItem(
                "Pineapple Smoothie",
                6.45,
                "Pineapple and Coconut milk, ice-blended to perfection. Extra pineapple is available for 0.75",
                "dessert"));
            menu.printMenu();

        //Print the entire, updated menu to the screen.
        menu.printMenu();


        //print an item alone
        //System.out.println(menuItems.get(1));

        //delete the menu + reprint
        menuItems.remove(3);
        menu.printMenu();

    }
}
