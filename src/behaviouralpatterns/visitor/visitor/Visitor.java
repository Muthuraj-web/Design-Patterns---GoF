package behaviouralpatterns.visitor.visitor;

import behaviouralpatterns.visitor.element.Integer;
import behaviouralpatterns.visitor.element.List;
import behaviouralpatterns.visitor.element.String;

/**
 * Visitor Interface Containing visit method for all implementation of Element
 * Each Operation ( visitor implementation ) Implements Them to Provide the functionality for all the Elements
 */
public interface Visitor {
    /**
     * This Method Bridges Integer Element Type with all the Visitor Implementations to Utilize Integer Operations
     */
    void visit(Integer integer);
    /**
     * This Method Bridges List Element Type with all the Visitor Implementations to Utilize List Operations
     */
    void visit(List list);
    /**
     * This Method Bridges String Element Type with all the Visitor Implementations to Utilize String Operations
     */
    void visit(String string);
}
