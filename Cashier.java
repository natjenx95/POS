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
public class Cashier {
    private String emId;
     private String name;
     
     public Cashier (String emId, String name) {
          this.emId = emId;
          this.name = name;
     }
     
     public String getemId () {
          return emId;
     }
     
     public String getName () {
          return name;
     }
}
