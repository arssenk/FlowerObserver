package observer;

import bucket.FlowerBucket;
import flowers.RomashkaFlower;

/**
 * Created by arsen on 22.11.16.
 */
public class RomashkaSupplierObserver implements Observer {
    private Observable observable;
    public RomashkaSupplierObserver(Observable observable){
        this.observable = observable;
    }
    @Override
    public void update(FlowerBucket bucket) {
        System.out.println("We got an order for " + bucket.searchFlower(RomashkaFlower.class.toString()).length +  " quantity of romashkas.");
    }
}

