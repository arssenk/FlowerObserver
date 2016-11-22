package item_decorators;

import interfaces.Item;

/**
 * Created by Arsen on 17-Nov-16.
 */
public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        super(item);
    }
    public double getPrice(){
        return 4 + item.price();
    }
    @Override
    public double price() {
        return 4;
    }

    public String getDescription(){
        return "Decorated bucket " + item.toString();
    }
}
