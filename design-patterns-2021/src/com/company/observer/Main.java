package com.company.observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //publisher -> subject
        //subscriber -> Observer
        //types of observers -> NewsReaders,FoodWrapper

        Observer observer1 = new Type1Observer();
        Observer observer2 = new Type1Observer();
        Observer observer3 = new Type2Observer();

        Subject subject = new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);

        subject.notifyObservers("Curfew will be imposed today!");
        Thread.sleep(10000);//wait for 10 second
        System.out.println("================================");

        subject.notifyObservers("Reversed : Curfew will not be imposed today!");
        Thread.sleep(5000);//wait for 5 second

        subject.unsubscribe(observer2);
        Thread.sleep(5000);//wait for 5 second
        System.out.println("================================");

        subject.notifyObservers("Fuel price gone up!");
    }
}

//create folder in the machine called news
//create a new text file and add the news to it and copy the text file into the folder
//our subject class keep watching the news folder -> whenever new file available , it can call the notifyObserver method

//create a small gui
//create a form to enter the name and email address of user
//and submit -> you can add him to the observer list




