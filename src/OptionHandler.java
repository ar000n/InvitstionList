import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class OptionHandler {

    private GuestList guests;
    private String[] options;

    public OptionHandler(String[] options, GuestList guests) {
        this.options = options;
        this.guests = guests;
    }

    public GuestList optionIdentifier() {
        int numberOfOption = options.length;
        if (numberOfOption == 2) return guests;
        Arrays.asList(options).subList(1, numberOfOption);

        for (int i = 0; i < options.length; i++) {
            if (options[i].equals("-c")) {
                guests = new GuestList(filterByCountry(options[++i]));
            }
            if (options[i].equals("-a")) {
                guests = new GuestList(filterByAge(options[++i]));
            }
        }
        return guests;
    }

    private List<Person> filterByCountry(Object option) {
        List<Person> people = new LinkedList<>();

        for (int i = 0; i < guests.getLength(); i++) {
            Person person = guests.getValueAt(i);
            String country = person.getContry();
            if (country.equals(option)) {
                people.add(person);
            }
        }
        return people;
    }

    private List<Person> filterByAge(Object option) {
        List<Person> people = new LinkedList<>();

        for (int i = 0; i < guests.getLength(); i++) {
            Person person = guests.getValueAt(i);
            int age = person.getAge();
            if (age > Integer.parseInt((String) option)) {
                people.add(person);
            }
        }
        return people;
    }

}
