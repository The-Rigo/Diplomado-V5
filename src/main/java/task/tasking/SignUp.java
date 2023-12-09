package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePage;
import ui.SignUpFree;

public class SignUp {

    public static void as(WebDriver webDriver, String fullname, String email, String pass) {
        Click.on(webDriver, HomePage.signup);
        Enter.text(webDriver, SignUpFree.fullname, fullname);
        Enter.text(webDriver, SignUpFree.email, email);
        Enter.text(webDriver, SignUpFree.password, pass);
        Click.on(webDriver, SignUpFree.checkbox);
        Click.on(webDriver, SignUpFree.signupButton);
    }
}
