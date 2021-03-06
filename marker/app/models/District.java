package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Brayden
 * Date: 6/18/13
 * Time: 6:19 PM
 */
@Entity
@Table(name = "o_district")
public class District extends Model {

    // ===========================================================
    // Constants
    // ===========================================================

    public static Model.Finder<Long, District> find = new Model.Finder<Long, District>(Long.class, District.class);

    // ===========================================================
    // Fields
    // ===========================================================

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public Name name;

    @OneToMany(cascade = CascadeType.ALL)
    public List<School> schools;

    @OneToMany(cascade = CascadeType.ALL)
    public List<Address> districtOffices;

    @Id
    public long ID;


    //TODO: add all info that a district office has.

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
