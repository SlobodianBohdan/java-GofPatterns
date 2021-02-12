package creational.prototype;

import java.time.LocalDate;

public class Project implements Copyable {

    private Long id;
    private String name;
    private String description;
    private int priceProject;
    private LocalDate createdDate;

    public Project(Long id, String name, String description, int priceProject) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priceProject = priceProject;
        this.createdDate = LocalDate.now();
    }

    @Override
    public Object copy() {
        return new Project(id, name, description, priceProject);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priceProject=" + priceProject +
                ", createdDate=" + createdDate +
                '}';
    }
}
