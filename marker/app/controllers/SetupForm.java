package controllers;

import play.data.Form;
import play.data.validation.Constraints;


/**
 * Created with IntelliJ IDEA.
 * User: Brayden
 * Date: 6/28/13
 * Time: 8:33 PM
 */
public class SetupForm {

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

    // -- District -- //
    @Constraints.Required
    public String districtName;

    // -- Server -- //

    @Constraints.Required
    public String adminUsername;

    @Constraints.Required
    public String adminPass;

    // When to backup
    // If use student management, financial or both.


    // -- Database -- //
    public String databaseDriver;

    @Constraints.Required
    public String dbName;

    @Constraints.Required
    public String username;

    @Constraints.Required
    public String password;



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

    public String validate() {
        //TODO: Test DB connection here.
        return null;
    }

    private boolean isValid(String... strings) {
        for(String str : strings)
            if(str == null || str.trim().equals(""))
                return false;
        return true;
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
