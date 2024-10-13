package creationalpatterns.prototype.general;

public class Circle implements Shape2D{

    private double radius;
    private double area;
    private double perimeter;
    private double diameter;

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }


    private Circle(){};

    public Circle(double radius){
        this.radius = radius;
        this.area = Math.PI * Math.pow(radius,2);
        this.perimeter = 2 * Math.PI * radius;
        this.diameter = 2*radius;
    }


    @Override
    public Shape2D cloneShape() {
        Circle clonedCircle = new Circle();
        clonedCircle.radius = this.radius;
        clonedCircle.area = this.area;
        clonedCircle.perimeter = this.perimeter;
        clonedCircle.diameter = this.diameter;

        return clonedCircle;
    }
}
