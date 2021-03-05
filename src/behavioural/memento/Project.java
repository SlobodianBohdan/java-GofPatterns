package behavioural.memento;

import java.time.LocalDate;

public class Project implements Originator{
    private String version;
    private LocalDate createdData;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public LocalDate getCreatedData() {
        return createdData;
    }

    @Override
    public VersionProject save() {
        return new VersionProject(version);
    }

    @Override
    public void restore(VersionProject versionProject) {
        version = versionProject.getVersion();
    }
}
