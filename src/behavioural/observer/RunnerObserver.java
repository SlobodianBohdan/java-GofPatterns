package behavioural.observer;

import java.util.SortedMap;

public class RunnerObserver {
    public static void main(String[] args) {
        ProjectWebSite projectWebSite = new ProjectWebSite();

        projectWebSite.addProject("Project 1");
        projectWebSite.addProject("Project 2");

        Observer observer1 = new User("Denis");
        Observer observer2 = new User("Ivan");

        projectWebSite.addObserver(observer1);
        projectWebSite.addObserver(observer2);

        System.out.println("We added new project.");
        projectWebSite.addProject("Project 3");
        System.out.println("We delete one project.");
        projectWebSite.removeProject("Project 2");
        System.out.println("We delete one user and added new project");
        projectWebSite.removeObserver(observer2);
        projectWebSite.addProject("Project 2");
    }
}
