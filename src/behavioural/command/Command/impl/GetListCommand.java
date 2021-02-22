package behavioural.command.Command.impl;

import behavioural.command.Command.Command;
import behavioural.command.Database;

public class GetListCommand implements Command {
    Database database;

    public GetListCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.getListElements();
    }
}
