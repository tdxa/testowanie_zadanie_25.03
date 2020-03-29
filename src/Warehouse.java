import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Warehouse extends Observable {

    private  List<Producer> producers = new ArrayList<>();
    private  List<Consumer> consumers = new ArrayList<>();
    private List<Integer> elements = new ArrayList<>();
    private int sizeStorage;

    public Warehouse(int sizeStorage) {
        this.sizeStorage = sizeStorage;
    }

    public void addElement(int element){
        elements.add(element);
    }

    public int removeElement(){
        return elements.remove(0);
    }

    public boolean isFreeStorageSpace(){
        return elements.size() < this.sizeStorage;
    }

    public boolean isAvailableElement(){
        return elements.size() > 0;
    }



}
