package sk.kosickaakademia.stovcikova.observer.tasrobservers;

import sk.kosickaakademia.stovcikova.observer.Tasr;
import sk.kosickaakademia.stovcikova.observer.tasrobservers.Observer;

public class SMSGate extends Observer {
    public SMSGate(Tasr t) {
        subject=t;
        t.attach(this);
    }

    @Override
    public void update() {
        System.out.println("SMS: "+subject.getMessage());
    }

    public void remove(){
        subject.remove(this);
    }
}
