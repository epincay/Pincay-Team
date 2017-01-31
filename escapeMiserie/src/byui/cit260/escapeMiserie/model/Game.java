/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeMiserie.model;

import java.io.Serializable;

/**
 *
 * @author Eddie Pincay
 */
public class Game implements Serializable{
    
    // class instance variables
    private double totalTime;
    private double noGuard;

    public Game() {
    }
        
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getNoGuard() {
        return noGuard;
    }

    public void setNoGuard(double noGuard) {
        this.noGuard = noGuard;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.noGuard) ^ (Double.doubleToLongBits(this.noGuard) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noGuard=" + noGuard + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noGuard) != Double.doubleToLongBits(other.noGuard)) {
            return false;
        }
        return true;
    }
    
    
}
