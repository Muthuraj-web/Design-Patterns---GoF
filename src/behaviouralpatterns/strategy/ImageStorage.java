package behaviouralpatterns.strategy;

import behaviouralpatterns.strategy.stratagies.strategy1.Compressor;
import behaviouralpatterns.strategy.stratagies.strategy2.Filter;


/**
 * This is the Context Class as Described in Strategy Pattern That can accept and use different kind of algorithms
 * The Client must associate the Context With Appropriate Algorithm
 */
public class ImageStorage {

    /**
     * This is a dummy method stores the given image to DB,
     * This method follows strategy pattern by executing different combination of {{@link Compressor}} and {{@link  Filter}}
     * By Using Strategy Patten this Class Achieves Loose coupling by talking only to Interfaces.
     *
     * @param imageData this is the binary Data of Actual Image
     * @param compressor This is the {{@link Compressor}} algorithm the client wishes to execute as part of this method.
     * @param filter This is the {{@link Filter}} algorithm the client wishes to execute as part of this method.
     */
    public static void storeImage(byte[] imageData, Compressor compressor, Filter filter){
        imageData = compressor.compressImage(imageData);
        imageData = filter.applyFilter(imageData);

        //Stores image data after applying Compression -> Filter According to the supplied Concrete Strategies.
    }
}
