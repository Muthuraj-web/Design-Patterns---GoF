package behaviouralpatterns.observer.push.consumers;


/**
 * Observer Refers to the Consumers Who can subscribe themselves with any {{@link behaviouralpatterns.observer.push.producers.Subject}}
 * and listen for any Change Occured in the Subject to take informed decisions.
 *
 * This Provides Loose Coupling between Producers and Subscribers
 */
public interface Observer {
    public void consume(boolean value);
}
