package sk.kosickaakademia.stovcikova.observer.tasrobservers;

import sk.kosickaakademia.stovcikova.observer.Tasr;

import java.util.Observable;

public class EmailGate extends Observer {
    public EmailGate(Tasr t) {
        subject =t;
        t.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Email: "+ subject.getMessage());
    }

    }



