package org.example;

import java.util.ArrayList;

/**
 * Represents a zoo that can hold a collection of animals of a specific type.
 * The type of animals must extend the {@link Animal} class.
 *
 * @param <T> the type of animals that the zoo can contain
 */
public class Zoo<T extends Animal> {

    /**
     * The list of animals in the zoo.
     */
    private final ArrayList<T> animalList = new ArrayList<>();

    /**
     * Adds a new animal to the zoo if it is not already present.
     *
     * @param animal the animal to add
     * @throws IllegalArgumentException if the animal is already in the zoo
     */
    void add(T animal) {
        if (!(animalList.contains(animal))) {
            animalList.add(animal);
        } else {
            throw new IllegalArgumentException("Animal is already in the zoo");
        }
    }

    /**
     * Removes an animal from the zoo by its name.
     * If the animal is found, it is replaced with {@code null}.
     *
     * @param name the name of the animal to remove
     * @throws IllegalArgumentException if no animal with the given name is in the zoo
     */
    void delete(String name) {
        for (T animal : animalList) {
            if (animal != null) {
                if (name.equals(animal.getName())) {
                    int index = animalList.indexOf(animal);
                    animalList.set(index, null);
                    return;
                }
            }
        }
        throw new IllegalArgumentException(name + " is not in the zoo");
    }

    /**
     * Displays the details of all animals in the zoo.
     * If an animal is {@code null}, it indicates the animal is at the vet.
     *
     * @throws IllegalStateException    if the zoo is empty
     * @throws IllegalArgumentException if all animals are {@code null} (e.g., at the vet)
     */
    void display() {
        if (animalList.isEmpty()) {
            throw new IllegalStateException("Zoo is empty");
        }

        int countNull = 0;
        for (T animal : animalList) {
            if (animal != null) {
                animal.display();
            } else {
                System.out.println("Null");
                countNull++;
            }
            if (countNull == animalList.size()) {
                throw new IllegalArgumentException("All animals are at the vet in this moment");
            }
        }
    }
}
