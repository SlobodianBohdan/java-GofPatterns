package behavioural.mediator;

public class Runner {
    public static void main(String[] args) {

        RoomChat chat = new RoomChat();

        Admin admin = new Admin(chat, "Admin");
        User user1 = new User(chat, "User 1");
        User user2 = new User(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I am User one.");
        user2.sendMessage("Hello, I am User two.");
        admin.sendMessage("Hello, I am admin.");

    }
}
