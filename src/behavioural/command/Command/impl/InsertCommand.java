package behavioural.command.Command.impl;

import behavioural.command.Command.Command;
import behavioural.command.Database;

public class InsertCommand implements Command {
    Database database;
    String element;
    int elementId;

    public InsertCommand(Database database, String element, int elementId) {
        this.database = database;
        this.element = element;
        this.elementId = elementId;
    }

    @Override
    public void execute() {
        database.insert(elementId, element);
    }
}
