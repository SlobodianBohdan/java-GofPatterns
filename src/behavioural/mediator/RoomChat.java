package behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class RoomChat implements Chat{
    UserChat admin;
    List<UserChat> users = new ArrayList<>();

    public void setAdmin(UserChat admin) {
        this.admin = admin;
    }

    public void addUserToChat(UserChat user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, UserChat user) {
        for (UserChat u : users) {
            if (u != user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}

