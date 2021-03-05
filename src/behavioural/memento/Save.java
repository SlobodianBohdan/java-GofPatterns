package behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class Save {
    private List<VersionProject> mementoList = new ArrayList<>();

    public void backup(VersionProject versionProject)	{
        mementoList.add(versionProject);
    }

    public VersionProject get(int index) {
        return mementoList.get(index);
    }
}
