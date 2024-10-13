package behaviouralpatterns.iterator;

public interface Collection<E> {

    void add(E item);

    void removeItem(E item);

    Iterator<E> getIterator();
}
