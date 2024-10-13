package creationalpatterns.builder.complexbuilder.housebuilders;

import creationalpatterns.builder.complexbuilder.House;

/**
 * Concrete Builder. This Construction Steps guide in Building the {{@link House}}  according to building a bungalow.
 */

public class BungalowHouseBuilder implements HouseBuilder{

    private int wallsCount;
    private int[] roofThickness;
    private String basementMaterial;
    private int[] windows;

    @Override
    public void buildWalls(int wallsCount) {
        // Imagine a Large process of Step going on specially for this type of Construction
        this.wallsCount = wallsCount;
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            // Silent Exception
        }
    }

    @Override
    public void buildRoof(int l, int b, int w) {
        // Imagine a Large process of Step going on specially for this type of Construction
        this.roofThickness = new int[]{l,b,w};
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
        this.basementMaterial = material;
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
        this.windows = new int[]{count/2,count*2};
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            // Silent Exception
        }
    }

    @Override
    public House getHouse() {
        return new House(this.wallsCount,
                this.roofThickness,
                this.basementMaterial,
                this.windows);
    }
}
