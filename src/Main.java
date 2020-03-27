import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args){

        Warehouse warehouse = new Warehouse(10);

        Producer producer = new Producer("--prod01--");
        warehouse.add(producer);
        Producer producer1 = new Producer("--prod02--");
        warehouse.add(producer1);

        Consumer consumer = new Consumer("~~cons01~~");
        warehouse.add(consumer);
        Consumer consumer1 = new Consumer("~~cons02~~");
        warehouse.add(consumer1);

        while(true){
            if(warehouse.isFreeStorageSpace()){
                warehouse.notifyProducer();
            }
            if(warehouse.isAvailableElement()){
                warehouse.notifyConsumer();
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
