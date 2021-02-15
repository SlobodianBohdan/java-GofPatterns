package creational.abstractFactory;

import creational.abstractFactory.project.ProjectTeamFactory;

public class ProjectSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeam = new ProjectTeamFactory();
        Developer developerBackend = projectTeam.getFirstDeveloper();
        Developer developerFrontend = projectTeam.getSecondDeveloper();
        Tester tester = projectTeam.getTester();
        Manager manager = projectTeam.getProjectManager();

        System.out.println("Creating project:");

        developerBackend.writeCode();
        developerFrontend.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
