package models;

import play.data.format.Formats;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Brayden
 * Date: 6/29/13
 * Time: 9:17 PM
 */
@Entity
@Table(name = "o_logins")
public class LoginUser extends Model {

    // ===========================================================
    // Constants
    // ===========================================================

    public static final Model.Finder<Long, LoginUser> finder = new Model.Finder<Long, LoginUser>(Long.class, LoginUser.class);

    // ===========================================================
    // Fields
    // ===========================================================

    public String userName;

    public String passHash;

    public int loginAccess;

    @Transient
    public LoginAccess getLoginAccess() {
        return LoginAccess.values()[loginAccess];
    }

    @Id
    public Long Id;

    @Formats.DateTime(pattern = "MM/dd/yyyy hh:mm tt")
    public Date lastLoggedIn = new Date();

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

    enum LoginAccess {
        Full,
        Staff,
        Teacher,
        Parent,
        Student,
    }

}
