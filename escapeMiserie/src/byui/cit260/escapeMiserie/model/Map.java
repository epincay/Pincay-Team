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
public class Map implements Serializable{
    
    // class instance variables
    private String view;

    public Map() {
    }
        
    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.view);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "view=" + view + '}';
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.view, other.view)) {
            return false;
        }
        return true;
    }
    
    
    
}
