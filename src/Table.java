import java.io.FileWriter;
import java.io.IOException;

public class Table {
    private String fileName;

    public Table(String fileName) {
        this.fileName = fileName;
    }

    public void insert(int id, String name) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(id + "," + name + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}