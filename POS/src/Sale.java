/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Emilio Arellano
 */
public class Sale {
     private String dateTime;
     private Item prod;
     private CustomerClass dood;
     
     
     public Sale (String dateTime, Item prod, CustomerClass dood) {
          this.dateTime = dateTime;
          this.prod = prod;
          this.dood = dood;
     }
     
     public void print () {
          System.out.print("Date: " +dateTime+ " Product: ");
          prod.pprint();
          System.out.print("Customer: ");
          dood.cprint();
          System.out.println();
     }
}
