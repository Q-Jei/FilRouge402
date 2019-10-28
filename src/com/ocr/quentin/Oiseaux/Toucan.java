package com.ocr.quentin.Oiseaux;

import com.ocr.quentin.Espace;

import static java.lang.System.*;

public class Toucan extends Oiseau {

    public Toucan(String prenom, int age, double taille, double poids, String couleur, String paysOrigine, String sexe, String dateVisiteVeto, String voler, String courir, Espace espace) {
        super(prenom, age, taille, poids, couleur, paysOrigine, "insectes et fruits", sexe, 500, dateVisiteVeto, voler, courir, espace);
    }

    @Override
    protected void breathe() {
    }

    @Override
    protected void reproduce() {
    }

    @Override
    protected void cry() {
    }

    @Override
    protected void eat() {
    }
}
