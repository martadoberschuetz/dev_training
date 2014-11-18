package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.*;
import play.mvc.*;
import views.html.*;
import models.Swimmer;
import play.data.Form;
import java.util.Arrays;
import java.util.List;
import play.db.ebean.Model;
import static play.libs.Json.*;

public class MyApplication extends Controller {

    // show example of passing in an argument to a view example.scala.html
    public static Result index(){
       // List<String> names = Arrays.asList("Michael", "John", "Someone");
        List<String> names = Arrays.asList();
        return ok(example.render("Welcome to Swim Club Manager", names));
    }

   // public static Result index(){
    //    return ok(index.render("Welcome to Swim Club Manager"));
    //}

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
