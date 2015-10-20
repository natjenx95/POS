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
public class CustomerClass {
     private String name;
     private int id;
     
     public CustomerClass (String name, int id) {
          this.name = name;
          this.id = id;
     }
     
     public String getName () {
          return name;
     }
     
     public int getId () {
          return id;
     }
     
     public void cprint () {
          System.out.print(name+ " " +id);
     }
     
     /*public boolean containscust (CustomerClass temp) {
          if (cust.contains(temp)) {
               return true;
          }
          return false;
     }
     
     public void addCust (CustomerClass temp) {
          cust.add(temp);
     }*/
}
