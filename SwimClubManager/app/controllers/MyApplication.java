package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.*;
import play.mvc.*;
import views.html.*;
import models.Swimmer;
import play.data.Form;
import java.util.List;
import play.db.ebean.Model;
import static play.libs.Json.*;

/**
 * Created by Marta on 16/11/14.
 */
public class MyApplication extends Controller {

    public static Result index(){
        return ok(index.render("Welcome to Swim Club Manager"));
    }

    public static Result createSwimmer(){
        // I want to take parameters from the form
        // in the request
        // and pull them into the object MyApplication
        // save to the database
        // then redirect to the main page

        Swimmer swimmer = Form.form(Swimmer.class).bindFromRequest().get();
        // a utility in Play call Form
        // the Form utility does a mapping from the form parameters into the object

        // bindFromRequest means take everything from the request
        // and map it to MyApplication object
        // get() means get that MyApplication object

        swimmer.save(); // saves it to the database
        return redirect(routes.MyApplication.index()); // instead of hard coding the url Im using routes.Application.index()
        // all the routing info in Play can be type safe



    }

    public static Result displayAllSwimmers(){
        return TODO;
    }

    public static Result editSwimmer(Long id){
        return TODO;
    }

    public static Result updateSwimmer(Long id){
        return TODO;
    }

    public static Result deleteSwimmer(Long id){
        return TODO;
    }


}
