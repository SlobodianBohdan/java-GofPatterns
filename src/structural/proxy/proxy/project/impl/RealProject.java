package structural.proxy.proxy.project.impl;

import structural.proxy.proxy.project.Project;

public class RealProject implements Project {
    private String urlProject;

    public RealProject(String urlProject) {
        this.urlProject = urlProject;
    }


    @Override
    public void run() {
        load();
        System.out.println("Running project: " + urlProject);
    }

    public void load() {
        System.out.println("Loading project: " + urlProject);
    }

    @Override
    public void stopRun() {
        System.out.println("Stop running project: " + urlProject);
        delete();
    }

    public void delete() {
        System.out.println("Deleting project: " + urlProject);
    }

}
