package behavioural.observer;

import java.util.List;

public class User implements Observer{
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handleProject(List<String> projects) {
        System.out.println("Dear: " + name + " We change the list projects: " + projects + "\n");
    }
}
