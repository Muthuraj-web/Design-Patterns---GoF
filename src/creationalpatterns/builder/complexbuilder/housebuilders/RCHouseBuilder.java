package creationalpatterns.builder.complexbuilder.housebuilders;

import creationalpatterns.builder.complexbuilder.House;

/**
 * Concrete Builder. This Construction Steps guide in Building the {{@link House} according to building a RC House.
 */
public class RCHouseBuilder implements HouseBuilder{

    @Override
    public void buildWalls(int wallsCount) {
        // Imagine a Large process of Step going on specially for this type of Construction
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            // Silent Exception
        }
    }

    @Override
    public void buildRoof(int l,int b,int w) {
        // Imagine a Large process of Step going on specially for this type of Construction
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            // Silent Exception
        }
    }

    @Override
    public void buildBasement(String material) {
        // Imagine a Large process of Step going on specially for this type of Construction
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            // Silent Exception
        }
    }

    @Override
    public void buildWindows(int count, String type) {
        // Imagine a Large process of Step going on specially for this type of Construction
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            // Silent Exception
        }
    }

    @Override
    public House getHouse() {
        return null;
    }


}
