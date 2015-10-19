/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse216.unittest.hw;

/**
 *
 * @author Emilio Arellano
 */
public class Item {
    
     private String name;
     private int id;
     private double scost;
     private double rcost;
     
     public Item (String name, int id, double scost, double rcost) {
          this.name = name;
          this.id = id;
          this.scost = scost;
          this.rcost = rcost;
     }

     
     public String getName () {
          return name;
     }
     
     public int getId () {
          return id;
     }
     
     public double getScost () {
          return scost;
     }
     
     public double getRcost () {
          return rcost;
     }
     
     public boolean equals(Object o){
         if(o instanceof Item){
             Item i = (Item)o;
             if(this.id == i.id) 
                 return true;
         }
         return false;
     }
     
     public void pprint () {
          System.out.print(name+ " ");
          System.out.print(scost);
     }
}
