package fastOrders;

import enums.BucketType;
import order.Order;

/**
 * Created by arsen on 21.11.16.
 */
public class OrderFactory {
    public Order getBucket(BucketType bucket){
        Order order = new Order();
        if (bucket == BucketType.BIRTHDAYBUCKET){
            order.addItem(new WeddingBucket());
        }
        else if(bucket == BucketType.FUNERALBUCKET){
            order.addItem(new FuneralBucket());
        }
        else {
            order.addItem(new WeddingBucket());
        }
        return order;
    }

    public static void main(String[] args) {
        OrderFactory of = new OrderFactory();

        System.out.println(of.getBucket(BucketType.FUNERALBUCKET).toString());
    }
}
