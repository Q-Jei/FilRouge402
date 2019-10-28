package com.ocr.quentin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    protected String nom = "Zoo de Dornach";
    protected String proprietaire = "Quentin Grebe";
    protected String description = "Centre de réhabilitation pour les animaux blessés";
    protected int dimensions = 1500000;
    protected int argent = 80000;
    protected List<Animal> animaux = new ArrayList<Animal>();
    protected List<Enclos> enclos = new ArrayList<>();
    protected List<Voliere> volieres = new ArrayList<>();

    public Zoo(String nom, String proprietaire, String description, int dimensions, int argent) {
        this.nom = nom;
        this.proprietaire = proprietaire;
        this.description = description;
        this.dimensions = dimensions;
        this.argent = argent;
    }

    public Zoo(String nom, String proprietaire, String description, int dimensions, int argent, List<Animal> animaux, List<Enclos> enclos, List<Voliere> volieres) {
        this.nom = nom;
        this.proprietaire = proprietaire;
        this.description = description;
        this.dimensions = dimensions;
        this.argent = argent;
        this.animaux = animaux;
        this.enclos = enclos;
        this.volieres = volieres;
    }

    public Zoo(List<Animal> animaux, List<Enclos> enclos, List<Voliere> volieres) {
        this.animaux = animaux;
        this.enclos = enclos;
        this.volieres = volieres;
    }

    public void setAnimaux(Animal animal) {
        this.animaux.add(animal);
    }

    public void setEnclos(Enclos enclos) {
        this.enclos.add(enclos);
    }

    public void setVolieres(Voliere voliere) {
        this.volieres.add(voliere);
    }

    /**
     * Présentation générale du zoo
     */
    public void infoZoo() {
        System.out.println("Bienvenue au " + this.nom + " !");
        System.out.println("Celui-ci est la propriété de " + this.proprietaire + ".");
        System.out.println("Sa surface totale est de " + this.dimensions + "m².");
        System.out.println("Description : " + this.description + "\n");
    }

    public void listAnimal() {
        if (animaux.size() != 0) {
            for (Animal animal : animaux) {
                animal.presentation();
            }
        } else {
            System.out.println("Aucun animal n'a été trouvé dans le zoo !");
        }
        System.out.println("");
    }

    public void listEspace() {
        int idEnclos = 1;
        for (Enclos enclos : enclos) {
            enclos.infoEspace(idEnclos);
            idEnclos++;
        }
        int idVoliere = 1;
        for (Voliere voliere : volieres) {
            voliere.infoEspace(idVoliere);
            idVoliere++;
        }
        System.out.println("");
    }

    public void testAbility() {
        for (Animal animal : animaux) {
            animal.checkAbility();
        }
        System.out.println("");
    }

}