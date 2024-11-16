package org.example;

/**
 * The main application class that demonstrates the functionality of the {@code Zoo} class
 * and its interaction with {@code Mammals} and {@code Bird}.
 */
public class App {

    /**
     * The entry point of the application.
     *
     * <p>Demonstrates adding, deleting, and displaying animals in the {@code Zoo}.</p>
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a Zoo instance for animals
        Zoo zoo = new Zoo();

        // Add various animals to the zoo
        zoo.add(new Mammals("Balena", 15, false));  // Add a mammal named "Balena"
        zoo.add(new Bird("Porumbel", 2, 12.0));    // Add a bird named "Porumbel"
        zoo.add(new Mammals("Ornitorinc", 24, true)); // Add a mammal named "Ornitorinc"

        // Delete animals from the zoo
        zoo.delete("Balena");
        zoo.delete("Porumbel");
        zoo.delete("Ornitorinc");

        // Display remaining animals in the zoo
        zoo.display();
    }
}


