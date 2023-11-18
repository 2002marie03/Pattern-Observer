package org.example.observables;


import org.example.observers.Observer;

public interface Observable {
    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void notifyObserver();
    public int getState();
    public void setState(int etat);
}
