package com.ocr.quentin;

import java.util.List;

public class Voliere extends Espace {

    public Voliere(int x, int y) {
        super(x, y);
    }

    public Voliere(int x, int y, List<Animal> oiseaux) {
        super(x, y, oiseaux);
    }

    public void infoEspace (int id){
        System.out.println("Volière numéro " + id + " : " + X + "m de longueur sur " + Y + "m de largeur.");
        if (animaux.size() != 0){
            for (Animal oiseau : animaux)
            {
                System.out.println(oiseau.prenom + " notre " + oiseau.getClass().getSimpleName().toLowerCase() + " se trouve dans la volière numéro " + id + ".");
            }
        }
        else {
            System.out.println("Il n'y a pas encore d'oiseaux dans la volière numéro " + id + ".");
        }
        System.out.println("");
    }

    @Override
    public void ajoutAnimal (Animal oiseau) throws BadAnimalSetted{
        if (oiseau.getClass().getSuperclass().getCanonicalName().equals("com.ocr.quentin.Oiseaux.Oiseau")) {
            oiseau.espace = this;
            this.animaux.add(oiseau);
        } else {
            throw new BadAnimalSetted();
        }
    }

    @Override
    public void supprAnimal (Animal oiseau){
        this.animaux.remove(oiseau);
    }

}