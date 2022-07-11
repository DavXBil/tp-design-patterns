package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nom;
    private List<Zone> zones = new ArrayList<Zone>();

    public Zoo() {
    }

    public Zoo(String nom, List<Zone> zones) {
        this.nom = nom;
        this.zones = zones;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zoo{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", zones=").append(zones);
        sb.append('}');
        return sb.toString();
    }
}
