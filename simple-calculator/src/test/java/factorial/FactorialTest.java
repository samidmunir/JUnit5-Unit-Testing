package factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.factorial.Factorial;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        int actualResult = factorial.factorial(5);

        int expectedResult = 120;

        assertEquals(expectedResult, actualResult);
    }
}