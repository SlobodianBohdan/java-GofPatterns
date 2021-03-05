package behavioural.memento;

import java.time.LocalDate;

public class VersionProject {
    private String version;
    private LocalDate createdData;

    public VersionProject(String version) {
        this.version = version;
        this.createdData = LocalDate.now();
    }

    public String getVersion() {
        return version;
    }

    public LocalDate getCreatedData() {
        return createdData;
    }
}
