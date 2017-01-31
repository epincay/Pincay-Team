/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapemiserie;

import byui.cit260.escapeMiserie.model.Map;
import byui.cit260.escapeMiserie.model.Game;
import byui.cit260.escapeMiserie.model.Item;
import byui.cit260.escapeMiserie.model.Move;
import byui.cit260.escapeMiserie.model.Player;
import byui.cit260.escapeMiserie.model.Security;

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
        
        Game gameOne = new Game();
        
        gameOne.setTotalTime(30.00);
        gameOne.setNoGuard(1);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Item itemOne = new Item();
        
        itemOne.setInventoryType("Shovel");
        itemOne.setInformation("To dig a hole");
        
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        Move moveOne = new Move();
        
        moveOne.setEast(true);//I need validate the player only have a one moved
        moveOne.setNorth(false);
        moveOne.setSouth(false);
        moveOne.setWest(false);
        
        String moveInfo = moveOne.toString();
        System.out.println(moveInfo);
        
        Map mapOne = new Map();
        
        mapOne.setView("I need created the map");
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Security securityGame = new Security();
        
        securityGame.setViewTower(2.00);
        securityGame.setGuard(8.00);
        
        String securityInfo = securityGame.toString();
        System.out.println(securityInfo);
    }
    
}
