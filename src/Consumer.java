public class Consumer implements Observer {

    private String name;

    public Consumer(String name) {
        this.name = name;
    }

    @Override
    public void update(Warehouse warehouse) {
        if(warehouse.isAvailableElement()){
            int element = warehouse.removeElement();
            System.out.println("Consumer " + name + " removed: " + element);
        }
    }
}
