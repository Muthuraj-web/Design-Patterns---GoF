package behaviouralpatterns.visitor.visitor;

import behaviouralpatterns.visitor.element.Integer;
import behaviouralpatterns.visitor.element.List;
import behaviouralpatterns.visitor.element.String;

/**
 * AddOperation Visitor Impl for Element Types, which adds something
 */
public class AddOperation implements Visitor{

    /**
     * AddOperation for Integer Element Type
     */
    @Override
    public void visit(Integer integer) {
        System.out.println("This Implementation Adds a Integer Object with Random Integer");
    }

    /**
     * AddOperation for List Element Type
     */
    @Override
    public void visit(List list) {
        System.out.println("This Implementation Adds a List Object with Random List");
        System.out.println("This Implementation is Only Special Operation to List Object");

    }

    /**
     * AddOperation for String Element Type
     */
    @Override
    public void visit(String string) {
        System.out.println("This Implementation Adds a String Object with Random String");
        System.out.println("This Implementation is Only Special Operation to String Object");

    }
}
