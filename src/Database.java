public class Database {
    public Table createTable(String name) {
        return new Table(name + ".txt");
    }
}