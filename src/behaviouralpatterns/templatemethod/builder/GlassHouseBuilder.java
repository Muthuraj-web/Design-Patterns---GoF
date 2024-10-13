package behaviouralpatterns.templatemethod.builder;

public class GlassHouseBuilder extends HouseBuilder {

    @Override
    protected void buildBasement() {
        System.out.println("Building Basement for Glass House");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Building Roof for Glass House only with Glass");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building Walls with only hardened Glass");
    }
}
