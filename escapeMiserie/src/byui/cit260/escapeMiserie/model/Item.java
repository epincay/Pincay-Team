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
 * @author Eddy
 */
public class Item implements Serializable{
    
    // class instance variables
    private String inventoryType;
    private String information;
    private boolean discard;
    private boolean pickUp;
    private boolean use;

    public Item() {
    }
        
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public boolean isDiscard() {
        return discard;
    }

    public void setDiscard(boolean discard) {
        this.discard = discard;
    }

    public boolean isPickUp() {
        return pickUp;
    }

    public void setPickUp(boolean pickUp) {
        this.pickUp = pickUp;
    }

    public boolean isUse() {
        return use;
    }

    public void setUse(boolean use) {
        this.use = use;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.inventoryType);
        hash = 67 * hash + Objects.hashCode(this.information);
        hash = 67 * hash + (this.discard ? 1 : 0);
        hash = 67 * hash + (this.pickUp ? 1 : 0);
        hash = 67 * hash + (this.use ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Item{" + "inventoryType=" + inventoryType + ", information=" + information + ", discard=" + discard + ", pickUp=" + pickUp + ", use=" + use + '}';
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
        final Item other = (Item) obj;
        if (this.discard != other.discard) {
            return false;
        }
        if (this.pickUp != other.pickUp) {
            return false;
        }
        if (this.use != other.use) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.information, other.information)) {
            return false;
        }
        return true;
    }
    
    
}
