package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ControlRunner {
    public static void main(String[] args) {

        List<Project> projects = new ArrayList();
        List<Project> projectsCopy = new ArrayList<>();

        Project project1 = new Project(1L, "Java Project", "Good Project!", 9000);
        Project project2 = new Project(2L, "Ruby Project", "Good Project!", 7000);
        Project project3 = new Project(3L, "Python Project", "Good Project!", 5000);

        projects.add(project1);
        projects.add(project2);
        projects.add(project3);

        Project projectCopy1 = (Project) project1.copy();
        Project projectCopy2 = (Project) project2.copy();
        Project projectCopy3 = (Project) project3.copy();

        projectsCopy.add(projectCopy1);
        projectsCopy.add(projectCopy2);
        projectsCopy.add(projectCopy3);

        System.out.println("\nList projects:");
        for (Project p : projects) {
            System.out.println(p.toString());
        }

        System.out.println("\nList projects copy:");
        for (Project p : projectsCopy) {
            System.out.println(p.toString());
        }

    }
}
