package Task2;

import java.util.ArrayList;
//Task 2.b
public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.loadMenuData();
        ArrayList<String> menu = cafe.loadMenuData();

        for (String coffee : cafe.loadMenuData()) {
            System.out.println(coffee);

        }
    }
}
