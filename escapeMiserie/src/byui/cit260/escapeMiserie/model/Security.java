/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeMiserie.model;

import java.io.Serializable;

/**
 *
 * @author Eddy
 */
public class Security implements Serializable{
    
    // class instance variables
    private double viewTower;
    private double guard;

    public Security() {
    }
    
    public double getViewTower() {
        return viewTower;
    }

    public void setViewTower(double viewTower) {
        this.viewTower = viewTower;
    }

    public double getGuard() {
        return guard;
    }

    public void setGuard(double guard) {
        this.guard = guard;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.viewTower) ^ (Double.doubleToLongBits(this.viewTower) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.guard) ^ (Double.doubleToLongBits(this.guard) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Security{" + "viewTower=" + viewTower + ", guard=" + guard + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Security other = (Security) obj;
        if (Double.doubleToLongBits(this.viewTower) != Double.doubleToLongBits(other.viewTower)) {
            return false;
        }
        if (Double.doubleToLongBits(this.guard) != Double.doubleToLongBits(other.guard)) {
            return false;
        }
        return true;
    }  
    
}
