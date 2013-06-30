package controllers;

import models.*;
import play.data.Form;
import play.mvc.*;

import java.util.List;

public class Login extends Controller {

    //TODO: Replace with actual searching.
    private static int id = 0;

    public static Result index() {
        District dis = District.find.byId(1L);

        if(dis == null)
        {
            return redirect("/setup");
        }

        Form<LoginForm> mForm = Form.form(LoginForm.class);

        return ok(views.html.login.render("", dis, mForm));
    }

    public static Result submit() {
        District dis = District.find.byId(1L);

        if(dis == null)
        {
            return redirect("/setup");
        }

        Form<LoginForm> mForm = Form.form(LoginForm.class).bindFromRequest();

        if(mForm.hasErrors())
            return badRequest(views.html.login.render("Please enter the username and password provided by your school", dis, mForm));

        LoginForm lForm = mForm.get();

        //TODO: Hash passwords

        List<LoginUser> lookingFor = LoginUser.finder.where().eq("USER_NAME", lForm.username).eq("PASS_HASH", lForm.password).findList();

        if(lookingFor.size() != 1)
            return badRequest(views.html.login.render("Please enter the username and password provided by your school", dis, mForm));

        return ok(views.html.login.render("Logged in!", dis, Form.form(LoginForm.class)));
    }

}
