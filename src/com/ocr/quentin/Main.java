package com.ocr.quentin;

import com.ocr.quentin.Felins.Jaguar;
import com.ocr.quentin.Felins.Panthere;
import com.ocr.quentin.Oiseaux.Toucan;
import com.ocr.quentin.Oiseaux.Paon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Animal> animaux = new ArrayList<>();
        List<Enclos> enclos = new ArrayList<>();
        List<Voliere> volieres = new ArrayList<>();

        Gestionnaire gestionnaire = new Gestionnaire(animaux, enclos, volieres);
        gestionnaire.gestion();
    }
}