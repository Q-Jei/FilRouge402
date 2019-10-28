package com.ocr.quentin;

import java.util.ArrayList;
import java.util.List;

public abstract class Espace {
    protected int X;
    protected int Y;
    protected List<Animal> animaux = new ArrayList<>();

    public Espace(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public Espace(int x, int y, List<Animal> animaux) {
        this.X = x;
        this.Y = y;
        this.animaux = animaux;
    }

    public abstract void infoEspace (int id);

    public abstract void ajoutAnimal(Animal animal);

    public abstract void supprAnimal(Animal animal);

}