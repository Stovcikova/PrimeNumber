package sk.kosickaakademia.stovcikova.singleton;

public class Plannet {
    private String name;
    private long distance;

    public Plannet(String name, long distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public long getDistance() {
        return distance;
    }
}
