package com.ocr.quentin;

import static java.lang.System.*;

public class Panthere extends Felins {

    public Panthere(String prenom, String espece, int age, double taille, double poids, String couleur, String paysOrigine, String alimentation, String sexe, String courir) {
        super(prenom, espece, age, taille, poids, couleur, paysOrigine, alimentation, sexe, courir);
    }

    @Override
    public void runningAbility() {
        out.println(prenom + " est censé savoir courir.");
        if (courir == "oui") out.println(prenom + " arrive à courir.");
        else if (courir == "non") {
            out.println(prenom + " n'arrive toujours pas à courir.");
        }
        else {
            out.println("Les compétences en course de " + prenom + " restent à vérifier.");
        }
    }
}
