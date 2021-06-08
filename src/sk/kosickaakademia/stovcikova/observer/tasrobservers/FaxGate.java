package sk.kosickaakademia.stovcikova.observer.tasrobservers;

import sk.kosickaakademia.stovcikova.observer.Tasr;

public class FaxGate extends Observer {
    public FaxGate(Tasr t) {
        subject=t;
        t.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Fax: "+subject.getMessage());
    }
}
