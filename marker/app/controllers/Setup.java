package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.setup;

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
        Form<SetupForm> form = Form.form(SetupForm.class);

        return ok(views.html.setup.render(form));
    }

    public static Result submit() {
        return ok();
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
