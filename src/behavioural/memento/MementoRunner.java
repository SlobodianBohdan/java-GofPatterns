package behavioural.memento;

public class MementoRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Save save = new Save();

        project.setVersion("Java 8");
        save.backup(project.save());
        project.setVersion("Java 11");
        save.backup(project.save());

        project.setVersion("Java 14");

        VersionProject versionProject1 = save.get(1);
        project.restore(versionProject1);

        System.out.println(project.getVersion());

        VersionProject versionProject2 = save.get(0);
        project.restore(versionProject2);

        System.out.println(project.getVersion());

    }
}
