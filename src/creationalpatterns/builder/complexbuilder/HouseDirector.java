package creationalpatterns.builder.complexbuilder;

import creationalpatterns.builder.complexbuilder.housebuilders.HouseBuilder;

/**
 * Director Class of {{@link House}}  Which has encapsulated group of construction methods which leads to deriving Various Representations of {{@link  House}}.
 * The BuilderObject Passed are in-charge of actual Construction. Director just guides you the Steps in Building the Complex Object
 */

public class HouseDirector {

    //Representation 1
    public static House buildHouseWith8WallsAndCementBasement(HouseBuilder houseBuilder){
        houseBuilder.buildWalls(8);
        houseBuilder.buildBasement("Cement");
        houseBuilder.buildRoof(1,2,3);

        return houseBuilder.getHouse();
    }

    //Representation 2
    public static House buildBigHouseWithWindows(HouseBuilder houseBuilder){
        houseBuilder.buildWindows(10,"glass");
        houseBuilder.buildRoof(1,3,4);
        houseBuilder.buildWalls(20);
        houseBuilder.buildBasement("Sand");

        return houseBuilder.getHouse();
    }


}
