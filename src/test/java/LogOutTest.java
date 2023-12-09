import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.Logout;
import task.tasking.SignUp;

public class LogOutTest extends BaseTest {
    @Test
    public void SignUpTest(){
        Logout.as(webDriver,"Rodrigo Ledezma ", "rigo11@email.com", "12345");

    }
}
