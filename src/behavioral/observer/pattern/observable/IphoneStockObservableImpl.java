package behavioral.observer.pattern.observable;

import behavioral.observer.pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable{
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stock=0;
    @Override
    public void add(NotificationAlertObserver observer) {
    observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
    observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setDate(int data) {
        boolean toNotify = stock==0;
        stock = data;
        if(toNotify){
            notifySubscriber();
        }
    }

    @Override
    public int getData() {
        return stock;
    }
}
