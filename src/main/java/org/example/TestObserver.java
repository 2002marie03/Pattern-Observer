package org.example;

import org.example.observables.Observable;
import org.example.observables.ObservableImpl;
import org.example.observers.Observer;
import org.example.observers.ObserverImpl1;
import org.example.observers.ObserverImpl2;

public class TestObserver  {
    public static void main(String[] args) {

        ObservableImpl observable=new ObservableImpl();
        observable.getState();
        observable.subscribe(new ObserverImpl1());
        observable.subscribe(new ObserverImpl2());
        observable.setState(20);
        observable.getState();
        System.out.println("--------------------");
        observable.setState(10);
        //Methode pour creer des objet observer
        //Methode 1
        observable.subscribe(new Observer() {
            @Override
            public void update(Observable observable) {
                int state=((ObservableImpl) observable).getState();
                System.out.println("Observateur anonyme 1 =>"+state);
            }
        });
        //Methode 2
    observable.subscribe((observable1) ->{
        int state=((ObservableImpl) observable).getState();
        System.out.println("Observateur anonyme 2 =>"+state);
    } );
        System.out.println("##############");
    observable.setState(409);

    }
}