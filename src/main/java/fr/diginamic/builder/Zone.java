package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Zone {

    private String nom;
    private List<Animal>animaux;


    public Zone() {
    }

    public Zone(String nom, int capacite) {
        this.nom = nom;
        this.animaux = new ArrayList<Animal>();;
        this.capacite = capacite;
    }

    private int capacite;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public List<Animal> getAnimaux() {
        return animaux;
    }

    public void setAnimaux(List<Animal> animaux) {
        this.animaux = animaux;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zone{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", animaux=").append(animaux);
        sb.append(", capacite=").append(capacite);
        sb.append('}');
        return sb.toString();
    }
}
