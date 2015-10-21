/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Emilio Arellano
 */
public class ProductCatalog {
     public ArrayList <Item> list = new ArrayList <Item> ();
     public ArrayList <Integer> upcs = new ArrayList <Integer> ();
     
     public ProductCatalog () {
          Item oceans = new Item ("Ocean's Eleven", 1001, 10.00, 5.00);
          list.add(oceans);
          upcs.add(oceans.getId());
          Item risky = new Item ("Risky Business", 1002, 5.00, 2.50);
          list.add(risky);
          upcs.add(risky.getId());
     }
     
     public void addItem (Item temp) {
         list.add(temp);
         upcs.add(temp.getId());
     }
     
     public Item getItem (int upc) {
          return list.get(upcs.indexOf(upc));
     }
}
