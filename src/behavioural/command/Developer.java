package behavioural.command;

import behavioural.command.Command.Command;

public class Developer {
    Command insert;
    Command update;
    Command select;
    Command delete;
    Command getListElements;

    public Developer(Command insert, Command update, Command select, Command delete, Command getListElements) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
        this.getListElements = getListElements;
    }

    public void insertRecord(){
        insert.execute();
    }

    public void updateRecord(){
        update.execute();
    }

    public void selectRecord(){
        select.execute();
    }

    public void deleteRecord(){
        delete.execute();
    }

    public void getListElements(){
        getListElements.execute();
    }
}
