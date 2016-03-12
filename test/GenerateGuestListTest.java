import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GenerateGuestListTest {
    @Test
    public void generaatePeople_should_generate_a_list_of_Person() throws Exception {
        String text = "lal,bhahadur,Male,21,thrissur,kerala,india\n" +
                "sri,ram,Male,45,mangalore,mangalore,karnataka";
        String lal = "Person{address=india, age=21, name=Name" +
                "{last='bhahadur', gender=Male, first='lal'}}";
        String sri = "Person{address=karnataka, age=45, name=Name" +
                "{last='ram', gender=Male, first='sri'}}";
        GenerateGuestList guests = new GenerateGuestList(text);
        List people = guests.generatePeople();

        assertEquals(lal, people.get(0).toString());
        assertEquals(sri, people.get(1).toString());

    }
}