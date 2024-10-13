package structuralpatterns.adapter;

import structuralpatterns.adapter.lib.Shape;
import structuralpatterns.adapter.lib.SquareShape;

public class SquareAdapter implements Shape2D{

    private Shape squareAdaptee;
    public SquareAdapter(int sideLength){
        this.squareAdaptee = new SquareShape(sideLength);
    }

    @Override
    public double area() {
        return squareAdaptee.calculateAreaOfTheShape();
    }
}
