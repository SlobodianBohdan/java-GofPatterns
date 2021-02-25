package structural.proxy;

import structural.proxy.proxy.ProxyProject;
import structural.proxy.proxy.project.Project;

public class Runner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/SlobodianBohdan/trading-service-mvc.git");

        project.run();
        System.out.println();
        project.stopRun();
        System.out.println();
        project.run();
    }
}
