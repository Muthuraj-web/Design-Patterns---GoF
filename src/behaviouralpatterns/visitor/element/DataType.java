package behaviouralpatterns.visitor.element;

import behaviouralpatterns.visitor.visitor.Visitor;


/**
 * Object Structure for the Element
 */
public interface DataType {
    void accept(Visitor visitor);

}
