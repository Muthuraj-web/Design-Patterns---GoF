package behaviouralpatterns.command.gui;

import behaviouralpatterns.command.commandframework.Command;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }

}
