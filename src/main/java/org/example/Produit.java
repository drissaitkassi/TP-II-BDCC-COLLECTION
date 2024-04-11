package org.example;

import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;


class Produit {
    private long id;
    private String nom;
    private double prix;

    public Produit(long id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    public Produit() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}

 class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> listeProduits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        listeProduits.add(new Produit(1, "Ordinateur", 999.99));
        listeProduits.add(new Produit(2, "Smartphone", 699.99));
        listeProduits.add(new Produit(3, "Tablette", 399.99));

        System.out.println("Liste des produits:");
        for (Produit produit : listeProduits) {
            System.out.println(produit);
        }

        listeProduits.remove(1);

        System.out.println("\nListe des produits après suppression:");
        for (Produit produit : listeProduits) {
            System.out.println(produit);
        }

        Produit nouveauProduit = new Produit(2, "Nouveau produit", 499.99);
        listeProduits.set(1, nouveauProduit);

        System.out.println("\nListe des produits après modification:");
        for (Produit produit : listeProduits) {
            System.out.println(produit);
        }

        System.out.println("\nRecherche d'un produit par nom:");
        System.out.print("Entrez le nom du produit à rechercher: ");
        String nomRecherche = scanner.nextLine();
        for (Produit produit : listeProduits) {
            if (produit.getNom().equalsIgnoreCase(nomRecherche)) {
                System.out.println("Produit trouvé: " + produit);
                break;
            }
        }
    }
}

