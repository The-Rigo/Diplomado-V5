import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.LogIn;
import task.validations.IsLogin;

public class LoginTest extends BaseTest {
    @Test
    public void SignUpTest(){
        LogIn.as(webDriver,"rigo7@email.com", "12345");
    }
}
