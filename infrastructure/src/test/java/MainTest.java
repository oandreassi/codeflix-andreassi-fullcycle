import com.fullcycle.codeflix.infrastructure.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void TestMain() {
        System.out.println("Hello World!");
        Main.main(new String[]{});
    }
}
