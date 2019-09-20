package com.ocr.quentin;

public abstract class Animaux {
    protected String prenom;
    protected String espece;
    private int age;
    private int taille;
    private int poids;
    private String couleur;
    private String paysOrigine;
    private String alimentation;
    private String sexe;

    public Animaux(String prenom, String espece, int age, int taille, int poids, String couleur, String paysOrigine, String alimentation, String sexe) {
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
}
