package structural.adapter;

public class Runner {
    public static void main(String[] args) {
        Project project = new JavaAdapter();
        Database database = new JavaAdapter();

        project.saveObject();
        project.loadObject();
        project.updateObject();
        project.deleteObject();

        System.out.println();

        database.insert();
        database.select();
        database.update();
        database.remove();
    }
}
