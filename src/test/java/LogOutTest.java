import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Logout;
import task.tasking.SignUp;
import task.validations.IsLogOut;
import task.validations.IsLogin;

public class LogOutTest extends BaseTest {
    @Test
    public void SignUpTest(){
        Logout.as(webDriver,"Rodrigo Ledezma ", "rigo11@email.com", "12345");
        Assert.assertTrue(IsLogOut.visible(webDriver));
    }
}
