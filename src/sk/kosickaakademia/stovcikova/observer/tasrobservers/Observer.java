package sk.kosickaakademia.stovcikova.observer.tasrobservers;

import sk.kosickaakademia.stovcikova.observer.Tasr;

public abstract class Observer {
    protected Tasr subject;
    public abstract void update();
}
