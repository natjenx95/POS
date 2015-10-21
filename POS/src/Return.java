
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emilio Arellano
 */
public class Return extends Order{
    private ArrayList<Item> items;
    private CustomerClass customer;
    private double price;
    private boolean paid;
    
    public Return(CustomerClass customer){
        this.customer = customer;
        this.items = new ArrayList();
    }
    
    /**
     * Verifies if the item was sold more than a month ago or
     * if rented if its returned before the due date or not
     * @param item the item to be checked
     * @return the amount of days past due date or negative numbers if due
     * date hasn't passed
     */
    public int VerifyDueDate(Item item){
       return 0; 
    }
    
    /**
     * Marks item as returned and updates inventory
     * @param item 
     */
    public void markAsReturned(Item item){
        
    }
    
    /**
     * approves the return order
     */
    public void approve(){
        
    }
    
    /**
     * 
     * @return the amount due based on the days passed after the return date
     */
    public int calculateReturnPayment(){
        return 0;
    }
    
    public void add(Item item){
        items.add(item);
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public void paid() {
        paid = true;
    }
}
