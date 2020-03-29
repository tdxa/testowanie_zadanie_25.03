import java.util.Observer;
import java.util.Observable;


public class Consumer implements Observer {

    private String name;
    private  Warehouse warehouse;

    public Consumer(String name, Warehouse warehouse) {
        this.name = name;
        this.warehouse = warehouse;
    }

    @Override
    public void update(Observable observable, Object o) {
        if(observable == warehouse){
            if(warehouse.isAvailableElement()){
                int element = warehouse.removeElement();
                System.out.println("Consumer " + name + " removed: " + element);
            }
        }
    }
}
