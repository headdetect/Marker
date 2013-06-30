package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: Brayden
 * Date: 6/18/13
 * Time: 5:57 PM
 */
@Entity
@Table(name="o_names")
public class Name extends Model {

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

    public String value;

    @Id
    public long ID;

    // ===========================================================
    // Constructors
    // ===========================================================

    public Name()
    {
        value = "";
    }

    public Name(String value)
    {
        this.value = value;
    }

    // ===========================================================
    // Getters & Setters
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    @Override
    public String toString()
    {
        return value;
    }

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
