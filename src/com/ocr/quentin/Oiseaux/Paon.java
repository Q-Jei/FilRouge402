package com.ocr.quentin.Oiseaux;

import com.ocr.quentin.Espace;

import static java.lang.System.*;

public class Paon extends Oiseau {

    public Paon(String prenom, int age, double taille, double poids, String couleur, String paysOrigine, String sexe, String dateVisiteVeto, String voler, String courir, Espace espace) {
        super(prenom, age, taille, poids, couleur, paysOrigine, "insectes et fruits", sexe, 700, dateVisiteVeto, voler, courir, espace);
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
/*        Scanner sc = new Scanner(System.in);
        int budgetZoo = this.zoo.argent;
        System.out.println("Quel animal souhaitez-vous vendre ? Décôte de 20% \n");
        for (int i = 0; i < this.zoo.animaux.size(); i++) {
            double prixVente =  this.zoo.animaux.get(i).prix * 0.8;
            int prix = (int) prixVente;
            System.out.println( i + " - " + this.zoo.animaux.get(i).prenom + " - " + this.zoo.animaux.get(i).getClass().getSimpleName() + " - " + prix + " euros");
        }
        System.out.println("");
        int choix = sc.nextByte();
        Animal animalchoisi = this.zoo.animaux.get(choix);
        if (animalchoisi.getClass().getSuperclass().getCanonicalName().equals("com.ocr.quentin.Felins.Felin")) {
            zooDeDornach.remove(animalchoisi);
        }

        // Espace espaceAnimal = animalchoisi.espace;
        // double prixVente =  animalchoisi.prix * 0.8;
        // int prix = (int) prixVente;
        // this.zoo.argent = budgetZoo + prix;
        // espaceAnimal.animaux.remove(animalchoisi);
        // this.zoo.animaux.remove(choix);
        // System.out.println(animalchoisi.prenom + " vendu pour " + prix + " euros \n" );*/