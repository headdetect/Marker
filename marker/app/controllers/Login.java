package controllers;

import models.*;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Login extends Controller {



    public static Result index() {
        District dis = new District();
        dis.name = new Name("Headdetect School District");

        return ok(login.render("Your new application is ready.", dis, Form.form(LoginData.class)));
    }

    public static Result submit() {
        District dis = new District();
        dis.name = new Name("Headdetect School District");
        return ok(login.render("Logged in!", dis, Form.form(LoginData.class)));
    }

}
