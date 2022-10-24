package restaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MenuItem appetizer1 = new MenuItem(5.99, "korean dumpling with cabbage and pork filling","appetizer", false, "Korean dumpling");
        MenuItem appetizer2 = new MenuItem(6.99, "Deep fried calamari with yum yum sauce on th side ","appetizer", false, "fried calamari");
        MenuItem appetizer3 = new MenuItem(5.99, "seaweed soup boiled 24 hours","appetizer", false, "Miso soup");
        MenuItem appetizer4= new MenuItem(10.00,"Tangy","Appetizer", true,"TeriyakiMeatballs");

        MenuItem entree1 = new MenuItem(10.99, "red sauce","entree", false, "Traditional spaghetti");
        MenuItem entree2 = new MenuItem(10.99, "caribbean crab salad","entree", true, "Crab Salad");
        MenuItem entree3 = new MenuItem(9.99, "Burrito with red beans","entree", true, "Miss Burrito");
        MenuItem entree4= new MenuItem(12.99,"seafood garden collection","entree", false,"Seafood Garden");

        ArrayList<MenuItem> myMenuItems = new ArrayList<>();
        myMenuItems.add(appetizer1);
        myMenuItems.add(appetizer2);
        myMenuItems.add(appetizer3);
        myMenuItems.add(appetizer4);
        myMenuItems.add(entree1);
        myMenuItems.add(entree2);
        myMenuItems.add(entree3);
        myMenuItems.add(entree4);

        Menu ourMenu = new Menu( new Date(), myMenuItems);

       ourMenu.printMenu();
  }

}

