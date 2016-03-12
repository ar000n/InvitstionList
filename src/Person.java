public class Person {
    private Address address;
    private int age;
    private Name name;

    public Person(Name name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String firstLast(){
        return name.firstLast();
    }
    public String lastFirst(){
        return name.lastFirst();
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", age=" + age +
                ", name=" + name +
                '}';
    }

    public String getAddress() {
        return address.toString();
    }

    public int getAge() {
        return this.age;
    }

    public String getContry() {
        String address = getAddress();
       return address.split(",")[2];

    }
}
