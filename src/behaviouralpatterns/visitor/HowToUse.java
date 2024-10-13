package behaviouralpatterns.visitor;

import behaviouralpatterns.visitor.element.Integer;
import behaviouralpatterns.visitor.element.List;
import behaviouralpatterns.visitor.visitor.AddOperation;
import behaviouralpatterns.visitor.visitor.QueueOperation;

import java.util.ArrayList;

public class HowToUse {
    public static void main(String[] args) {
        /*
            Lets Says you have a Interface and a Fixed set of Implementations (n) containing some operations in methods .
            In future you are considering adding new operations to the Object Structure ( Interface ), This will lead to adding the new method implementation in all the (n) class
            leading to adding more and more methods.

            Here Algorithms are tightly added with Objects Which will be harder to read and maintain as the operation grows

            The Goal of the Visitor Pattern is to separate the Operations ( Functionalities ) From the Actual Object
            and Delegate the functionalities to a separate class, Clients Just want to Attach the Object with the actual operation to achieve the expected result.
            These Visitor Implementations have All Access to the Object and will behave like the method as it is added in the Object Structure.

         */
        Integer integerElement = new Integer(10);
        integerElement.accept(new AddOperation());
        integerElement.accept(new QueueOperation());


        List listElement = new List(new ArrayList<>());
        listElement.accept(new AddOperation());
        listElement.accept(new QueueOperation());

        /*
            When Needed to Add an operation its simple Just introduce new implementation to Visitor representing that Operation.
            where as in naive way without visitor pattern we needed to add new methods in (n) Element Implementations (Testing Scope will be more)
         */
    }
}
