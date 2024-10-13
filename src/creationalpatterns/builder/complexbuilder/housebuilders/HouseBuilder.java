package creationalpatterns.builder.complexbuilder.housebuilders;

import creationalpatterns.builder.complexbuilder.House;

/**
 * Abstract Builder. This tells what are the construction steps involved in Building {{@link  House}} and Builders needs to be implemented
 * ( Generally Each Method for Each Param in Complex POJO Object which needs to be created )
 */
public interface HouseBuilder {
    public void buildWalls(int count);

    public void buildRoof(int l, int b, int w);

    public void buildBasement(String material);

    public void buildWindows(int count,String type);

    public House getHouse();
}
