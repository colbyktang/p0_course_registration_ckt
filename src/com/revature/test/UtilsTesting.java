package src.com.revature.test;

import static org.junit.Assert.assertSame;
// Junit imports
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.*;

// Utils imports
import src.com.revature.utils.*;

public class UtilsTesting {
    @Test
    public void ListInstantiation () {
        List<Integer> testList = new List<>();
        testList.add (1);
        testList.add (2);
        testList.add (3);
        assertEquals("{1, 2, 3}", testList.toString());
    }

    @Test
    public void ListGet () {
        List<Integer> testList = new List<>();
        testList.add (1);
        testList.add (2);
        testList.add (3);
        testList.add (6);
        testList.add (7);
        int value = testList.get(3);
        assertEquals(6, value);
    }
}
