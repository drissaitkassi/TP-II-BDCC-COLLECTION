package org.example;

import java.util.HashMap;
import java.util.Map;

public class GestionNotesApp {
    public static void main(String[] args) {
        Map<String, Double> notesEtudiants = new HashMap<>();

        notesEtudiants.put("Alice", 15.5);
        notesEtudiants.put("Bob", 18.75);
        notesEtudiants.put("Charlie", 13.25);

        notesEtudiants.put("Bob", notesEtudiants.get("Bob") + 1.25);

        notesEtudiants.remove("Charlie");

        System.out.println("Taille du map: " + notesEtudiants.size());

        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (double note : notesEtudiants.values()) {
            total += note;
            if (note > max) {
                max = note;
            }
            if (note < min) {
                min = note;
            }
        }
        double moyenne = total / notesEtudiants.size();
        System.out.println("Note moyenne: " + moyenne);
        System.out.println("Note maximale: " + max);
        System.out.println("Note minimale: " + min);

        boolean existeNote20 = notesEtudiants.containsValue(20.0);
        System.out.println("Existe-t-il une note égale à 20 ? " + existeNote20);

        System.out.println("Liste des notes des étudiants:");
        notesEtudiants.forEach((nom, note) -> System.out.println(nom + ": " + note));
    }
}
