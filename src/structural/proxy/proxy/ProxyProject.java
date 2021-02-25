package structural.proxy.proxy;

import structural.proxy.proxy.project.Project;
import structural.proxy.proxy.project.impl.RealProject;

public class ProxyProject implements Project {
    private String urlProject;
    private RealProject realProject;


    public ProxyProject(String urlProject) {
        this.urlProject = urlProject;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(urlProject);
        }
        realProject.run();
    }

    @Override
    public void stopRun() {
        if (realProject == null) {
            System.out.println("This project does not exist!");
        }
        realProject.stopRun();
    }
}
