package creationalpatterns.prototype.javaspecific;

import java.util.Arrays;
import java.util.Random;

/**
 * This Concrete Prototype Implements {{@link Cloneable}} to Tell the clients that it supports clone()
 * If This Class is Not implemented {{@link CloneNotSupportedException}} will be thrown by default
 */
public class Triangle implements Cloneable{
    private double base;
    private double height;

    private double area;

    private int[] someRandomAttributes;

    private Triangle() {
    }

    public Triangle(double base,double height) {
        this.base = base;
        this.height = height;
        this.area = 0.5 * base * height;
        this.someRandomAttributes = new int[]{new Random().nextInt()};
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }


    /**
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Triangle clone() throws CloneNotSupportedException {
        Triangle clonedTriangle = (Triangle) super.clone();

        // clonedTriangle Will Contains all copies in Shallow Copy
        // If you have complex objects Prototypes need to deep copy themselves here as required

        clonedTriangle.someRandomAttributes = Arrays.copyOf(clonedTriangle.someRandomAttributes,clonedTriangle.someRandomAttributes.length);
        return clonedTriangle;

    }
}
