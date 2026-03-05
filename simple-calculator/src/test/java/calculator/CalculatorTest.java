package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.calculator.Calculator;

@DisplayName("Calculator Test")
public class CalculatorTest {
    @DisplayName("Calculator.add() Test")
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(2, 3);
        
        int expectedResult = 5;

        assertEquals(expectedResult, actualResult);
    }
}