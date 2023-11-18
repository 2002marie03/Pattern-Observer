package org.example.observers;

import org.example.observables.Observable;
import org.example.observables.ObservableImpl;

public class ObserverImpl1 implements Observer{
    private double somme;
    @Override
    public void update(Observable observable) {
        int state=((ObservableImpl) observable).getState();
           somme+=state;
           System.out.println("Observateur 1 Somme="+somme);
    }
}
