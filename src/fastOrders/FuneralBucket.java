package fastOrders;

import bucket.FlowerBucket;
import enums.FlowerColor;
import flowers.CactusFlower;
import spec.CactusSpec;

/**
 * Created by arsen on 21.11.16.
 */
public class FuneralBucket extends FlowerBucket {
    public FuneralBucket() {
        CactusFlower cactus_1 = new CactusFlower(new CactusSpec(FlowerColor.GREEN, 5, 3, 6, false));
        CactusFlower cactus_2 = new CactusFlower(new CactusSpec(FlowerColor.YELLOW, 5, 3, 6, false));
        CactusFlower cactus_3 = new CactusFlower(new CactusSpec(FlowerColor.BLUE, 5, 3, 6, false));
        CactusFlower cactus_4 = new CactusFlower(new CactusSpec(FlowerColor.YELLOW, 5, 3, 6, false));
        CactusFlower cactus_5 = new CactusFlower(new CactusSpec(FlowerColor.GREEN, 5, 3, 6, false));
        addFlower(cactus_1);
        addFlower(cactus_2);
        addFlower(cactus_3);
        addFlower(cactus_4);
        addFlower(cactus_5);
    }
}
