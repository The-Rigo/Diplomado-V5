package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePage;
import ui.LogOut;
import ui.SignUpFree;

public class Logout {
    public static void as(WebDriver webDriver, String fullname, String email, String pass) {
        Click.on(webDriver, HomePage.signup);
        Enter.text(webDriver, LogOut.fullname, fullname);
        Enter.text(webDriver, LogOut.email, email);
        Enter.text(webDriver, LogOut.password, pass);
        Click.on(webDriver, LogOut.checkbox);
        Click.on(webDriver, LogOut.signupButton);
        Click.on(webDriver, LogOut.logout);
    }
}
