package behaviouralpatterns.strategy.stratagies.strategy1;


/**
 * This Class Uses JPEG Algorithm to Compress the given image Data
 */
public class JPEGCompressor implements Compressor{
    @Override
    public byte[] compressImage(byte[] imageData) {
        //Compresses imageData according to JPEG Format
        return imageData;
    }
}
