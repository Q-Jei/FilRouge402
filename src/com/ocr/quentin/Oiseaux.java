package com.ocr.quentin;

public abstract class Oiseaux extends Animaux{
    protected String voler;

    public Oiseaux(String prenom, String espece, int age, double taille, double poids, String couleur, String paysOrigine, String alimentation, String sexe, String voler) {
        super(prenom, espece, age, taille, poids, couleur, paysOrigine, alimentation, sexe);
        this.voler = voler;
    }

    /**
     * Vérifie si l'oiseau peut de nouveau voler ou non.
     */
    public abstract void flyingAbility();

}