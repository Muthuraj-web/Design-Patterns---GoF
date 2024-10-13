package structuralpatterns.adapter.lib;

import creationalpatterns.prototype.general.Square;

public class SquareShape implements Shape{

    private int sideLength;

    public SquareShape(int sideLength){
        this.sideLength = sideLength;
    }
    @Override
    public double calculateAreaOfTheShape() {
        return sideLength*sideLength;
    }
}
