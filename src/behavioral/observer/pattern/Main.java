package behavioral.observer.pattern;

import behavioral.observer.pattern.observable.IphoneStockObservableImpl;
import behavioral.observer.pattern.observable.StockObservable;
import behavioral.observer.pattern.observer.EmailAlertObserverImpl;
import behavioral.observer.pattern.observer.MobileAlertObserverImpl;
import behavioral.observer.pattern.observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable stockObservable = new IphoneStockObservableImpl();
        NotificationAlertObserver harshMobileObserver = new MobileAlertObserverImpl("998989576",stockObservable);
        NotificationAlertObserver krishnaEmailObserver = new EmailAlertObserverImpl("krish@gmail.com",stockObservable);
        NotificationAlertObserver lalitMobileObserver = new MobileAlertObserverImpl("9987457856",stockObservable);

        stockObservable.add(harshMobileObserver);
        stockObservable.add(krishnaEmailObserver);
        stockObservable.add(lalitMobileObserver);

        stockObservable.setDate(10);
    }
}
