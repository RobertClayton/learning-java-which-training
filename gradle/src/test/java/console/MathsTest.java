package console;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathsTest {
    @Test
    public void factorialTest(){
        // arrange
        // act
        int actual = Maths.factorial(6);
        // assert
        assertEquals(720, actual);
    }
}
