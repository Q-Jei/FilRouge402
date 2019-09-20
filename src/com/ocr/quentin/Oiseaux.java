package com.ocr.quentin;

public abstract class Oiseaux extends Animaux{
    protected String voler;
    protected String courir;
    protected String nager;

    public Oiseaux(String prenom, String espece, int age, int taille, int poids, String couleur, String paysOrigine, String alimentation, String sexe, String voler, String courir, String nager) {
        super(prenom, espece, age, taille, poids, couleur, paysOrigine, alimentation, sexe);
        this.voler = voler;
        this.courir = courir;
        this.nager = nager;
    }

    /**
     * Détermine si l'oiseau peut voler ou non.
     */
    public void flyingAbility() {
        System.out.println(prenom + " est censé savoir voler.");
        if (voler == "oui") {
            System.out.println(prenom + " arrive à voler.");
        }
        else if (voler == "non") {
            System.out.println(prenom + " n'arrive toujours pas à voler.");
        }
        else {
            System.out.println("Les compétences en vol de " + prenom + " restent à vérifier.");
        }
    }

    public void runningAbility() {
        System.out.println(prenom + " est censé savoir courir.");
        if (courir == "oui") {
            System.out.println(prenom + " arrive à courir.");
        }
        else if (courir == "non") {
            System.out.println(prenom + " n'arrive toujours pas à courir.");
        }
        else {
            System.out.println("Les compétences en course de " + prenom + " restent à vérifier.");
        }
    }

    public void swimmingAbility() {
        System.out.println(prenom + " est censé savoir nager.");
        if (nager == "oui") {
            System.out.println(prenom + " arrive à nager.");
        }
        else if (nager == "non") {
            System.out.println(prenom + " n'arrive toujours pas à nager.");
        }
        else {
            System.out.println("Les compétences en natation de " + prenom + " restent à vérifier.");
        }
    }

}