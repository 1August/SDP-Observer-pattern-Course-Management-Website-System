package com.company;

import java.util.ArrayList;
import java.util.List;

public class CourseManagementSystemWebsite implements IObservable{
    List<News> news = new ArrayList<>();
    List<IObserver> observers = new ArrayList<>();

    public void addNews(News news) {
        this.news.add(news);
        notifyAllObservers();
    }

    public void removeNews(String news) {
        this.news.remove(news);
        notifyAllObservers();
    }

    @Override
    public void subscribeObserver(IObserver observer) { observers.add(observer); }

    @Override
    public void unsubscribeObserver(IObserver observer) { observers.remove(observer); }

    @Override
    public void notifyAllObservers() { for (IObserver observer : observers) observer.update(news); }
}
