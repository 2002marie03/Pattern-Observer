package org.example.observers;

import org.example.observables.Observable;
import org.example.observables.ObservableImpl;

public class ObserverImpl2 implements Observer {
    private double lastState;
    @Override
    public void update(Observable observable) {
        int state=((ObservableImpl) observable).getState();
        if (state-lastState>0) System.out.println("Observateur 2 =>Augmentation de la pression  ");
        else if (state-lastState<0) System.out.println("Observateur 2 = > depression ");
        else System.out.println("Observateur 2 => Stabilite ");
        lastState=state;



    }
}
