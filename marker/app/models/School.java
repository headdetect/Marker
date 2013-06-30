package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: Brayden
 * Date: 5/31/13
 * Time: 9:24 PM
 */
@Entity
@Table(name = "o_schools")
public class School extends Model {

    // ===========================================================
    // Constants
    // ===========================================================

    public static Model.Finder<Long, School> find = new Model.Finder<Long, School>(Long.class, School.class);

    // ===========================================================
    // Fields
    // ===========================================================

    public String schoolName;

    public int termsPerYear;

    public int classesPerTerm;

    public Address schoolAddress;

    @Id
    public Long ID;

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
