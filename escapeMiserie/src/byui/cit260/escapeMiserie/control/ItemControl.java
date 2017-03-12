/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeMiserie.control;

/**
 *
 * @author Eddie Pincay
 */
public class ItemControl {
    public double addToInventoryType(double inventoryType, double amount){
        
        if(inventoryType < 0 || inventoryType > 9){ //The inventoryType is between 1-8
            return -1;
        }
        if (amount < 0){ //The amount is no possible negative number
            return -1;
        }
        amount ++;
        return amount;
    }
    public double removeFromInventory(double inventoryType, double amount){
        if(inventoryType < 0 || inventoryType > 9){ //The inventoryType is between 1-8
            return -1;
        }
        if (amount < 1){ //The amount is no possible negative number
            return -1;
        }
        amount --;
        return amount;
    }
<<<<<<< HEAD
=======

>>>>>>> origin/master
}
