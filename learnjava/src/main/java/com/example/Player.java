package com.example;

import java.util.ArrayList;

/**
 * Created by Juan on 5/3/2016.
 */
public class Player {
   private String handleName;
    private int lives;
    private int level;
    private int score;
    private  Weapon weapon;
    private ArrayList<InventoryItem> inventoryitems;

    public Player(){
        handleName= "Unknown Player";
        this.lives=3;
        this.level=1;
        this.score=0;
        setDefaultWeapon();
        inventoryitems= new ArrayList<InventoryItem>();
    }
    public Player(String handle){
        this();
        setHandleName(handle);
    }
    public Player(String handle,int level){
        this();
        setHandleName(handle);
        setLevel(level);
    }
    private void setDefaultWeapon(){
        weapon= new Weapon("Sword",10,20);
    }
    public String getHandleName(){
        return handleName;
    }
    public void setHandleName(String handle){
        if(handle.length()<3)
            return;
        handleName = handle;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<InventoryItem> getInventoryitems() {
        return inventoryitems;
    }

//    public void setInventoryitems(ArrayList<InventoryItem> inventoryitems) {
//        this.inventoryitems = inventoryitems;
//    }
    public void addInventoryItem(InventoryItem inventoryItem){
        inventoryitems.add(inventoryItem);
    }
    public boolean dropInventoryItem(InventoryItem inventoryItem){
        if(inventoryitems.contains(inventoryItem)){
            inventoryitems.remove(inventoryItem);
            return true;
        }
        return false;
    }
}
