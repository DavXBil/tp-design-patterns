package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ZooBuilder {

    private String nom;
    private List<Zone> zones;

    public ZooBuilder(String nom) {
        this.nom = nom;
        this.zones = new ArrayList<Zone>();
    }

    public void appendZone(String nom, int capacite) {
        this.zones.add(new Zone(nom, capacite));

    }

    public void appendAnimal(String nomZone, Animal animal) {

        for (Zone zone : this.zones) {
            if (Objects.equals(zone.getNom(), nomZone)) {
                List<Animal> animaux = zone.getAnimaux();
                animaux.add(animal);
                zone.setAnimaux(animaux);
                break;
            }
        }

    }

    public Zoo getResult() {
        return new Zoo(nom, zones);
    }

}
