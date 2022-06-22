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
        List<Integer> testList = new List<Integer>(new Integer[]{1,2,3});
        assertEquals("{1, 2, 3}", testList.toString());
    }

    @Test
    public void ListGet () {
        List<Integer> testList = new List<Integer>();
        testList.add (1);
        testList.add (2);
        testList.add (3);
        testList.add (6);
        testList.add (7);
        int value = testList.get(3);
        assertEquals(6, value);
    }

    @Test
    public void ListAdd () {
        List<Integer> testList = new List<Integer>();
        testList.add (5);
        testList.add (11);
        testList.add (3);
        testList.add (10);
        testList.add (7);
        assertEquals(5, testList.get(0));
        assertEquals(11, testList.get(1));
        assertEquals(3, testList.get(2));
        assertEquals(10, testList.get(3));
        assertEquals(7, testList.get(4));
    }
}
