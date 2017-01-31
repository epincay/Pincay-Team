/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapemiserie;

import byui.cit260.escapeMiserie.model.Player;

/**
 *
 * @author Eddy
 */
public class EscapeMiserie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Eddie Pincay");
        playerOne.setBestTime(10.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
