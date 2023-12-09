import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.SignUp;

public class SignUpTest extends BaseTest {

    @Test
    public void SignUpTest(){
        SignUp.as(webDriver,"Rodrigo Ledezma ", "rigo4@email.com", "12345");

    }
}
