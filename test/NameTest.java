import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void firstLast_should_give_the_name_in_first_last_order_with_prefix() throws Exception {
        Name sweetName = new Name("Arun", "Sathian", "Male");
        Name sweeterName = new Name("sheela", "sweet", "Female");
        assertEquals("Ms sheela sweet", sweeterName.firstLast());
        assertEquals("Mr Arun Sathian", sweetName.firstLast());
    }

    @Test
    public void lastFirst_should_give_the_in_last_first_order_with_prefix() throws Exception {
        Name superName = new Name("B", "lal", "Male");
        Name sweetestName = new Name("bhadra", "Menon", "Female");
        assertEquals("Ms Menon,bhadra", sweetestName.lastFirst());
        assertEquals("Mr lal,B", superName.lastFirst());
    }
}