package behaviouralpatterns.strategy.stratagies.strategy1;


/**
 * This interface is for {{@link Compressor}} Strategy that will contain the implementation of Compressor Algorithms
 */
public interface Compressor {
    byte[] compressImage(byte[] imageData);
}
