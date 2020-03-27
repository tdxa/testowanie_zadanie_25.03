public class Producer implements Observer {

    private static int counter = 0;
    private String name;

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public void update(Warehouse warehouse) {
        if(warehouse.isFreeStorageSpace()) {
            int element = Producer.counter;
            warehouse.addElement(element);

            System.out.println("Producer " + name + " added " + element);
            Producer.counter++;
        }
    }
}
