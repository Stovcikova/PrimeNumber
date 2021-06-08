package sk.kosickaakademia.stovcikova.piskorky;

public class Piskorky {
    public static void main (String argv[]) {
        System.out.println("\t\t===> PISKVORKY <===");
        System.out.println("\t stlacte ctrl+c, pri preruseni");
        PiskvorkPole pp = new PiskvorkPole(15); //vytvorime nove pole 20x20
        pp.hrat(); //spustime hru
    }
}
