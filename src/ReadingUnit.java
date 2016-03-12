import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingUnit {
    private String textFile;

    public ReadingUnit(String fileName) {
        this.textFile = fileName;
    }

    public String read() throws IOException {
        String text = "";
        BufferedReader file = new BufferedReader(new FileReader(this.textFile));
        String currentLine;
        while ((currentLine = file.readLine()) != null) {
            text = text + currentLine + "\n";
        }
        return text;
    }
}