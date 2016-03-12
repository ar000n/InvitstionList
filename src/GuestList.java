import java.util.List;

public class GuestList {

    private List people;

    public GuestList(List people) {
        this.people = people;
    }

    public String print(String option) {
        String guests = "";
        if (option.equals("-lf")) {
            for (Object aPeople : people) {
                Person person = (Person) aPeople;
                CoverTemplate guest = new CoverTemplate(person.lastFirst(), person.getAddress());
                guests = guest + guest.applyOnTemplate();
            }
        }
        if (option.equals("-fl")) {
            for (Object aPeople : people) {
                Person person = (Person) aPeople;
                CoverTemplate guest = new CoverTemplate(person.firstLast(), person.getAddress());
                guests = guests + guest.applyOnTemplate();
            }
        }
        return guests;
    }


    public int getLength() {
        return people.size();
    }

    public Person getValueAt(int i) {
        return (Person) people.get(i);
    }
}
