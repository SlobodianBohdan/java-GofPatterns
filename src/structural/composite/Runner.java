package structural.composite;

public class Runner {
    public static void main(String[] args) {
        Database database = new Database();

        User user1 = new User("Lida", "USER", 25);
        User user2 = new User("Mari", "USER", 29);
        User user3 = new User("Ivan", "USER", 35);

        Admin admin = new Admin("Den", "ADMIN", 57);

        database.add(user1);
        database.add(user2);
        database.add(user3);
        database.add(admin);
        database.print();

        System.out.println();

        database.remove(user2);
        database.print();
    }
}
