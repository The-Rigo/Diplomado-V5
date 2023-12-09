package ui;

import org.openqa.selenium.By;

public class LogOut {
    public static By fullname = By.id("ctl00_MainContent_SignupControl1_TextBoxFullName");
    public static By email = By.id("ctl00_MainContent_SignupControl1_TextBoxEmail");
    public static By password = By.id("ctl00_MainContent_SignupControl1_TextBoxPassword");
    public static By checkbox = By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms");
    public static By signupButton = By.xpath("//div[@class='HPsignupDiv']//input[@class='HPLoginBtn']");

    public static By logout = By.id("ctl00_HeaderTopControl1_LinkButtonLogout");
}
