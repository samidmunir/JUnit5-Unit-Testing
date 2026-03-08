package person_subList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.person.Person;

public class SubListTest {
    /*
        List.subList() does not create a new independent list.

        It returns a view backed by the original list.
        - Any changes made affect both the original and view.
        - Modifying an element has an effect on both.
        - They share the same underlying data.

        Test case to prove that subList() is a shallow copy.
        1) Modifying the view subList -> modifies the original list.
        2) Both the view & original share the same object reference.
    */
    @Test
    public void testSubListShallowCopy() {
        List<Person> original = new ArrayList<>();
        original.add(new Person("Sami", "Software Test Engineer I"));
        original.add(new Person("Landon", "Technical Trainer"));
        original.add(new Person("Leo", "Training Manager"));

        // Create a Person subList from the original.
        List<Person> subList = original.subList(0, 2);

        // Modify an object inside the subList.
        subList.get(1).setRole("Software Test Engineer III");

        // Since this is a shallow copy, the original should also reflect the update in subList.
        assertEquals("Software Test Engineer III", original.get(1).getRole());

        // Verify same object reference.
        assertSame(original.get(1), subList.get(1));
    }
}