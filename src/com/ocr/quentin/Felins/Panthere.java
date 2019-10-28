package com.ocr.quentin.Felins;

import com.ocr.quentin.Espace;

import static java.lang.System.*;

public class Panthere extends Felin {

    public Panthere(String prenom, int age, double taille, double poids, String couleur, String paysOrigine, String sexe, String dateVisiteVeto, String voler, String courir, Espace espace) {
        super(prenom, age, taille, poids, couleur, paysOrigine, "viande", sexe, 800, dateVisiteVeto, voler, courir, espace);
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
