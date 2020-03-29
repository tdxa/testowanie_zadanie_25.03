import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args){

        Warehouse warehouse = new Warehouse(10);

        Producer producer = new Producer("--prod01--", warehouse);
        warehouse.addObserver(producer);

        Consumer consumer = new Consumer("~~cons01~~", warehouse);
        warehouse.addObserver(consumer);

        while(true){
            if(warehouse.isFreeStorageSpace()){
                producer.update(warehouse,producer);
            }
            if(warehouse.isAvailableElement()){
                consumer.update(warehouse,consumer);
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
