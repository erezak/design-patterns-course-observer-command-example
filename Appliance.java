// The abstract class for appliance objects

import java.util.ArrayList;
import java.util.List;

public abstract class Appliance implements Observable {
    private List<Observer> observers;
    private boolean state; // true for on, false for off

    public Appliance() {
        observers = new ArrayList<>();
        state = false;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    // The abstract method for turning on the appliance
    public abstract void turnOn();

    // The abstract method for turning off the appliance
    public abstract void turnOff();
}
