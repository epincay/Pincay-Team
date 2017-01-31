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
public class Move implements Serializable{
    
    // class instance variables
    private boolean north;
    private boolean south;
    private boolean east;
    private boolean west;

    public Move() {
    }    
    
    public boolean isNorth() {
        return north;
    }

    public void setNorth(boolean north) {
        this.north = north;
    }

    public boolean isSouth() {
        return south;
    }

    public void setSouth(boolean south) {
        this.south = south;
    }

    public boolean isEast() {
        return east;
    }

    public void setEast(boolean east) {
        this.east = east;
    }

    public boolean isWest() {
        return west;
    }

    public void setWest(boolean west) {
        this.west = west;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.north ? 1 : 0);
        hash = 79 * hash + (this.south ? 1 : 0);
        hash = 79 * hash + (this.east ? 1 : 0);
        hash = 79 * hash + (this.west ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Move{" + "north=" + north + ", south=" + south + ", east=" + east + ", west=" + west + '}';
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
        final Move other = (Move) obj;
        if (this.north != other.north) {
            return false;
        }
        if (this.south != other.south) {
            return false;
        }
        if (this.east != other.east) {
            return false;
        }
        if (this.west != other.west) {
            return false;
        }
        return true;
    }
    
    
}
