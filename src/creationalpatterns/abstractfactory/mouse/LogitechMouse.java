package creationalpatterns.abstractfactory.mouse;

/**
 * Implementation of Product Mouse
 */
public class LogitechMouse implements Mouse{

    @Override
    public boolean isWireless() {
        return false;
    }

    @Override
    public boolean isMouseScrollSpeedConfigurable() {
        return true;
    }
}
