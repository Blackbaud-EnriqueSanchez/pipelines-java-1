import com.microsoft.demo.Demo;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(com.microsoft.test.annotations.UnitTest.class)
public class MyUnitTest {
    @Test
    public void unit_test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
        for(int i=0; i < 100000000; i++){
            
        }
    }

    @Test
    public void unit_test_method_2() {
    }
    
    @Test
    public void unit_test_method_3() {
    }
}
