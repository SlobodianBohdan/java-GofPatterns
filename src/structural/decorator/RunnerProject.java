package structural.decorator;

import structural.decorator.developer.Developer;
import structural.decorator.developer.Impl.JavaDeveloper;

public class RunnerProject {
    public static void main(String[] args) {
        Developer developer = new ProjectManager(new QualityControlDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
