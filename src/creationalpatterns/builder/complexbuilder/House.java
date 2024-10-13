package creationalpatterns.builder.complexbuilder;


/**
 * The  Object Which will need complex construction Steps to instantiate. ( Product )
 */
public class House {
    private int wallsCount;
    private int[] roofDimension;
    private String basementMaterial;
    private int[] windows;

    //Making Private to always construct the Product with Expected Constructor
    private House(){};
    public House(int wallsCount, int[] roofDimension, String basementMaterial, int[] windows){
        this.wallsCount = wallsCount;
        this.roofDimension = roofDimension;
        this.basementMaterial = basementMaterial;
        this.windows = windows;
    }
}
