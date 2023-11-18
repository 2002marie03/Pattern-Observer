package org.example.observables;

import org.example.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    private int state ; //Generalementle state est un ensemble des donnes qu'il faut gerer
    private List<Observer> observers=new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver() {
        for (Observer o:observers){
            //push
            o.update(this);   // pour la methode update c'est selon la methode utilise soit push ou pop si push on dit declarer update(state) sin update()
        }


    }

    @Override
    public int getState() {
        System.out.println(state);
        return state;
    }

    @Override
    public void setState(int etat) {
        this.state=etat;
        this.notifyObserver();
    }
}
