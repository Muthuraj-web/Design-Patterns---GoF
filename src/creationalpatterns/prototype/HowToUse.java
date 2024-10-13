package creationalpatterns.prototype;

import creationalpatterns.prototype.general.Circle;
import creationalpatterns.prototype.general.Shape2D;
import creationalpatterns.prototype.general.Square;
import creationalpatterns.prototype.javaspecific.Triangle;

public class HowToUse {
    public static void main(String[] args) throws CloneNotSupportedException {

        /*
          How We Generally Create Copy of a Object?
                Collect all the parameters and pass those parameters to the constructor to create the new Object.
                This Conventional Approach has problems, If the constructor is costly like Doing a Network call, CPU Intensive Works etc.,

          To Avoid the Above Prototype Pattern delegates the Copying Task to Actual Prototype ( the object being copied ) itself.
          The Prototype implements the clone() method and performs ( Deep Copy (or) shallow Copy ) based on its requirements.

          Editor -> Originator
          EditorState -> Memento
          EditorHistory -> Caretaker
         */

        Shape2D circle = new Circle(2.2);
        Shape2D clonedCircle = circle.cloneShape();

        System.out.println("Circle and ClonedCircle are Equal? " + circle.equals(clonedCircle));

        Shape2D square = new Square(5);
        Shape2D clonedSquare = square.cloneShape();

        System.out.println("Square and SlonedSquare are Equal? " + square.equals(clonedSquare));


        /*
         Java's Internal Cloning Support
         */
        Triangle triangle = new Triangle(2.5,5.5);
        Triangle clonedTriangle = triangle.clone();
    }
}
