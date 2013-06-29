package controllers;

import models.*;
import play.data.Form;
import play.mvc.*;

public class Login extends Controller {

    //TODO: Replace with actual searching.
    private static long id = 0;

    public static Result index() {
        District dis = District.find.byId(id);

        if(dis == null)
        {
            return redirect("/setup");
        }

        return ok(views.html.login.render("Your new application is ready.", dis, Form.form(LoginForm.class)));
    }

    public static Result submit() {
        District dis = District.find.byId(id);

        if(dis == null)
        {
            return redirect("/setup");
        }

        return ok(views.html.login.render("Logged in!", dis, Form.form(LoginForm.class)));
    }

}
