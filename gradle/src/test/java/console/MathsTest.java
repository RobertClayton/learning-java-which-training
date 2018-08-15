package console;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MathsTest {

    @Test
    public void factorialTest() {
//        arrange
//        act
//        assert
        int actual = Maths.factorial(6);

        assertEquals(720, actual);

    }
}
