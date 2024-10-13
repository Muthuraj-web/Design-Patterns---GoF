package creationalpatterns.builder;

import creationalpatterns.builder.complexbuilder.House;
import creationalpatterns.builder.complexbuilder.HouseDirector;
import creationalpatterns.builder.complexbuilder.housebuilders.BungalowHouseBuilder;
import creationalpatterns.builder.complexbuilder.housebuilders.HouseBuilder;
import creationalpatterns.builder.complexbuilder.housebuilders.RCHouseBuilder;

public class HowToUse {
    public static void main(String[] args) {
        /*
            When You have to build a POJO out of some parameters which causes Telescoping Constructor for the Product
            Use This simple way of having one creationalpatterns.builder inside the class and let client call the construction code.
            This can be used to create Different representations of the POJO.
         */


        //OS Version 15.3 with SecureEnclave and processor Speed Set
        Computer osVersion15_3WithSecureEnclave = new Computer.ComputerBuilder(15.3f)
                .setSecureEnclave((Object) Boolean.TRUE)
                .setProcessorSpeed(2.5f)
                .build();


        //OS Version 15.0 without SecureEnclave
        Computer osVersion15WithoutSecureEnclave = new Computer.ComputerBuilder(15.0f)
                .setProcessorSpeed(3.0f)
                .build();



        /*

            When you have to create a Object Which has numerous Representations. numerous telescoping params
            Where those params includes often complex constructions process. and construction process also varies depending upon params
            Naive way to build it -> Write all the code in the constructor ( Big One , with if-else ) not readable unmaintainable

            Solution :
            To OverCome this Make a Abstract Builder Interface representing all the construction Steps
            Implement Concrete Builders which have their own Building Style Implementation and as a product at last get the actual Object.

            Ask Client to Instantiate the particular Builder and start construction with correct order and get the Product.
            They can get different representations of the product by including / skipping the Building steps
            ( Tip : You can make a Factory for those Builders Too [ This Example don't have Factory for those Builders ] )

            ( Pro Tip : Since the clients have to write the various Building Steps again and again. It is better to delegate then to a Director Class Which holds various Building Steps grouped to get all those representations )

        */

        HouseBuilder bungalowHouseBuilder = new BungalowHouseBuilder();
        House bungalowHouseWithBigWindows = HouseDirector.buildBigHouseWithWindows(bungalowHouseBuilder);

        HouseBuilder rcHouseBuilder = new RCHouseBuilder();
        House rcHouseWith8WallsAndCementBasement = HouseDirector.buildHouseWith8WallsAndCementBasement(rcHouseBuilder);







    }
}
