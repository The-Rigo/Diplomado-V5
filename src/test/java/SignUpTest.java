import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.SignUp;
import task.validations.IsLogin;
import task.validations.IsSignUp;

public class SignUpTest extends BaseTest {

    @Test
    public void SignUpTest(){
        SignUp.as(webDriver,"Rodrigo Ledezma ", "rigo123@email.com", "12345");
    }
}
