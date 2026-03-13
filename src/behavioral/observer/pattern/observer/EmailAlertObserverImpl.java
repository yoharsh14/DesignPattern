package behavioral.observer.pattern.observer;

import behavioral.observer.pattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Email notification to "+emailId+" That stock has been refilled to "+stockObservable.getData());
    }
}
