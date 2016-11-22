package fastOrders;

import bucket.FlowerBucket;
import enums.FlowerColor;
import flowers.RomashkaFlower;
import spec.FlowerSpec;

/**
 * Created by arsen on 21.11.16.
 */
public class WeddingBucket extends FlowerBucket {

    public WeddingBucket() {
        RomashkaFlower romashka_1 = new RomashkaFlower(new FlowerSpec(FlowerColor.BLUE, 5, 5,true));
        RomashkaFlower romashka_2 = new RomashkaFlower(new FlowerSpec(FlowerColor.GREEN, 5, 5, true));
        RomashkaFlower romashka_3 = new RomashkaFlower(new FlowerSpec(FlowerColor.RED, 5, 5, true));
        RomashkaFlower romashka_4 = new RomashkaFlower(new FlowerSpec(FlowerColor.RED, 5, 5, true));
        RomashkaFlower romashka_5 = new RomashkaFlower(new FlowerSpec(FlowerColor.RED, 5, 5, true));
        addFlower(romashka_1);
        addFlower(romashka_2);
        addFlower(romashka_3);
        addFlower(romashka_4);
        addFlower(romashka_5);
    }
}
