import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KoansTest
{


    @Test
    void greeting()
    {
        String expected = "Hello, Bob.";
        String actual = Koans.greeting("Bob");
        assertEquals(expected, actual);
    }

    @Test
    void greeting2()
    {
        String expected = "Hello, my friend.";
        String actual = Koans.greeting2(null);
        assertEquals(expected, actual);

        expected = "Hello, Bob.";
        actual = Koans.greeting("Bob");
        assertEquals(expected, actual);
    }

    @Test
    void greeting3()
    {
        String expected = "HELLO JERRY!";
        String actual = Koans.greeting3("JERRY");
        assertEquals(expected, actual);
    }

    @Test
    void greeting4()
    {
        String[] names = {"Jill", "Jane"};
        String expected = "Hello, Jill and Jane.";
        String actual = Koans.greeting4(names);
        assertEquals(expected, actual);
    }

    @Test
    void greeting5()
    {
        String[] names = {"Amy", "Brian", "Charlotte"};
        String expected = "Hello, Amy, Brian, and Charlotte.";
        String actual = Koans.greeting5(names);
        assertEquals(expected, actual);
    }

    @Test
    void greeting6()
    {
        String[] names = {"Amy", "BRIAN", "Charlotte"};
        String expected = "Hello, Amy and Charlotte. AND HELLO BRIAN!";
        String actual = Koans.greeting6(names);
        assertEquals(expected, actual);
    }
}
