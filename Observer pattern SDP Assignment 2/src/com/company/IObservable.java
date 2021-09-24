package com.company;

public interface IObservable {
    void subscribeObserver(IObserver observer);
    void unsubscribeObserver(IObserver observer);
    void notifyAllObservers();
}
