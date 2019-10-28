package com.ocr.quentin;

public abstract class Animal {
    protected String prenom;
    protected int age;
    protected double taille;
    protected double poids;
    protected String couleur;
    protected String paysOrigine;
    protected String alimentation;
    protected String sexe;
    protected int prix;
    protected String dateVisiteVeto;
    protected String voler;
    protected String courir;

    public Animal(String prenom, int age, double taille, double poids, String couleur, String paysOrigine, String alimentation, String sexe, int prix, String dateVisiteVeto, String voler, String courir, Espace espace) {
        this.prenom = prenom;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.couleur = couleur;
        this.paysOrigine = paysOrigine;
        this.alimentation = alimentation;
        this.sexe = sexe;
        this.prix = prix;
        this.dateVisiteVeto = dateVisiteVeto;
        this.voler = voler;
        this.courir = courir;
        this.espace = espace;
    }

    public Espace espace;

    /**
     * On vérifie la date du dernier passage du vétérinaire
     */
    public void getDateVisiteVeto(Animal animal) {
        System.out.println("Date du dernier passage du vétérinaire pour cet animal : " + animal.dateVisiteVeto);
    }

    /**
     * Tout animal se présente.
     */
    public abstract void presentation();

    /**
     * Vérifie l'aptitude physique de chaque animal.
     */
    public abstract void checkAbility();

    /**
     * Tout animal respire.
     */
    protected abstract void breathe();

    /**
     * Tout animal peut se reproduire.
     */
    protected abstract void reproduce();

    /**
     * Tout animal peut crier.
     */
    protected abstract void cry();

    /**
     * Tout animal peut manger.
     */
    protected abstract void eat();

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public double getTaille() {
        return taille;
    }

    public double getPoids() {
        return poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getPaysOrigine() {
        return paysOrigine;
    }

    public String getAlimentation() {
        return alimentation;
    }

    public String getSexe() {
        return sexe;
    }

    public String getDateVisiteVeto() {
        return dateVisiteVeto;
    }

    public Espace getEspace() {
        return espace;
    }
}
