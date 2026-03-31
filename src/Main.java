public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Table users = db.createTable("users");

        users.insert(1, "Rahul");
        users.insert(2, "Aman");

        System.out.println("Data inserted!");
    }
}