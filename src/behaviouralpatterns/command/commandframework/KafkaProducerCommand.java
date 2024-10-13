package behaviouralpatterns.command.commandframework;

public class KafkaProducerCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Delegates Work to KafkaProducerService");
    }
}
