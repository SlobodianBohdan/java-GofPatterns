package structural.decorator;

import structural.decorator.developer.Developer;
import structural.decorator.developer.Impl.DeveloperDecorator;

public class ProjectManager extends DeveloperDecorator {
    public ProjectManager(Developer developer) {
        super(developer);
    }

    public String sellProject() {
        return "Project Manager sell project.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sellProject();
    }
}
