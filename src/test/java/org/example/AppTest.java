package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The {@code AppTest} class contains unit tests for the Zoo application,
 * verifying functionality related to adding animals and handling duplicates.
 */
public class AppTest {
    private Animal animal1; // Represents a Mammal used in tests
    private Animal animal2; // Represents a Bird used in tests
    private List<Animal> list; // List of animals for testing
    Zoo<Animal> zoo = new Zoo<>(); // The Zoo instance being tested

    /**
     * Initializes test data before each test method is run.
     * Creates example animals and an empty animal list.
     */
    @BeforeEach
    public void init() {
        animal1 = new Mammals("Balena", 15, false);
        animal2 = new Bird("Porumbel", 8, 11.25);
        list = new ArrayList<>();
    }

    /**
     * Tests that new animals can be added to the list without issues.
     * Verifies the list size and the presence of added animals.
     */
    @Test
    void shouldAddNewAnimal() {
        list.add(animal1);
        list.add(animal2);
        assertEquals(2, list.size(), "The list should contain 2 animals.");
        assertTrue(list.contains(animal1), "The list should contain the first animal.");
        assertTrue(list.contains(animal2), "The list should contain the second animal.");
    }

    /**
     * Tests that the Zoo prevents adding duplicate animals.
     * Verifies that an exception is thrown when attempting to add a duplicate.
     */
    @Test
    void shouldNotAcceptDuplicates() {
        zoo.add(animal1);
        try {
            zoo.add(animal1); // Attempt to add the same animal again
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Animal is already in the zoo",
                    "The exception message should indicate the animal is already present.");
        }
    }
}