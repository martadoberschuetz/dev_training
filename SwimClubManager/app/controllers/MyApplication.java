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

    // shows example of passing in an argument to a view example.scala.html
   // public static Result index(){
       // List<String> names = Arrays.asList("Michael", "John", "Someone");
     //   List<String> names = Arrays.asList();
     //   return ok(example.render("Welcome to Swim Club Manager", names));
   // }

    public static Result index(){
        return ok(index.render("Welcome to Swim Club Manager"));
    }

    public static Result createSwimmer(){

        Swimmer swimmer = Form.form(Swimmer.class).bindFromRequest().get();
        // a utility in Play call Form
        // the Form utility does a mapping from the form parameters into the object

        // bindFromRequest means take everything from the request
        // and map it to MyApplication object
        // get() means get that MyApplication object

        swimmer.save(); // saves it to the database
        return redirect(routes.MyApplication.index());
    }

    public static Result displayAllSwimmersAsJSon(){
        List<Swimmer> swimmers = new Model.Finder(String.class, Swimmer.class).all();
         return ok(toJson(swimmers));
    }

    public static Result displayAllSwimmers(){
        List<Swimmer> swimmers = Swimmer.find.all();
        return ok(swimmerForm.render(swimmers));
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
