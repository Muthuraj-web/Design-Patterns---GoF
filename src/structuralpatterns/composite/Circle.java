package structuralpatterns.composite;

public class Circle implements Component {

    private String color;
    private double width;
    private double height;

    public Circle(String color,double radius){
        this.color = color;
        this.width = radius;
        this.height = radius;
    }
    @Override
    public void changeColor(String color) {
        this.color = color;
    }

    @Override
    public void resize(double width, double height) {
        this.width = width;
        this.height = height;
    }
}
