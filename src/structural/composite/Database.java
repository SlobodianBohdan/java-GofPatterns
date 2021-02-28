package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Object> objects = new ArrayList<>();

    public void add(Object object) {
        objects.add(object);
    }

    public void remove(Object object) {
        objects.remove(object);
    }

    public void print() {
        for (Object objects : objects) {
            objects.print();
        }
    }

}
