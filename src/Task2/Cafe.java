package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Task 2.c
public class Cafe {
    ArrayList<String> coffeeMenu;


    //Task 2.c, 2.d
    public ArrayList<String> loadMenuData() {
        coffeeMenu = new ArrayList<>();
        File file = new File("coffees.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
            System.out.println("File not found. Check path and filename: " + e.getMessage());
        }
        return coffeeMenu;
    }

}