package creationalpatterns.abstractfactory;

import creationalpatterns.abstractfactory.mouse.AppleMagicMouse;
import creationalpatterns.abstractfactory.mouse.LogitechMouse;
import creationalpatterns.abstractfactory.mouse.Mouse;

public class MouseFactory {
    private MouseFactory(){};

    public static Mouse getNewMouseInstance(String mouseType){
        Mouse mouseImplementation = null;
        switch (mouseType){
            case "apple":
                mouseImplementation = new AppleMagicMouse();
                break;
            case "logitech":
                mouseImplementation = new LogitechMouse();
                break;
        }
        return mouseImplementation;
    }
}
