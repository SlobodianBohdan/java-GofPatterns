package behavioural.command;

import java.util.HashMap;
import java.util.Map;

public class Database {
    Map<Integer, String> database = new HashMap<>();

    public void insert(int elementId, String element) {
        database.put(elementId, element);
        System.out.println("Inserting element in Database: " + element);
    }

    public void update(int elementId, String element) {
        database.put(elementId, element);
        System.out.println("Updating element in Database: " + element);
    }

    public void select(int elementId) {
        System.out.println("Reading element with Database: " + database.get(elementId));
    }

    public void delete(int elementId) {
        String deleteElement = database.get(elementId);
        database.remove(elementId);
        System.out.println("Deleting element with Database: " + deleteElement);
    }

    public void getListElements() {
        System.out.println("List elements with Database: ");
        if (database.isEmpty()){
            System.out.println(" Database is empty!");
        }
        for (Map.Entry<Integer, String> d: database.entrySet()) {
            System.out.println(" Id element: " + d.getKey() + " Element: " + d.getValue());
        }
    }
}
