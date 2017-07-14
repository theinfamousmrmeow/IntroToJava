/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosc2336_ex18_26;
import java.util.*;
/**
 *
 * @author Dante
 */
public class Inventory {
    Map<String, Integer> items = new HashMap<>();
    
    public void add(String _item){
            //If we dont have it, add to map.  If we do, increase the value by one.
            if (!items.containsKey(_item)) {items.put(_item, 1);}
            else {items.put(_item, items.get(_item)+1);}
    }
    public boolean take(String _item){
            //If we dont have it, add to map.  If we do, increase the value by one.
            if (!items.containsKey(_item)){return false;}
            if (items.get(_item)>1) {items.put(_item, items.get(_item)-1);}
            else {items.remove(_item);}
            return true;
    }
    
    public void printInventory(){
        System.out.println(items.toString());
    }
    
    public boolean transferTo(Inventory _inventory, String _item){
        _inventory.add(_item);
        take(_item);
        //It all worked.
        return true;
    }
    
}
