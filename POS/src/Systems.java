/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emilio Arellano
 */
public class Systems {
    private ProductCatalog catalog;
    private Order order; 
    
    public static void run (Systems sys) {
          Scanner scan = new Scanner (System.in);
          System.out.println("Please enter the customer name");
          String name = scan.next();
          CustomerClass temp = new CustomerClass (name, 10001);
          
          
          ArrayList <Item> cart = new ArrayList <Item> ();
          System.out.println("Enter the UPC of the item");
          System.out.println("Enter \"done\" once all items are scanned");
          
          while (true) {
               int upc = 0;
               String ans = "";
               if (scan.hasNextInt()) {
                    upc = scan.nextInt();
               } else {
                    ans = scan.next();
               }
               ProductCatalog cat = new ProductCatalog ();
               while (true) {
                    if (cat.upcs.contains(upc) || ans.equals("done")) {
                         break;
                    } else {
                         System.out.println("Input not recognized");
                         System.out.println("Please try again");
                         if (scan.hasNextInt()) {
                              upc = scan.nextInt();
                         } else {
                              ans = scan.next();
                         }
                    }
               }
               ans = ans.toLowerCase();
               if (ans.equals("done")) {
                    break;
               }
               cart.add(cat.getItem(upc));
          }
          
          String time = new SimpleDateFormat("dd-MM-yyyy").format(new java.util.Date());
          for (int i = 0; i < cart.size(); i++) {
               Sale sales = new Sale (time, cart.get(i), temp);
               sales.print();
          }
     }
     
     /**
      * 
      * @param upc of the item to be added to the  
      */
     public void enterItems(int upc){
        if (catalog.upcs.contains(upc)) {
            order.add(catalog.getItem(upc));
        } 
        else {
            System.out.println("Input not recognized");
            System.out.println("Please try again");
        }
     }
     
     /**
      * 
      * @param payment the amount given by the costumer to pay for the order
      * @return the change for the costumer or what is still owed if payment 
      * doesn't cover full price (negative number).
      */
     public double receivePayment(double payment){
         if(payment > order.price()){
             order.paid();
         }
         return payment - order.price();
     }
     
     public static void main (String [] args) {
          Systems sys = new Systems ();
          run(sys);
     }
}
