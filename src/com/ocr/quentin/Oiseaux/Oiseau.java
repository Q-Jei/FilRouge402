package com.ocr.quentin.Oiseaux;

import com.ocr.quentin.Animal;
import com.ocr.quentin.Espace;

import static java.lang.System.out;

public abstract class Oiseau extends Animal {

    public Oiseau(String prenom, int age, double taille, double poids, String couleur, String paysOrigine, String alimentation, String sexe, int prix, String dateVisiteVeto, String voler, String courir, Espace espace) {
        super(prenom, age, taille, poids, couleur, paysOrigine, alimentation, sexe, prix, dateVisiteVeto, voler, courir, espace);
    }

    public void presentation() {
        System.out.println("Cuicui, je suis " + super.prenom + ". Je suis un(e) " + super.getClass().getSimpleName().toLowerCase() + " " + super.sexe + " de " + super.age + " ans. Je mesure "
                + super.taille + "m et pèse " + super.poids + "kg. Mon plumage est " + super.couleur + " et je suis originaire du " + super.paysOrigine +
                ". Ma nourriture préférée est la suivante : " + super.alimentation + ".");
    }

    /**
     * Vérifie si l'oiseau peut de nouveau voler ou non.
     */
    public void checkAbility() {
        out.println(prenom + " notre " + super.getClass().getSimpleName().toLowerCase() + " est censé savoir voler.");
        if (voler == "oui") {
            out.println(prenom + " arrive à voler.\n");
        } else if (voler == "non") {
            out.println(prenom + " n'arrive toujours pas à voler.\n");
        } else {
            out.println("Les compétences en vol de " + prenom + " restent à vérifier.\n");
        }
    }

}