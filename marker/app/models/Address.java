package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: Brayden
 * Date: 5/31/13
 * Time: 9:24 PM
 */
@Entity
@Table(name="o_addresses")
public class Address extends Model {

    // ===========================================================
    // Constants
    // ===========================================================

    public static Model.Finder<Long, Address> find = new Model.Finder<Long, Address>(Long.class, Address.class);

    // ===========================================================
    // Fields
    // ===========================================================

    public String addressZipCode;

    public String addressCity;

    public String addressState;

    public String addressStreet;

    public String addressStreet2;

    // ===========================================================
    // Constructors
    // ===========================================================

    // ===========================================================
    // Getters & Setters
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
