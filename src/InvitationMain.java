import java.io.IOException;
import java.util.List;

public class InvitationMain {
    public static void main(String[] args) throws IOException {
        String text = new ReadingUnit(args[0]).read();
        List people = new GenerateGuestList(text).generatePeople();
        GuestList guests = new GuestList(people);
        OptionHandler optionHandler = new OptionHandler(args, guests);
        GuestList filteredGuests = (optionHandler.optionIdentifier());
//        System.out.println( filteredGuests.getLength());
        System.out.println(filteredGuests.print(args[1]));

    }
}
