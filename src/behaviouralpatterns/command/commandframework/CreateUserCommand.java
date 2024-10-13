package behaviouralpatterns.command.commandframework;

public class CreateUserCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Delegates Work to CreateUserService");
    }
}
