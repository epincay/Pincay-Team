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
public class SecurityControl {
<<<<<<< HEAD
    public boolean moveSecurity(double guard, double position){
        if(guard < 1 || guard > 5){ //The guard is between 1-5
            return false;
        }
        if (position < 0){ //The position is no possible negative number
            return false;
        }
        if (position < 1 || position >20){ //The position is between 1-20
            return false;
        }
        return true;
    }
    public double catchPlayer(double guardPosition, double playerPosition, double amount){
        
        if (guardPosition < 1 || guardPosition >20){ //The guardPosition is between 1-20
            return -1;
        }
        if (playerPosition < 1 || playerPosition >20){ //The playerPosition is between 1-20
            return -1;
        }
        if(amount <1 || amount>3){ //The amount is between 1-3
            return -1;
        }
        if(guardPosition == playerPosition){
            amount++;
        }       
        return amount;
    }
=======
>>>>>>> origin/master
    
}
