package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.stack.StackRunner;

public class StackTest {

    private StackRunner stack;

    @Test
    @DisplayName("Create stack test")
    @Disabled
    void testStackCreation() {
        stack = new StackRunner();

        assertNotNull(stack);
    }

    @Test
    @DisplayName("Stack push test")
    void testStackPush() {
        stack = new StackRunner();

        stack.push(0);
        stack.push(11);
        stack.push(48);
        stack.push(7);
        stack.push(2);

        assertTrue(stack.peek() == 2);
    }

    @Test
    @DisplayName("Stack peek test")
    void testStackPeek() {
        stack = new StackRunner();

        stack.push(0);

        assertTrue(stack.peek() == 0);
    }

    @Test
    @DisplayName("Stack pop test")
    void testStackPop() {
        stack = new StackRunner();

        stack.push(0);
        stack.push(11);
        stack.push(48);

        assertTrue(stack.pop() == 48);
        assertTrue(stack.peek() == 11);
    }

    @Test
    @DisplayName("Stack follows LIFO test")
    void testStackLIFO() {
        stack = new StackRunner();

        stack.push(0);
        stack.push(11);
        stack.push(48);
        stack.push(7);
        stack.push(2);

        assertEquals(2, stack.pop());
        assertEquals(7, stack.pop());
        assertEquals(48, stack.pop());

        assertEquals(11, stack.peek());

        stack.pop();
        stack.pop();

        assertTrue(stack.isEmpty());
    }
}