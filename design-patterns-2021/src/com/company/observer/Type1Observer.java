package com.company.observer;

//Reader
public class Type1Observer implements Observer{


    private String email;

    @Override
    public void notifyObserver(String news) {
        System.out.println("Reading the News: " + news);
        //send an email
    }
}
