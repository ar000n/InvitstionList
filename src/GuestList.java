import java.util.List;

public class GuestList {

    private List people;

    public GuestList(List people) {
        this.people = people;
    }

    public String print(String option) {
        String guests = "";
        if (option.equals("-lf")) {
            for (int i = 0; i < people.size(); i++) {
                Person person = (Person) people.get(i);
                guests = guests + person.lastFirst() + "\n";
            }
        }
        if (option.equals("-fl")) {
            for (int i = 0; i < people.size(); i++) {
                Person person = (Person) people.get(i);
                guests = guests + applyOnTemplate(person.firstLast(), person.getAddress());
            }
        }
        return guests;
    }

    private String applyOnTemplate(String name, String address) {
        String[] separatedAddress = address.split(",");
        String invitationCover = "";
        invitationCover = invitationCover + "+-----------------------------------------+\n" +
                "| " + name + whitespaceGenerator(name) + "|\n " +
                "|----------------------------------------|\n" +
                "|" + separatedAddress[0] + ", " + separatedAddress[1]
                + whitespaceGenerator(separatedAddress[0] + separatedAddress[1]) + "|\n" +
                "| " + separatedAddress[2] + whitespaceGenerator(separatedAddress[2]) + "|\n" +
                "+-----------------------------------------+\n";
        return invitationCover;
    }

    private String whitespaceGenerator(String text) {
        int needThisMuch = 40 - text.length();
        String whiteSpace = "";
        for (int i = 0; i < needThisMuch; i++) {
            whiteSpace = whiteSpace + " ";
        }
        return whiteSpace;
    }

    public int getLength() {
        return people.size();
    }

    public Person getValueAt(int i) {
        return (Person) people.get(i);
    }
}
