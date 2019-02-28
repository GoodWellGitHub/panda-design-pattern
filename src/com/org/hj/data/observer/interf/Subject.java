package com.org.hj.data.observer.interf;

public interface Subject {
    void registObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
