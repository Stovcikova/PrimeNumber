package sk.kosickaakademia.stovcikova.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Sun {
    private static  Sun instance = new Sun(); //staticka premenna abz s nou nikto nemohol pracovat
    private List<Plannet> plannets;

    private Sun(){ //abz s kostruktorom nemohol nikto pracovat tak dam private
        plannets = new ArrayList<>();

    }
    //hlavna metoda
    public static Sun getInstance(){
        return instance;
    }
    public void addPlannet(Plannet plannet){
        plannets.add(plannet);
    }
    //vytlacenie zoznamu nieen planet
    public void printAllPlannets(){
        for (Plannet p:plannets){
            System.out.println(p.getName());
        }
    }
    public void findPlanet(String substring) {
            for (Plannet p : plannets) {
                if (p.getName().toLowerCase().contains(substring.toLowerCase().trim())) {
                    System.out.println(p.getName());
                }
            }
        }
        /*public void findMiniDistance(){
        long km=Long.MAX_VALUE;
        for ()
        }*/
    }



