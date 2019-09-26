package com.ocr.quentin;

public abstract class Felins extends Animaux {
    protected String courir;

    public Felins(String prenom, String espece, int age, double taille, double poids, String couleur, String paysOrigine, String alimentation, String sexe, String courir) {
        super(prenom, espece, age, taille, poids, couleur, paysOrigine, alimentation, sexe);
        this.courir = courir;
    }

    /**
     * Vérifie si le félin peut de nouveau courir ou non.
     */
    public abstract void runningAbility();

}
