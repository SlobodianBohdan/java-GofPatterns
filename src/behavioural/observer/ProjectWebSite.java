package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class ProjectWebSite implements Observed{
    List<String> projects = new ArrayList<>();

    List<Observer> users = new ArrayList<>();

    public void addProject(String project) {
        this.projects.add(project);
        notifyObservers();
    }

    public void removeProject(String project) {
        this.projects.remove(project);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.users.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.users.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : users) {
            observer.handleProject(this.projects);
        }
    }
}
