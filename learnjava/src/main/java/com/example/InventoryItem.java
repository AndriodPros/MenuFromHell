package com.example;

/**
 * Created by Juan on 5/4/2016.
 */
enum ItemType {POTION,RING,ARMOR}
public class InventoryItem {
    private ItemType type;
    private String name;

    public InventoryItem(String name, ItemType type) {
        this.name = name;
        this.type = type;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
