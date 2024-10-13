package creationalpatterns.prototype.general;


/**
 * This is a Common Interface Which Contains cloneShape() as a additional Method,
 * Prototype Pattern Delegates the Cloning Method Implementation to the Concrete Prototype Themselves.
 * Because Only the Concrete Prototype Knows how to copy fields Whether should ( Deep Copy (or) Shallow Copy) the fields
 */
public interface Shape2D {
    public double getArea();
    public double getPerimeter();

    public Shape2D cloneShape();
}
