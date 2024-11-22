package org.sid.web;

import reactor.core.publisher.Flux;

public class BackpressureExample {
    public static void main(String[] args) {
        // Producteur de données : une séquence de 1000 éléments
        Flux<Integer> flux = Flux.range(1, 100);

        // Consommateur avec gestion de backpressure (par exemple, il traite lentement les données)
        flux
                .doOnNext(item -> System.out.println("Émis : " + item)) // Log des données émises par le producteur
                .limitRate(5) // Limite les demandes à 10 éléments à la fois
                .doOnNext(item -> {
                    try {
                        Thread.sleep(1000); // Simulation d'un traitement lent
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Reçu et traité : " + item); // Log des données traitées par le consommateur

                })
                 // Log des données traitées par le consommateur
                .subscribe();

    }
}
