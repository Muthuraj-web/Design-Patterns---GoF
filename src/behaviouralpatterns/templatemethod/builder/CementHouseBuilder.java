package behaviouralpatterns.templatemethod.builder;

public class CementHouseBuilder extends HouseBuilder {

    @Override
    protected void buildBasement() {
        System.out.println("Building Basement for Cement House");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Building Concrete Roof with Cement for Cement House");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building Walls only with Cement for Cement House");
    }
}
