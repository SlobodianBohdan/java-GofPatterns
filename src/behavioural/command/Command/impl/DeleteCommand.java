package behavioural.command.Command.impl;

import behavioural.command.Command.Command;
import behavioural.command.Database;

public class DeleteCommand implements Command {
    Database database;
    int elementId;

    public DeleteCommand(Database database, int elementId) {
        this.database = database;
        this.elementId = elementId;
    }

    @Override
    public void execute() {
        database.delete(elementId);
    }
}
