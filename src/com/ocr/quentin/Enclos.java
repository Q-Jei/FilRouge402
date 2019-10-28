package com.ocr.quentin;

import java.util.List;

public class Enclos extends Espace {

    public Enclos(int x, int y) {
        super(x, y);
    }

    public Enclos(int x, int y, List<Animal> felins) {
        super(x, y, felins);
    }

    public void infoEspace (int id){
        System.out.println("Enclos numéro " + id + " : " + X + "m de longueur sur " + Y + "m de largeur.");
        if (animaux.size() != 0){
            for (Animal felin : animaux)
            {
                System.out.println(felin.prenom + " notre " + felin.getClass().getSimpleName().toLowerCase() + " se trouve dans l'enclos numéro " + id + ".");
            }
        }
        else {
            System.out.println("Il n'y a pas encore de félins dans l'enclos numéro " + id + ".");
        }
        System.out.println("");
    }

    @Override
    public void ajoutAnimal (Animal felin) throws BadAnimalSetted{
        if (felin.getClass().getSuperclass().getCanonicalName().equals("com.ocr.quentin.Felins.Felin")) {
            felin.espace = this;
            this.animaux.add(felin);
        } else {
            throw new BadAnimalSetted();
        }
    }

    @Override
    public void supprAnimal (Animal felin){
        this.animaux.remove(felin);
    }

}