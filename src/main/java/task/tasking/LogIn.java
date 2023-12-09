package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePage;
import ui.LogOut;
import ui.Login;

public class LogIn {
    public static void as(WebDriver webDriver, String email, String pass) {
        Click.on(webDriver, HomePage.login);
        Enter.text(webDriver, Login.email, email);
        Enter.text(webDriver, Login.password, pass);
        Click.on(webDriver, Login.login);
    }
}
