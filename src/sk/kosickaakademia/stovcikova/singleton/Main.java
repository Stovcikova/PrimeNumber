package sk.kosickaakademia.stovcikova.singleton;

public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.getInstance();

        Plannet earth = new Plannet("Earth", 149600000);
        Plannet uran = new Plannet("Uran", 2871000000000l);
        Plannet saturn = new Plannet("Saturn", 1434000000000l);
        Plannet jupiter = new Plannet("Jupiter", 7785000000l);

        sun.addPlannet(earth);
        sun.addPlannet(uran);
        sun.addPlannet(saturn);
        sun.addPlannet(jupiter);
        sun.printAllPlannets();
    }
}
