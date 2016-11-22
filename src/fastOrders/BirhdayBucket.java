package fastOrders;

import bucket.FlowerBucket;
import enums.FlowerColor;
import flowers.CactusFlower;
import flowers.RomashkaFlower;
import spec.CactusSpec;
import spec.FlowerSpec;

/**
 * Created by arsen on 21.11.16.
 */
public class BirhdayBucket extends FlowerBucket {
    public BirhdayBucket() {
        RomashkaFlower romashka_1 = new RomashkaFlower(new FlowerSpec(FlowerColor.BLUE, 5, 5,true));
        RomashkaFlower romashka_2 = new RomashkaFlower(new FlowerSpec(FlowerColor.GREEN, 5, 5, true));
        RomashkaFlower romashka_3 = new RomashkaFlower(new FlowerSpec(FlowerColor.RED, 5, 5, true));
        CactusFlower cactus_1 = new CactusFlower(new CactusSpec(FlowerColor.GREEN, 5, 3, 6, false));
        CactusFlower cactus_2 = new CactusFlower(new CactusSpec(FlowerColor.GREEN, 5, 3, 6, false));
        CactusFlower cactus_3 = new CactusFlower(new CactusSpec(FlowerColor.GREEN, 5, 3, 6, false));
        addFlower(romashka_1);
        addFlower(romashka_2);
        addFlower(romashka_3);
        addFlower(cactus_1);
        addFlower(cactus_2);
        addFlower(cactus_3);
    }
}
