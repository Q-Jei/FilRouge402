package com.ocr.quentin;

import com.ocr.quentin.Felins.Jaguar;
import com.ocr.quentin.Felins.Panthere;
import com.ocr.quentin.Oiseaux.Paon;
import com.ocr.quentin.Oiseaux.Toucan;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Gestionnaire {
    protected Zoo zoo;

    public Gestionnaire (List<Animal> animaux, List<Enclos> enclos, List<Voliere> volieres) {
        Zoo zooDeDornach = new Zoo(animaux, enclos, volieres);
        this.zoo = zooDeDornach;

        //On obtient les animaux et les informations les concernant
        Animal toucan1 = new Toucan("Christophe", 3, 0.30, 0.110, "jaune et noir", "Brésil", "mâle","15/08/19", "non", "peu importe",null);
        Animal toucan2 = new Toucan("Patrice", 4, 0.4, 0.125, "rouge et noir", "Brésil","mâle", "15/08/19","oui", "peu importe",null);
        Animal paon1 = new Paon("Akita",  10, 1.00, 4.50, "bleu et vert", "Inde", "femelle", "15/08/19","non", "peu importe",null);
        Animal jaguar1 = new Jaguar("Zephyr", 5, 1.50, 72.0, "orange et noir", "Mexique", "mâle", "22/08/19","peu importe","non", null);
        Animal panthere1 = new Panthere("Zoe", 7, 1.10, 30.0, "noir", "Kenya", "femelle", "22/08/19","peu importe","oui", null);

        //On enregistre les animaux dans le zoo
        zooDeDornach.setAnimaux(toucan1);
        zooDeDornach.setAnimaux(toucan2);
        zooDeDornach.setAnimaux(paon1);
        zooDeDornach.setAnimaux(jaguar1);
        zooDeDornach.setAnimaux(panthere1);

        //On créé les volières et les enclos
        Voliere voliere1 = new Voliere(300, 300);
        Voliere voliere2 = new Voliere(300, 300);
        Enclos enclos1 = new Enclos(500, 500);
        Enclos enclos2 = new Enclos(500, 500);

        //On numérote les volières
        HashMap<Integer, Espace> voliereHM = new HashMap<>();
        voliereHM.put(1, voliere1);
        voliereHM.put(2, voliere2);

        //On numérote les enclos
        HashMap<Integer, Espace> enclosHM = new HashMap<>();
        enclosHM.put(1, enclos1);
        enclosHM.put(2, enclos2);

        //On met en place les espaces
        zooDeDornach.setVolieres(voliere1);
        zooDeDornach.setVolieres(voliere2);
        zooDeDornach.setEnclos(enclos1);
        zooDeDornach.setEnclos(enclos2);

        //On fait rentrer les oiseaux dans les volières
        voliereHM.get(1).ajoutAnimal(toucan1);
        voliereHM.get(1).ajoutAnimal(toucan2);
        voliereHM.get(2).ajoutAnimal(paon1);

        //On fait rentrer les félins dans les enclos
        enclosHM.get(1).ajoutAnimal(jaguar1);
        enclosHM.get(1).ajoutAnimal(panthere1);
    }

    public void gestion(){
        Scanner sc = new Scanner(System.in);
        StringBuffer gestion = new StringBuffer();
        gestion.append("Que souhaitez-vous faire ? \n");
        gestion.append(" 1 - Voir les animaux disponibles \n");
        gestion.append(" 2 - Voir le contenu des différents espaces de préservation \n");
        gestion.append(" 3 - Acheter un animal \n");
        gestion.append(" 4 - Afficher le budget du zoo \n");
        gestion.append(" 5 - Vendre un animal \n");
        gestion.append(" 6 - En savoir plus sur le zoo \n");
        gestion.append(" 7 - S'occuper de l'état de santé des animaux \n");
        gestion.append(" 8 - Quitter");
        System.out.println(gestion.toString());
        String choix = sc.nextLine();
        switch (choix) {
            case "1" : this.zoo.listAnimal();
                gestion();
                break;
            case "2" : this.zoo.listEspace();
                gestion();
                break;
            case "3" : this.ajouterAnimal();
                gestion();
                break;
            case "4" :
                System.out.println("Le zoo a un budget de " + this.zoo.argent +" euros \n");
                gestion();
                break;
            case "5" :
                this.vendreAnimal();
                gestion();
                break;
            case "6" : this.zoo.infoZoo();
                gestion();
                break;
            case "7" : this.santeAnimal();
                gestion();
                break;
            case "8" : System.out.println("Merci d'avoir utilisé notre système de gestion \"Made In Alsace\" ! \nÀ bientôt ! :^)");
                System.exit(0);
                break;
            default:
                System.err.println("Merci de faire un choix parmi ceux proposés !");
                gestion();
        }
    }

    public void ajouterAnimal()  {
        Scanner sc = new Scanner(System.in);
        StringBuffer gestion = new StringBuffer();
        gestion.append("Quel animal voulez-vous acheter ? \n");

        gestion.append(" 1 - Paon - " + new Paon("x",0,0,0,"x","x","x","x", "x", "x",null).prix + " euros \n");
        gestion.append(" 2 - Toucan - " + new Toucan("x",0,0,0,"x","x","x","x", "x", "x", null).prix + " euros \n");
        gestion.append(" 3 - Jaguar - " + new Jaguar("x",0,0,0,"x","x","x","x", "x", "x",null).prix + " euros \n");
        gestion.append(" 4 - Panthere - " + new Panthere("x",0,0,0,"x","x","x","x", "x", "x",null).prix + " euros \n");
        gestion.append(" 5 - Quitter");
        System.out.println(gestion.toString());
        String choix = sc.nextLine();
        if (choix.equals("5")){
            gestion();
        }
        else {
            String dateVisiteVeto = "Aucune";

            System.out.println("Donnez un nom à l'animal :");
            String prenom = sc.nextLine();

            System.out.println("Quel est son âge ? :");
            int age = Integer.parseInt(sc.nextLine());

            System.out.println("Combien mesure t-il ? :");
            double taille = Double.parseDouble(sc.nextLine());

            System.out.println("Combien pèse t-il ? :");
            double poids = Double.parseDouble(sc.nextLine());

            System.out.println("De quel sexe est-il ? (mâle/femelle) :");
            String sexe = sc.nextLine();

            System.out.println("Veuillez renseigner son pays d'origine :");
            String paysOrigine = sc.nextLine();

            int argentZoo = this.zoo.argent;

            switch (choix) {
                case "1":
                    System.out.println("Couleur du plumage :");
                    String couleur = sc.nextLine();

                    System.out.println("Cet animal peut-il voler ?");
                    System.out.println("1 - Oui");
                    System.out.println("2 - Non");
                    String voler = sc.nextLine();
                    if (voler.equals("1")) {
                        voler = "oui";
                    } else if (voler.equals("2")) {
                        voler = "non";
                    }

                    String courir = "Peu importe";

                    Animal paon = new Paon(prenom, age, taille, poids, couleur, paysOrigine, sexe, dateVisiteVeto, voler, courir,null);
                    zoo.setAnimaux(paon);
                    System.out.println(prenom + " le paon a été acheté !\n");
                    this.zoo.argent = argentZoo - paon.prix;
                    gestion();
                    break;

                case "2":
                    System.out.println("Couleur du plumage :");
                    couleur = sc.nextLine();

                    System.out.println("Cet animal peut-il voler ?");
                    System.out.println("1 - Oui");
                    System.out.println("2 - Non");
                    voler = sc.nextLine();
                    if (voler.equals("1")) {
                        voler = "oui";
                    } else if (voler.equals("2")) {
                        voler = "non";
                    }

                    courir = "Peu importe";

                    Animal toucan = new Toucan(prenom, age, taille, poids, couleur, paysOrigine, sexe, dateVisiteVeto, voler, courir,null);
                    zoo.setAnimaux(toucan);
                    System.out.println(prenom + " le toucan a été acheté !\n");
                    this.zoo.argent = argentZoo - toucan.prix;
                    gestion();
                    break;

                case "3":
                    System.out.println("Couleur du pelage :");
                    couleur = sc.nextLine();

                    System.out.println("Cet animal peut-il courir ?");
                    System.out.println("1 - Oui");
                    System.out.println("2 - Non");
                    courir = sc.nextLine();
                    if (courir.equals("1")) {
                        courir = "oui";
                    } else if (courir.equals("2")) {
                        courir = "non";
                    }

                    voler = "Peu importe";

                    Animal jaguar = new Jaguar(prenom, age, taille, poids, couleur, paysOrigine, sexe, dateVisiteVeto, voler, courir, null);
                    zoo.setAnimaux(jaguar);
                    System.out.println(prenom + " le jaguar a été acheté !\n");
                    this.zoo.argent = argentZoo - jaguar.prix;
                    gestion();
                    break;

                case "4":
                    System.out.println("Couleur du pelage :");
                    couleur = sc.nextLine();

                    System.out.println("Cet animal peut-il courir ?");
                    System.out.println("1 - Oui");
                    System.out.println("2 - Non");
                    courir = sc.nextLine();
                    if (courir.equals("1")) {
                        courir = "oui";
                    } else if (courir.equals("2")) {
                        courir = "non";
                    }

                    voler = "Peu importe";

                    Animal panthere = new Panthere(prenom, age, taille, poids, couleur, paysOrigine, sexe, dateVisiteVeto, voler, courir, null);
                    zoo.setAnimaux(panthere);
                    System.out.println(prenom + " la panthère a été achetée !\n");
                    this.zoo.argent = argentZoo - panthere.prix;
                    gestion();
                    break;
                default:
                    System.err.println("Veuilez faire un choix parmi ceux proposés !");
                    gestion();
            }
        }
    }

    public void vendreAnimal() {
        Scanner sc = new Scanner(System.in);
        int budgetZoo = this.zoo.argent;
        if (this.zoo.animaux.size() != 0) {
            System.out.println("Quel animal souhaitez-vous vendre ? (Décôte de 25%) \n");
            for (int i = 0; i < this.zoo.animaux.size(); i++) {
                double prixVente = this.zoo.animaux.get(i).prix * 0.75;
                int prix = (int) prixVente;
                System.out.println(i + " - " + this.zoo.animaux.get(i).prenom + " (" + this.zoo.animaux.get(i).getClass().getSimpleName() + ") --> " + prix + " euros");
            }
            System.out.println("");
            int choix = sc.nextByte();
            Animal animalchoisi = this.zoo.animaux.get(choix);
            Espace espaceAnimal = animalchoisi.espace;
            double prixVente = animalchoisi.prix * 0.75;
            int prix = (int) prixVente;
            this.zoo.argent = budgetZoo + prix;
            if (espaceAnimal == null) {
                this.zoo.animaux.remove(choix);
            } else if (espaceAnimal != null) {
                this.zoo.animaux.remove(choix);
                espaceAnimal.animaux.remove(animalchoisi);
            }
            System.out.println(animalchoisi.prenom + " le " + animalchoisi.getClass().getSimpleName().toLowerCase() + " a été vendu pour " + prix + " euros !\n");
        } else {
            System.out.println("Requête refusée. Aucun animal n'a été trouvé dans le zoo.\n");
        }
    }

    public void santeAnimal()  {
        Scanner sc = new Scanner(System.in);
        StringBuffer gestion = new StringBuffer();
        gestion.append("Quelle action désirez-vous effectuer ?\n");

        gestion.append(" 1 - Vérifier les dates de la dernière visite du vétérinaire pour tous les animaux\n");
        gestion.append(" 2 - Mettre à jour les dates de visite du vétérinaire pour un animal\n");
        gestion.append(" 3 - Vérifier les conditions physiques de tous les animaux\n");
        gestion.append(" 4 - Mettre à jour les conditions physiques d'un animal\n");
        gestion.append(" 5 - Quitter\n");
        System.out.println(gestion.toString());
        String choix = sc.nextLine();
        if (choix.equals("5")) {
            gestion();
        }
        else {
            switch (choix) {
                case "1":
                    if (this.zoo.animaux.size() != 0) {
                        System.out.println("Dates du dernier passage du vétérinaire par animal :");
                        for (int i = 0; i < this.zoo.animaux.size(); i++) {
                            System.out.println(this.zoo.animaux.get(i).prenom + " (" + this.zoo.animaux.get(i).getClass().getSimpleName() + ") --> " + this.zoo.animaux.get(i).dateVisiteVeto);
                        } System.out.println("");
                    } else {
                        System.out.println("Requête refusée. Aucun animal n'a été trouvé dans le zoo.\n");
                    }
                    gestion();
                    break;
                case "2":
                    sc = new Scanner(System.in);
                    if (this.zoo.animaux.size() != 0) {
                        System.out.println("Mettre à jour la date de visite de quel animal ?\n");
                        for (int i = 0; i < this.zoo.animaux.size(); i++) {
                            System.out.println(i + " - " + this.zoo.animaux.get(i).prenom + " (" + this.zoo.animaux.get(i).getClass().getSimpleName() + ")");
                        }
                        System.out.println("");
                        int choix2 = sc.nextByte();
                        Animal animalchoisi = this.zoo.animaux.get(choix2);
                        sc = new Scanner(System.in);
                        gestion = new StringBuffer();
                        System.out.println("Entrez la nouvelle date de visite : (Format recommandé --> xx/yy/zz)");
                        String dateVisiteVeto = sc.nextLine();
                        this.zoo.animaux.get(choix2).dateVisiteVeto = dateVisiteVeto;
                        System.out.println("Nouvelle date de visite enregistrée pour " + this.zoo.animaux.get(choix2).prenom + " !\n");
                    } else {
                        System.out.println("Requête refusée. Aucun animal n'a été trouvé dans le zoo.\n");
                    }
                    gestion();
                    break;
                case "3":
                    if (this.zoo.animaux.size() != 0) {
                            this.zoo.testAbility();
                    } else {
                        System.out.println("Requête refusée. Aucun animal n'a été trouvé dans le zoo.\n");
                    }
                    gestion();
                    break;
                case "4":
                    sc = new Scanner(System.in);
                    if (this.zoo.animaux.size() != 0) {
                        System.out.println("Mettre à jour les conditions physiques de quel animal ?\n");
                        for (int i = 0; i < this.zoo.animaux.size(); i++) {
                            System.out.println(i + " - " + this.zoo.animaux.get(i).prenom + " (" + this.zoo.animaux.get(i).getClass().getSimpleName() + ")");
                        }
                        System.out.println("");
                        int choix2 = sc.nextByte();
                        Animal animalchoisi = this.zoo.animaux.get(choix2);
                        if (animalchoisi.getClass().getSuperclass().getCanonicalName().equals("com.ocr.quentin.Felins.Felin")) {
                            sc = new Scanner(System.in);
                            gestion = new StringBuffer();
                            System.out.println("Ce félin peut-il courir ?");
                            System.out.println("1 - Oui");
                            System.out.println("2 - Non");
                            String proposition = sc.nextLine();
                            if (proposition.equals("1")) {
                                String courir = "oui";
                                animalchoisi.courir = courir;
                            } else if (proposition.equals("2")) {
                                String courir = "non";
                                animalchoisi.courir = courir;
                            }
                            System.out.println("Les compétences à la course de " + this.zoo.animaux.get(choix2).prenom + " ont été mises à jour !\n");
                        } else if (animalchoisi.getClass().getSuperclass().getCanonicalName().equals("com.ocr.quentin.Oiseaux.Oiseau")) {
                            sc = new Scanner(System.in);
                            gestion = new StringBuffer();
                            System.out.println("Cet oiseau peut-il voler ?");
                            System.out.println("1 - Oui");
                            System.out.println("2 - Non");
                            String proposition = sc.nextLine();
                            if (proposition.equals("1")) {
                                String voler = "oui";
                                animalchoisi.voler = voler;
                            } else if (proposition.equals("2")) {
                                String voler = "non";
                                animalchoisi.voler = voler;
                            }
                            System.out.println("Les compétences au vol de " + this.zoo.animaux.get(choix2).prenom + " ont été mises à jour !\n");
                        }
                    } else {
                        System.out.println("Requête refusée. Aucun animal n'a été trouvé dans le zoo.\n");
                    }
                    gestion();
                    break;
                default:
                    System.err.println("Veuilez faire un choix parmi ceux proposés !");
                    gestion();
            }
        }
    }
}
