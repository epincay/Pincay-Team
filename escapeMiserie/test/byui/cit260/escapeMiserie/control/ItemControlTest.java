/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeMiserie.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eddie Pincay
 */
public class ItemControlTest {
    
    public ItemControlTest() {
    }

    /**
     * Test of addToInventoryType method, of class ItemControl.
     */
    @Test
    public void testAddToInventoryType() {        
        System.out.println("addToInventoryType");
        
        /*****************************
         *  Test case #1
         */
        System.out.println("\t Test case #1");
        
        //input values for test case #1
        double inventoryType = 3.0;
        double amount = 2.0;
        
        //created instance of ItemControl class
        ItemControl instance = new ItemControl();
        
        double expResult = 3.0; //expected output returned value
        
        //call function to run test
        double result = instance.addToInventoryType(inventoryType, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.000001);
        
        /*****************************
         *  Test case #2
         */
        System.out.println("\t Test case #2");
        
        //input values for test case #2
        inventoryType = -3.0;
        amount = 2.0;   
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.addToInventoryType(inventoryType, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.000001);
        
        /*****************************
         *  Test case #3
         */
        System.out.println("\t Test case #3");
        
        //input values for test case #3
        inventoryType = 4.0;
        amount = -2.0;   
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.addToInventoryType(inventoryType, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.000001);
        
        /*****************************
         *  Test case #4
         */
        System.out.println("\t Test case #4");
        
        //input values for test case #4
        inventoryType = 10.0;
        amount = 2.0;   
        
        expResult = -1.0; //expected output returned value
        
        //call function to run test
        result = instance.addToInventoryType(inventoryType, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.000001);
        
        /*****************************
         *  Test case #5
         */
        System.out.println("\t Test case #5");
        
        //input values for test case #5
        inventoryType = 0.0;
        amount = 4.0;   
        
        expResult = 5.0; //expected output returned value
        
        //call function to run test
        result = instance.addToInventoryType(inventoryType, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.000001);
        
        /*****************************
         *  Test case #6
         */
        System.out.println("\t Test case #6");
        
        //input values for test case #6
        inventoryType = 2.0;
        amount = 0.0;   
        
        expResult = 1.0; //expected output returned value
        
        //call function to run test
        result = instance.addToInventoryType(inventoryType, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.000001);
        
        /*****************************
         *  Test case #7
         */
        System.out.println("\t Test case #7");
        
        //input values for test case #7
        inventoryType = 1.0;
        amount = 1.0;   
        
        expResult = 2.0; //expected output returned value
        
        //call function to run test
        result = instance.addToInventoryType(inventoryType, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.000001);
    }
    
}
