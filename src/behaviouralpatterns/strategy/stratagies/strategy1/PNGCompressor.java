package behaviouralpatterns.strategy.stratagies.strategy1;

/**
 * This Class Uses PNG Algorithm to Compress the given image Data
 */
public class PNGCompressor implements Compressor{
    @Override
    public byte[] compressImage(byte[] imageData) {
        //Compresses imageData According to PNG Format.
        return imageData;
    }
}
