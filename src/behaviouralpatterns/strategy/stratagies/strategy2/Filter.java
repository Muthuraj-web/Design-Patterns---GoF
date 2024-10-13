package behaviouralpatterns.strategy.stratagies.strategy2;

/**
 * This interface is for {{@link Filter}} Strategy that will contain the implementation of Compressor Algorithms
 */
public interface Filter {
    byte[] applyFilter(byte[] imageData);
}
