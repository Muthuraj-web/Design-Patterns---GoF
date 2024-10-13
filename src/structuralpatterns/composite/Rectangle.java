package structuralpatterns.composite;

public class Rectangle implements Component{
    private String color;
    private double width;
    private double height;

    public Rectangle(String color,double width,double height){
        this.color = color;
        this.width = width;
        this.height = height;
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
