package com.example;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Player tim = new Player("Tim Smith",7);
      //  System.out.println(tim.getHandleName());
      //  System.out.println(tim.getWeapon().getName());
        Weapon myAxe= new Weapon("GoldShine Axe",15,50);
        tim.setWeapon(myAxe);
      //  System.out.println(tim.getWeapon().getName());
        InventoryItem redPotion= new InventoryItem("Red Potion",ItemType.POTION);
        tim.addInventoryItem(redPotion);
        tim.addInventoryItem(new InventoryItem("+3 chest Armor", ItemType.ARMOR));
        tim.addInventoryItem(new InventoryItem("Ring of Protection +2", ItemType.RING));
        tim.addInventoryItem(new InventoryItem("Invisibility Potion", ItemType.POTION));

        InventoryItem bluePotion= new InventoryItem("Blue Potion",ItemType.POTION);

        boolean wasDeleted=tim.dropInventoryItem(redPotion);
        System.out.println(wasDeleted);
        ArrayList<InventoryItem> allItems = tim.getInventoryitems();
        for(InventoryItem item:allItems){
            System.out.println(item.getName());

        }

    }
}

