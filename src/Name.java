public class Name {
    protected String last;
    protected String  gender;
    protected String first;

    public Name( String first, String last,String gender) {
        this.gender = gender;
        this.first  =  first;
        this.last =  last;
    }

    public String firstLast() {
        String prefix = (this.gender.equals("Male")) ? "Mr " : "Ms ";
        return prefix + this.first + " " + this.last;
    }

    public String lastFirst() {
        String prefix = (this.gender.equals("Female")) ? "Ms " : "Mr ";
        return prefix + this.last + "," + first;
    }

    @Override
    public String toString() {
        return "Name{" +
                "last='" + last + '\'' +
                ", gender=" + gender +
                ", first='" + first + '\'' +
                '}';
    }
}

