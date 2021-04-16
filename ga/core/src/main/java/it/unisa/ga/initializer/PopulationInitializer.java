package it.unisa.ga.initializer;

import it.unisa.ga.individual.Individual;
import it.unisa.ga.population.Population;

public abstract class PopulationInitializer<T extends Individual> {
    public abstract Population<T> initialize();
}
