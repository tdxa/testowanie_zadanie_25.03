public interface Observable {
    void add(Observer observer);
    void notifyProducer();
    void notifyConsumer();
}
