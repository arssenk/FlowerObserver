package observer;

import bucket.FlowerBucket;
import flowers.CactusFlower;

/**
 * Created by arsen on 21.11.16.
 */
public class CactusSupplierObserver implements Observer {

    private Observable observable;
    public CactusSupplierObserver(Observable observable){
        this.observable = observable;

    }
    @Override
    public void update(FlowerBucket bucket) {
        System.out.println("We got an order for " + bucket.searchFlower(CactusFlower.class.toString()).length +  " quantity of cactuses.");

    }
}
