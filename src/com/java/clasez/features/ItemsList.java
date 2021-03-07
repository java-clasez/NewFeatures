package com.java.clasez.features;

import java.util.ArrayList;
import java.util.Iterator;

public class ItemsList {
    public static void main(String[] args) {
        ArrayList<Item> itemsList = new ArrayList<>();

        itemsList.add(new Item("Rice", 7));
        itemsList.add(new Item("Potato", 2));
        itemsList.add(new Item("Tomato", 1));
        itemsList.add(new Item("Cookies", 2));
        itemsList.add(new Item("Chocolate", 3));

        // for each item in itemsList
        // - print the item
        for(Item item: itemsList){
            System.out.println(item);
        }
        System.out.println("---------------------");

        // Old way 1 (with indexes)
        // Start from 0th index, loop to the max index while incrementing index each time
        // get the element at 'current' index
        // print the element
        for(int i=0; i<itemsList.size(); i++){
            System.out.println(itemsList.get(i));git
        }
        System.out.println("-----------------------");

        // Old way 2 (with Iterator)
        Iterator<Item> itemIterator = itemsList.iterator();

        while(itemIterator.hasNext()){
            Item i = itemIterator.next();
            System.out.println(i);
        }

    }
}
