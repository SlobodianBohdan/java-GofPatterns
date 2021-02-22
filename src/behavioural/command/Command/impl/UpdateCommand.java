package behavioural.command.Command.impl;

import behavioural.command.Command.Command;
import behavioural.command.Database;

public class UpdateCommand implements Command {
    Database database;
    String element;
    int elementId;

    public UpdateCommand(Database database, String element, int elementId) {
        this.database = database;
        this.element = element;
        this.elementId = elementId;
    }

    @Override
    public void execute() {
        database.update(elementId, element);
    }
}
