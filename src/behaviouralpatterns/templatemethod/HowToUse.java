package behaviouralpatterns.templatemethod;

import behaviouralpatterns.templatemethod.builder.CementHouseBuilder;
import behaviouralpatterns.templatemethod.builder.GlassHouseBuilder;

public class HowToUse {
    public static void main(String[] args) {

        /*
        Lets say You have a Class That has a behavior b() that does a sequence of steps in a orderly fashion, But these sequence can
        have numerous Implementations, Bloating the method b() with all those implementation will eventually break Open / Closed principle

        Instead We can have this class as abstract and method b() as final and all those implementations as Abstract methods.
        the method b() provides hooks to the implementation to do their steps in those Sequential fashion

        The Various Implementations have their own way to do these actions.
        This way of delegating the steps to the individual implementations is called Template Method Pattern. Because the Class with method b()
        provides a template step for construction, The Clients can Talk to the Abstract class thus providing Extensibility
         */
        GlassHouseBuilder glassHouseBuilder = new GlassHouseBuilder();
        glassHouseBuilder.buildHouse();

        CementHouseBuilder cementHouseBuilder = new CementHouseBuilder();
        cementHouseBuilder.buildHouse();
    }
}
