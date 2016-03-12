import java.util.LinkedList;
import java.util.List;

public class GenerateGuestList {
    private String text;

    public GenerateGuestList(String text) {
        this.text = text;
    }

    public List<Person> generatePeople() {
        List<Person> people = new LinkedList<>();
        String[] textByLine = text.split("\n");
        for (int i = 0; i < textByLine.length; i++) {
            String[] separatedData = textByLine[i].split(",");
            Name arun = new Name(separatedData[0], separatedData[1], separatedData[2]);
            Address myAddress = new Address(separatedData[4], separatedData[5], separatedData[6]);
            int age = Integer.parseInt(separatedData[3]);
            Person person = new Person(arun, age, myAddress);
            people.add(person);
        }
        return people;
    }
}
