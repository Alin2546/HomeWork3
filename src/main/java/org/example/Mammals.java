package org.example;

/**
 * Represents a subclass of {@code Animal} that models mammals.
 * In addition to the properties of an animal, mammals can be characterized as nocturnal.
 */
public class Mammals extends Animal {

    /** Indicates whether the mammal is nocturnal. */
    private final boolean isNocturnal;

    /**
     * Constructs a new {@code Mammals} instance with the specified name, age, and nocturnal status.
     *
     * @param name        the name of the mammal
     * @param age         the age of the mammal
     * @param isNocturnal {@code true} if the mammal is nocturnal; {@code false} otherwise
     */
    public Mammals(String name, int age, boolean isNocturnal) {
        super(name, age);
        this.isNocturnal = isNocturnal;
    }

    /**
     * Returns whether the mammal is nocturnal.
     *
     * @return {@code true} if the mammal is nocturnal; {@code false} otherwise
     */
    public boolean isNocturnal() {
        return isNocturnal;
    }

    /**
     * Displays the details of the mammal, including its name, age, and nocturnal status.
     * The output format is: {@code name age isNocturnal}.
     */
    @Override
    void display() {
        System.out.println(super.getName() + " " + super.getAge() + " " + this.isNocturnal);
    }
}




