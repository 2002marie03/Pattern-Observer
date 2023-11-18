package org.example.observers;

import org.example.observables.Observable;

public interface Observer  {
    public void update(Observable observable);
}
