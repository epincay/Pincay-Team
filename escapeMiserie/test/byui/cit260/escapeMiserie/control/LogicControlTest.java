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
public class LogicControlTest {
    
    public LogicControlTest() {
    }

    /**
     * Test of calcAreaTriangle method, of class LogicControl.
     */
    @Test
    public void testCalcAreaTriangle() {
        System.out.println("calcAreaTriangle");
        /*****************************
         *  Test case #1
         */
        System.out.println("\t Test case #1");
        
        // input value for test #1
        double base = 3.0;
        double height = 4.0;
        
        double expResult = 12.0;// expected output returned value
        
        // created instance of LogicControl class
        LogicControl instance = new LogicControl();
        
        // call function to run test
        double result = instance.calcAreaTriangle(base, height);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        /*****************************
         *  Test case #2
         */
        System.out.println("\t Test case #2");
        
        // input value for test #2
        base = -1.0;
        height = 4.0;
        
        expResult = -1.0;// expected output returned value  
        
        // call function to run test
        result = instance.calcAreaTriangle(base, height);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        /*****************************
         *  Test case #3
         */
        System.out.println("\t Test case #3");
        
        // input value for test #3
        base = 4.0;
        height = -2.0;
        
        expResult = -1.0;// expected output returned value  
        
        // call function to run test
        result = instance.calcAreaTriangle(base, height);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        /*****************************
         *  Test case #4
         */
        System.out.println("\t Test case #4");
        
        // input value for test #4
        base = 0.0;
        height = 4.0;
        
        expResult = 0.0;// expected output returned value  
        
        // call function to run test
        result = instance.calcAreaTriangle(base, height);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        /*****************************
         *  Test case #5
         */
        System.out.println("\t Test case #5");
        
        // input value for test #5
        base = 4.0;
        height = 0.0;
        
        expResult = 0.0;// expected output returned value  
        
        // call function to run test
        result = instance.calcAreaTriangle(base, height);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        /*****************************
         *  Test case #6
         */
        System.out.println("\t Test case #6");
        
        // input value for test #6
        base = 10.0;
        height = 30.0;
        
        expResult = 300.0;// expected output returned value  
        
        // call function to run test
        result = instance.calcAreaTriangle(base, height);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of calcProblemChallenge method, of class LogicControl.
     */
    @Test
    public void testCalcProblemChallenge() {
        System.out.println("calcProblemChallenge");
        /*****************************
         *  Test case #1
         */
        System.out.println("\t Test case #1");
        
        // input value for test #1
        double problem = 2.0;
        boolean answer = true;
        
        boolean expResult = true;// expected output returned value
        
        // created instance of LogicControl class
        LogicControl instance = new LogicControl();
        
        // call function to run test
        boolean result = instance.calcProblemChallenge(problem, answer);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result); 
        
        /*****************************
         *  Test case #2
         */
        System.out.println("\t Test case #2");
        
        // input value for test #2
        problem = -2.0;
        answer = true;
        
        expResult = false;// expected output returned value
        
        // call function to run test
        result = instance.calcProblemChallenge(problem, answer);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*****************************
         *  Test case #3
         */
        System.out.println("\t Test case #3");
        
        // input value for test #3
        problem = 2.0;
        answer = false;
        
        expResult = false;// expected output returned value
        
        // call function to run test
        result = instance.calcProblemChallenge(problem, answer);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*****************************
         *  Test case #4
         */
        System.out.println("\t Test case #4");
        
        // input value for test #4
        problem = 11.0;
        answer = true;
        
        expResult = false;// expected output returned value
        
        // call function to run test
        result = instance.calcProblemChallenge(problem, answer);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*****************************
         *  Test case #5
         */
        System.out.println("\t Test case #5");
        
        // input value for test #5
        problem = 0.0;
        answer = true;
        
        expResult = true;// expected output returned value
        
        // call function to run test
        result = instance.calcProblemChallenge(problem, answer);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*****************************
         *  Test case #6
         */
        System.out.println("\t Test case #6");
        
        // input value for test #6
        problem = 10.0;
        answer = true;
        
        expResult = true;// expected output returned value
        
        // call function to run test
        result = instance.calcProblemChallenge(problem, answer);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /*****************************
         *  Test case #7
         */
        System.out.println("\t Test case #7");
        
        // input value for test #7
        problem = 5.0;
        answer = true;
        
        expResult = true;// expected output returned value
        
        // call function to run test
        result = instance.calcProblemChallenge(problem, answer);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
    }
    
}
