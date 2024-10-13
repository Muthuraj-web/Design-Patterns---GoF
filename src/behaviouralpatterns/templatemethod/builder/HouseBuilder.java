package behaviouralpatterns.templatemethod.builder;


/**
 * Template Class that holds the template method
 */
public abstract class HouseBuilder {

    /**
     * This is the Template Construction Method that will be same for all the Implementation,
     * Implementations can use the abstract methods provided as hooks to do their actions at each step.
     */
    public final void buildHouse(){
        buildBasement();
        buildWalls();
        buildRoof();
    }

    protected abstract void buildBasement();
    protected abstract void buildRoof();
    protected abstract void buildWalls();
}
