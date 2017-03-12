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
 * @author Eddy
 */
public class SecurityControlTest {
    
    public SecurityControlTest() {
    }

    /**
     * Test of moveSecurity method, of class SecurityControl.
     */
    @Test
    public void testMoveSecurity() {
        System.out.println("moveSecurity");
        /*****************************
         *  Test case #1
         */
        System.out.println("\t Test case #1");
        
        //input values for test case #1
        double guard = 1.0;
        double position = 1.0;
        
        //created instance of ItemControl class
        SecurityControl instance = new SecurityControl();
                
        boolean expResult = true;//expected output returned value
        
        //call function to run test
        boolean result = instance.moveSecurity(guard, position);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result); 
        
        /*****************************
         *  Test case #2
         */
        System.out.println("\t Test case #2");
        
        //input values for test case #2
        guard = -1.0;
        position = 20.0;   
                
        expResult = false;//expected output returned value
        
        //call function to run test
        result = instance.moveSecurity(guard, position);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result); 
        
        /*****************************
         *  Test case #3
         */
        System.out.println("\t Test case #3");
        
        //input values for test case #3
        guard = 5.0;
        position = -1.0;   
                
        expResult = false;//expected output returned value
        
        //call function to run test
        result = instance.moveSecurity(guard, position);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*****************************
         *  Test case #4
         */
        System.out.println("\t Test case #4");
        
        //input values for test case #4
        guard = 3.0;
        position = 22.0;   
                
        expResult = false;//expected output returned value
        
        //call function to run test
        result = instance.moveSecurity(guard, position);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*****************************
         *  Test case #5
         */
        System.out.println("\t Test case #5");
        
        //input values for test case #5
        guard = 0.0;
        position = 18.0;   
                
        expResult = false;//expected output returned value
        
        //call function to run test
        result = instance.moveSecurity(guard, position);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*****************************
         *  Test case #6
         */
        System.out.println("\t Test case #6");
        
        //input values for test case #6
        guard = 3.0;
        position = 18.0;   
                
        expResult = true;//expected output returned value
        
        //call function to run test
        result = instance.moveSecurity(guard, position);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*****************************
         *  Test case #7
         */
        System.out.println("\t Test case #7");
        
        //input values for test case #7
        guard = 5.0;
        position = 15.0;   
                
        expResult = true;//expected output returned value
        
        //call function to run test
        result = instance.moveSecurity(guard, position);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
    }

    /**
     * Test of catchPlayer method, of class SecurityControl.
     */
    @Test
    public void testCatchPlayer() {
        System.out.println("catchPlayer");
        /*****************************
         *  Test case #1
         */
        System.out.println("\t Test case #1");
        
        //input values for test case #1
        double guardPosition = 2.0;
        double playerPosition = 2.0;
        double amount = 2.0;
        
        //created instance of ItemControl class
        SecurityControl instance = new SecurityControl();
        
        double expResult = 3.0;//expected output returned value
        
        //call function to run test
        double result = instance.catchPlayer(guardPosition, playerPosition, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        /*****************************
         *  Test case #2
         */
        System.out.println("\t Test case #2");
        
        //input values for test case #2
        guardPosition = -2.0;
        playerPosition = 2.0;
        amount = 2.0;
        
        expResult = -1.0;//expected output returned value
        
        //call function to run test
        result = instance.catchPlayer(guardPosition, playerPosition, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        /*****************************
         *  Test case #3
         */
        System.out.println("\t Test case #3");
        
        //input values for test case #3
        guardPosition = 4.0;
        playerPosition = -2.0;
        amount = 2.0;
        
        expResult = -1.0;//expected output returned value
        
        //call function to run test
        result = instance.catchPlayer(guardPosition, playerPosition, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        /*****************************
         *  Test case #4
         */
        System.out.println("\t Test case #4");
        
        //input values for test case #4
        guardPosition = 21.0;
        playerPosition = 21.0;
        amount = 2.0;
        
        expResult = -1.0;//expected output returned value
        
        //call function to run test
        result = instance.catchPlayer(guardPosition, playerPosition, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        /*****************************
         *  Test case #5
         */
        System.out.println("\t Test case #5");
        
        //input values for test case #5
        guardPosition = 1.0;
        playerPosition = 1.0;
        amount = 2.0;
        
        expResult = 3.0;//expected output returned value
        
        //call function to run test
        result = instance.catchPlayer(guardPosition, playerPosition, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        /*****************************
         *  Test case #6
         */
        System.out.println("\t Test case #6");
        
        //input values for test case #6
        guardPosition = 4.0;
        playerPosition = 2.0;
        amount = 2.0;
        
        expResult = 2.0;//expected output returned value
        
        //call function to run test
        result = instance.catchPlayer(guardPosition, playerPosition, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        /*****************************
         *  Test case #7
         */
        System.out.println("\t Test case #7");
        
        //input values for test case #7
        guardPosition = 18.0;
        playerPosition = 18.0;
        amount = 1.0;
        
        expResult = 2.0;//expected output returned value
        
        //call function to run test
        result = instance.catchPlayer(guardPosition, playerPosition, amount);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
    }
    
}
