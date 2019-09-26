package com.ocr.quentin;

import static java.lang.System.*;

public class Toucan extends Oiseaux {

    public Toucan(String prenom, String espece, int age, double taille, double poids, String couleur, String paysOrigine, String alimentation, String sexe, String voler) {
        super(prenom, espece, age, taille, poids, couleur, paysOrigine, alimentation, sexe, voler);
    }

    @Override
    public void flyingAbility() {
        out.println(prenom + " est censé savoir voler.");
        if (voler == "oui") out.println(prenom + " arrive à voler.");
        else if (voler == "non") {
            out.println(prenom + " n'arrive toujours pas à voler.");
        }
        else {
            out.println("Les compétences en vol de " + prenom + " restent à vérifier.");
        }
    }

}
