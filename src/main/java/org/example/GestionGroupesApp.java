package org.example;

import java.util.HashSet;
import java.util.Set;

public class GestionGroupesApp {
    public static void main(String[] args) {
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        groupeA.add("Alice");
        groupeA.add("Bob");
        groupeA.add("Charlie");

        groupeB.add("David");
        groupeB.add("Eve");
        groupeB.add("Frank");

        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("Intersection des deux groupes: " + intersection);

        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union des deux groupes: " + union);
    }
}

