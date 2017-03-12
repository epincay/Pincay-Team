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
public class LogicControl {
    public double calcAreaTriangle(double base, double height){
        if(base < 0){ //The base is no possible negative number
            return -1;
        }
        if (height < 0){ //The amount is no possible negative number
            return -1;
        }
        double area =base * height;
        return area;
    }
    public boolean calcProblemChallenge(double problem, boolean answer){
        if(problem < 0 || problem > 10){ //The problem is between 1-10
            return false;
        }
        if(answer == false)
            return false;
        
        return true;
    }

}
