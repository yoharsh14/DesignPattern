package behavioral.observer.pattern.observable;

import behavioral.observer.pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public interface StockObservable {

    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void setDate(int data);
    void notifySubscriber();
    int getData();

}
