package behaviouralpatterns.strategy;

import behaviouralpatterns.strategy.stratagies.strategy1.JPEGCompressor;
import behaviouralpatterns.strategy.stratagies.strategy1.PNGCompressor;
import behaviouralpatterns.strategy.stratagies.strategy2.BlackAndWhiteFilter;
import behaviouralpatterns.strategy.stratagies.strategy2.ContrastFilter;

public class HowToUse {
    public static void main(String[] args) {
        byte[] imageData = "IMGDATA".getBytes();

        /*
        Let's say You need to Implement a Image Storage Class and need to store the image in the DB, But before storing
        you have to Compress, Apply Filter And Save ( That's the rule ). How would you do this ??

        Naive Way:
        ```
            public void storeImage(byte[] imageData, String compressionAlgorithm, String filterStyle){
                if(compressionAlgorithm.equalsIgnoreCase("jpeg")){
                    imageData = JPEGCompressor().compress(imageData);
                } else if (compressionAlgorithm.equalsIgnoreCase("png")) {
                    imageData = PNGCompressor().compress(imageData);
                } else {
                    imageData = DefaultCompressor().compress(imageData);
                }


                if(filterStyle.equalsIgnoreCase("black-white")){
                    imageData = BlackAndWhiteFilter().applyFilter(imageData);
                } else if(filterStyle.equalsIgnoreCase("contrast")){
                    imageData = Contrast().applyFilter(imageData);
                } else {
                    imageData = DefaultFilter().applyFilter(imageData)
                }
            }
         ```

         The naive way Couples the ImageStorage with the algorithm violating the Single Responsibility Principle ( SRP )
         After Some time if needed to add new Algorithm this needs to be changes causing violation of Open-Closed Principle

         We need to segregate the Compression, Filter Details out of this class and take delegate them to respective classes.
         Talk to Interface to Avoid Open Closed Principle


         This is where strategy pattern kicks - in,
            Strategy patten separates The Context Class ( ImageStorage ) From the Algorithms , So that client's can choose the
            different combinations to be used by Context class without the context knowing about them.

            They need to separate the Algorithms in to Strategies and use the Interface to talk in the Context behavior


         Pro - Tip

         If you are fixed like this, Before Storing Do Compress -> Apply filter -> Store Image , Then Strategy Pattern is good to use.

         If you are uncertain about Future and this may even be Extended like Crop -> Compress -> Apply Filter -> Store Image .
         or will be changed order like Apply Filter -> Compress -> Store Image , Please Go with Decorator Pattern
         This will allow the client to wrap the Context with Required Wrappers in Necessary Order and with Required Steps.

         */

        ImageStorage.storeImage(imageData,new JPEGCompressor(),new BlackAndWhiteFilter());

        ImageStorage.storeImage(imageData,new JPEGCompressor(),new ContrastFilter());

        ImageStorage.storeImage(imageData,new PNGCompressor(),new BlackAndWhiteFilter());

        ImageStorage.storeImage(imageData,new PNGCompressor(),new ContrastFilter());

    }

}
