package sk.kosickaakademia.stovcikova.observer.tasrobservers;

import sk.kosickaakademia.stovcikova.observer.Tasr;

public class FbGate extends Observer {
    public FbGate(Tasr t) {
        subject=t;
        t.attach(this);
    }

    @Override
    public void update() {
        System.out.println("FB: "+subject.getMessage());
    }
}
