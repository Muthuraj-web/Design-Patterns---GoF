package creationalpatterns.abstractfactory.mouse;

/**
 * Implementation of Product Mouse
 */
public class AppleMagicMouse implements  Mouse{
    @Override
    public boolean isWireless() {
        return true;
    }

    @Override
    public boolean isMouseScrollSpeedConfigurable() {
        return true;
    }
}
