import java.util.Observer;
import java.util.Observable;

public class Producer implements Observer {

    private static int counter = 0;
    private String name;
    private Warehouse warehouse;

    public Producer(String name, Warehouse warehouse) {
        this.name = name;
        this.warehouse = warehouse;
    }

    @Override
    public void update(Observable observable, Object o) {
        if(observable == warehouse){
            if(warehouse.isFreeStorageSpace()) {
                int element = Producer.counter;
                warehouse.addElement(element);

                System.out.println("Producer " + name + " added " + element);
                Producer.counter++;
            }
        }
    }
}
