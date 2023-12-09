package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.LogOut;
import ui.SignUpFree;

public class IsLogOut {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, LogOut.logout);
    }
}
