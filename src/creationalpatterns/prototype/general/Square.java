package creationalpatterns.prototype.general;

public class Square implements Shape2D{

    private double length;
    private double area;
    private double perimeter;

    private Square() {}

    public Square(double length) {
        this.length = length;
        this.area = Math.pow(length,2);
        this.perimeter = 4 * length;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }

    @Override
    public Shape2D cloneShape() {
        Square clonedSquare = new Square();
        clonedSquare.length = this.length;
        clonedSquare.area = this.area;
        clonedSquare.perimeter = this.perimeter;

        return clonedSquare;
    }
}
