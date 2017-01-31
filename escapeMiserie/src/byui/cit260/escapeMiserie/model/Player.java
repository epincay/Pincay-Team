/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeMiserie.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Eddie Pincay
 */
public class Player implements Serializable{
    
    //class instance varibles
    private String name;
    private double bestTime;
    private double countCaught;
    private boolean jump;
    private double climbUp;
    private double climbDown;

    public Player() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public double getCountCaught() {
        return countCaught;
    }

    public void setCountCaught(double countCaught) {
        this.countCaught = countCaught;
    }

    public boolean isJump() {
        return jump;
    }

    public void setJump(boolean jump) {
        this.jump = jump;
    }

    public double getClimbUp() {
        return climbUp;
    }

    public void setClimbUp(double climbUp) {
        this.climbUp = climbUp;
    }

    public double getClimbDown() {
        return climbDown;
    }

    public void setClimbDown(double climbDown) {
        this.climbDown = climbDown;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.countCaught) ^ (Double.doubleToLongBits(this.countCaught) >>> 32));
        hash = 83 * hash + (this.jump ? 1 : 0);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.climbUp) ^ (Double.doubleToLongBits(this.climbUp) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.climbDown) ^ (Double.doubleToLongBits(this.climbDown) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + ", countCaught=" + countCaught + ", jump=" + jump + ", climbUp=" + climbUp + ", climbDown=" + climbDown + '}';
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.countCaught) != Double.doubleToLongBits(other.countCaught)) {
            return false;
        }
        if (this.jump != other.jump) {
            return false;
        }
        if (Double.doubleToLongBits(this.climbUp) != Double.doubleToLongBits(other.climbUp)) {
            return false;
        }
        if (Double.doubleToLongBits(this.climbDown) != Double.doubleToLongBits(other.climbDown)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}
