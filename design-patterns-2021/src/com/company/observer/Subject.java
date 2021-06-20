package com.company.observer;

import java.util.ArrayList;
import java.util.List;

//news paper agency
public class Subject {
    List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer){
        //call the database and run a sql query to insert this observer
        observers.add(observer);
    }

    public void unsubscribe(Observer observer){
        //call the database and run a sql query to delete this observer
        observers.remove(observer);
    }

    public void start(){
        //forever loop
    }

    public void notifyObservers(String news){
        for (Observer observer : observers) {
            observer.notifyObserver(news);
        }
    }

}
