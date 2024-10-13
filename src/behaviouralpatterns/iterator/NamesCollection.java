package behaviouralpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class NamesCollection<String> implements Collection<String>{

    List<String> container;

    public NamesCollection(){
        container = new ArrayList<>();
    }

    @Override
    public void add(String item) {
        container.add(item);
    }

    @Override
    public void removeItem(String item) {
        container.remove(item);
    }

    @Override
    public Iterator<String> getIterator() {
        return new Iterator<String>() {

            private List<String> list = new ArrayList<>(container);
            private int currentIndex = 0;
            @Override
            public String getNext() {
                String nextName = null;
                if(hasNext()){
                    nextName =  list.get(currentIndex);
                    currentIndex += 1;
                }
                return nextName;
            }

            @Override
            public boolean hasNext() {
                return currentIndex < list.size();
            }
        };
    }
}
