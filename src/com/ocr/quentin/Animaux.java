package com.ocr.quentin;

public abstract class Animaux {
    protected String prenom;
    protected String espece;
    private int age;
    private double taille;
    private double poids;
    private String couleur;
    private String paysOrigine;
    private String alimentation;
    private String sexe;

    public Animaux(String prenom, String espece, int age, double taille, double poids, String couleur, String paysOrigine, String alimentation, String sexe) {
        this.prenom = prenom;
        this.espece = espece;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.couleur = couleur;
        this.paysOrigine = paysOrigine;
        this.alimentation = alimentation;
        this.sexe = sexe;
    }

    /**
     * Tout animal respire.
     */
    protected abstract void breathe();

    /**
     * Tout animal peut se reproduire.
     */
    protected abstract void reproduce();

}
