package structuralpatterns.composite;

public class HowToUse {
    public static void main(String[] args) {
        /*
        When you have some components in your system and those components have some common methods, You have a case where
        you have to treat the Individual Components and Group Of Components in the same way as a individual one use Composite Pattern.

        Example in PPT:
            We can have individual Shapes like Circle, Rectangle etc.., We will have common methods across them like Color, Size etc.,
            We can also Group those shapes into a container and apply those functions like Color, Size etc., on them like applying on individual Object

            Composite Pattern is used here


        Individual Objects adheres to a Component Interface Which has all the common functionalities of those Objects like changeColor(), resize()

        We also create a Class CompositeComponent (container) Implementation adhering to Component Interface that will hold all the individual Object
        when actions like changeColor(), resize() are performed the composite delegates the action to the individual Object
        from the Client end it looks like the container have actually performed it.
         */
        Component circleComponent = new Circle("Red",3.2);
        Component rectangeComponent = new Rectangle("Black",5.5,10.1);

        circleComponent.changeColor("Green");

        CompositeComponent compositeComponent = new CompositeComponent();
        compositeComponent.addComponent(circleComponent);
        compositeComponent.addComponent(rectangeComponent);

        compositeComponent.changeColor("Brown");
        compositeComponent.resize(5.5,6.6);
    }
}
