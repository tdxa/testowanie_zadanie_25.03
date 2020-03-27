import java.util.ArrayList;
import java.util.List;

public class Warehouse implements Observable{

    private  List<Producer> producers = new ArrayList<>();
    private  List<Consumer> consumers = new ArrayList<>();
    private List<Integer> elements = new ArrayList<>();
    private int sizeStorage;

    public Warehouse(int sizeStorage) {
        this.sizeStorage = sizeStorage;
    }

    @Override
    public void add(Observer observer) {
        if(observer instanceof Producer){
            producers.add((Producer) observer);
        }else if(observer instanceof Consumer){
            consumers.add((Consumer)observer);
        }
    }

    public void addElement(int element){
        elements.add(element);
    }

    public int removeElement(){
        return elements.remove(0);
    }

    @Override
    public void notifyProducer(){
        for (Producer producer : producers){
            producer.update(this);
        }
    }

    @Override
    public void notifyConsumer(){
        for(Consumer consumer : consumers){
            consumer.update(this);
        }
    }

    public boolean isFreeStorageSpace(){
        return elements.size() < this.sizeStorage;
    }

    public boolean isAvailableElement(){
        return elements.size() > 0;
    }



}
