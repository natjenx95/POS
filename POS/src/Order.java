/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emilio Arellano
 */
public abstract class Order {
    
    public abstract double price();
    public abstract void add(Item item);
    public abstract void paid();
}
