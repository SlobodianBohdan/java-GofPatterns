package structural.decorator;

import structural.decorator.developer.Developer;
import structural.decorator.developer.Impl.DeveloperDecorator;

public class QualityControlDeveloper extends DeveloperDecorator {

    public QualityControlDeveloper(Developer developer) {
        super(developer);
    }

    public String testCode() {
        return "Quality Control test code. \n";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + testCode();
    }
}
