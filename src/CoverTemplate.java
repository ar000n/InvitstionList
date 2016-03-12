
public class CoverTemplate {
    private String name;
    private String address;

    public CoverTemplate(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String applyOnTemplate() {
        String[] separatedAddress = address.split(",");
        String invitationCover = "";
        invitationCover = invitationCover + "+-----------------------------------------+\n" +
                "| " + name + whitespaceGenerator(name.length()) + "|\n" +
                "|-----------------------------------------|\n" +
                "| " + separatedAddress[0] + ", " + separatedAddress[1]
                + whitespaceGenerator((separatedAddress[0] + separatedAddress[1]).length() + 2) + "|\n" +
                "| " + separatedAddress[2] + whitespaceGenerator(separatedAddress[2].length()) + "|\n" +
                "+-----------------------------------------+\n";
        return invitationCover;
    }

    private String whitespaceGenerator(int text) {
        int needThisMuch = 40 - text;
        String whiteSpace = "";
        for (int i = 0; i < needThisMuch; i++) {
            whiteSpace = whiteSpace + " ";
        }
        return whiteSpace;
    }
}
