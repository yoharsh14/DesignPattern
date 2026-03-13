package behavioral.observer.pattern.observer;

import behavioral.observer.pattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String mobileNumber;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String mobileNumber, StockObservable stockObservable) {
        this.mobileNumber = mobileNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Sending SMS to "+mobileNumber+" That stock has been refilled upto"+stockObservable.getData());
    }
}
