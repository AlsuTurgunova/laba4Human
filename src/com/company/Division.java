package com.company;

import java.util.Objects;

/**
 * This class describes the entity Subdivision
 */
public class Division {

    private int id;
    private String div;

    /**
     * Constructor
     * @param div Division
     * @param id Id
     */
    public Division(String div, int id)
    {
        this.div = div;
        this.id = id;
    }

    /**
     *  Getting the field value Id
     * @return Id
     */
    public int getId()
    {
        return id;
    }

    /**
     *  Getting the field value Division
     * @return
     */
    public String getDivision()
    {
        return this.div;
    }

    /**
     * toString method
     * @return string with parameters
     */
    @Override
    public String toString(){
        return this.div+this.id;
    }
    /**
     * A method for comparing two objects. Is overridden.
     * @param o The object to be compared with the current object.
     * @return True if they are equal, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Division division = (Division)o;
            return this.id == division.id && Objects.equals(this.div, division.div);
        } else {
            return false;
        }
    }
    /**
     * ListTest the hash code of this object.
     * @return Hash code in integer.
     */
    @Override
    public int hashCode() {
        return this.div.length();
    }
}