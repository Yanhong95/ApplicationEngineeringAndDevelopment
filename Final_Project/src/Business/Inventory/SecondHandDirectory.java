/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.Book.Book;
import Business.Item.Item;
import java.util.ArrayList;

/**
 *
 * @author chenchen
 */
public class SecondHandDirectory {
    private ArrayList<Item> itemList;
    
    public SecondHandDirectory(){
        itemList = new ArrayList<>();
    }
    
    public ArrayList<Item> getItemList(){
        return itemList;
    }
    
    public Item addBook(int mid, int quantity, double price,Book book){
        Item item = new Item(mid,quantity,price,book);
        itemList.add(item);
        return item;
    }
}
