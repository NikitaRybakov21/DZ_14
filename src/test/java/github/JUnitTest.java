package github;

import com.github.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @Test
    public void test1() {
        int[] arr = {1,2,4,4,2,3,4,1,7};
        int[] arrTest = {1,7};
        Assertions.assertArrayEquals(arrTest, Main.test(arr));
    }
    @Test
    public void test2() {
        int[] arr = {1,1,1,1,1,1,4,1,1};
        Assertions.assertTrue(Main.test2(arr));
    }
}
