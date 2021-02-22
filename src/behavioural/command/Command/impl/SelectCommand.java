package behavioural.command.Command.impl;

import behavioural.command.Command.Command;
import behavioural.command.Database;

public class SelectCommand implements Command {
    Database database;
    int elementId;

    public SelectCommand(Database database, int elementId) {
        this.database = database;
        this.elementId = elementId;
    }

    @Override
    public void execute() {
        database.select(elementId);
    }
}
