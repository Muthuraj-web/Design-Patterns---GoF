package behaviouralpatterns.iterator;

public class HowToUse {
    public static void main(String[] args) {
        Collection<String> namesCollection = new NamesCollection<>();
        namesCollection.add("Muthu");
        namesCollection.add("Sanjay");
        namesCollection.add("Doppa");
        namesCollection.add("Shifali");

        Iterator<String> iterator = namesCollection.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.getNext());
        }
    }
}
