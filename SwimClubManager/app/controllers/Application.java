package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok("Main page.");
    }

    public static Result displayAllSwimmers() {
        return ok("Displaying all swimmers.");
    }

    public static Result displayCertainSwimmer(Long id) {
        return ok("Displaying certain swimmer " + id);
    }

    public static Result displaySpecifiedSwimmer(Long id) {
        return ok("You want to look at swimmer with id: " + id);
    }

    public static Result displayDefaultSwimmer(Long id) {
        return ok("Details for swimmer with id 1");
    }

    public static Result clobExample(String path) {
        return ok("Clob example, the path is: " + path);
    }

    public static Result badRequestExample() {
        return badRequest("Oops, something went wrong");
    }

    public static Result imATeapot() {
        return status(418, "Status 418: I'm a teapot!");
    }



}
