package behaviouralpatterns.strategy.stratagies.strategy2;

/**
 * This Class Applies Black and White Filter to given Image Data.
 */
public class BlackAndWhiteFilter implements Filter{
    @Override
    public byte[] applyFilter(byte[] imageData) {
        //Applies B/W Filter on the image Data And Returns to callee
        return imageData;
    }
}
