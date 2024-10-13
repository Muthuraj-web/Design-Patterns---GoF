package behaviouralpatterns.command.commandframework;

import java.util.List;

public class CompositeCommand implements Command{

    List<Command> commandList;

    public void addCommand(Command command){
        commandList.add(command);
    }

    @Override
    public void execute() {
        commandList.forEach(Command::execute);
    }
}
