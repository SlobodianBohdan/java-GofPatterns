package behavioural.command;

import behavioural.command.Command.impl.*;

public class Runner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new InsertCommand(database, "Mari", 1),
                new UpdateCommand(database, "Bohdan", 1),
                new SelectCommand(database, 1),
                new DeleteCommand(database, 1),
                new GetListCommand(database)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.getListElements();
        developer.deleteRecord();
        developer.getListElements();
    }
}
