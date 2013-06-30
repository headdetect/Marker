package controllers;

import com.avaje.ebean.Ebean;
import models.District;
import models.LoginUser;
import models.Name;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import static play.data.Form.form;

/**
 * Created with IntelliJ IDEA.
 * User: Brayden
 * Date: 6/28/13
 * Time: 7:34 PM
 */
public class Setup extends Controller {

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

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

    public static Result index() {
        Form<SetupForm> setupForm = form(SetupForm.class);

        return ok(views.html.setup.render(setupForm, ""));
    }

    public static Result submit() {
        Form<SetupForm> setupForm = form(SetupForm.class).bindFromRequest();

        if(setupForm.hasErrors()) {
            return badRequest(views.html.setup.render(setupForm, "Please correct form errors."));
        }

        SetupForm mForm = setupForm.get();

         // -- District -- //
        District district = new District();
        district.name = new Name(mForm.districtName);

        // -- Server -- //
        LoginUser user = new LoginUser();
        //TODO: Actually hash the password
        user.passHash = mForm.adminPass;
        user.userName = mForm.adminUsername;

        // -- Database -- //



        Ebean.save(district);
        Ebean.save(user);

        return ok(views.html.setupresult.render(mForm, ""));
    }



    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
