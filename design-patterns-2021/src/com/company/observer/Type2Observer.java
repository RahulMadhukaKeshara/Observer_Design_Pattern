package com.company.observer;

//Wrapping the food using the paper
public class Type2Observer implements Observer{

    @Override
    public void notifyObserver(String news) {
        System.out.println("Wrap the foods using news: " + news);
    }
}
