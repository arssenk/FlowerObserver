package order;

import bucket.FlowerBucket;
import interfaces.IDelivery;
import interfaces.IPayment;
import interfaces.Item;
import observer.CactusSupplierObserver;
import observer.Observable;
import observer.Observer;
import observer.RomashkaSupplierObserver;

import java.util.LinkedList;

/**
 * Created by Arsen on 18-Nov-16.
 */
public class Order implements Observable {
    LinkedList<Item> items = new LinkedList<>();
    LinkedList<Observer> observers = new LinkedList<>();
    IPayment payment;
    IDelivery delivery;

    public Order() {
        observers.add(new CactusSupplierObserver((this)));
        observers.add(new RomashkaSupplierObserver(this));
    }
    public FlowerBucket getBucket(){
        for (Object o: items){
            if (o.getClass() == FlowerBucket.class){
                return (FlowerBucket) o;
            }
        }
        return null;
    }

    public void setPaymentStrategy(IPayment currPayment){
        this.payment = currPayment;
        notifyObservers();
    }
    public void setDeliveryStrategy(IDelivery currDelivery){
        this.delivery = currDelivery;
    }
    public double calculateTotalPrice(){
        double sum = 0;
        for (Item item: this.items){
            sum += item.price();
        }
        System.out.println("Total price of order: " + sum);
        return sum;
    }
    public void processOrder(){
        payment.pay(this.calculateTotalPrice());
        System.out.println("Processing the order!");
        delivery.deliver(this.items);
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update(getBucket());
        }
    }
}
