package structuralpatterns.adapter;

public class Cricle implements Shape2D{
    private int radius;
    public Cricle(int radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius,2);
    }
}
