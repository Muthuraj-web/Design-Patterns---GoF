package behaviouralpatterns.strategy.stratagies.strategy2;

/**
 * This Class Applies Contrast Filter to given Image Data.
 */
public class ContrastFilter implements Filter{
    @Override
    public byte[] applyFilter(byte[] imageData) {
        //Applies Contrast to the imageData and returns back to the callee
        return imageData;
    }
}
