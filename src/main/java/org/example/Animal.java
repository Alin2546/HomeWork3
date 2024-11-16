package org.example;

/**
 * Represents an abstract base class for animals.
 * Each animal has a name and an age, and subclasses must define how to display the animal's details.
 */
public abstract class Animal {

    /** The name of the animal. */
    private final String name;

    /** The age of the animal. */
    private int age;

    /**
     * Constructs a new {@code Animal} with the specified name and age.
     *
     * @param name the name of the animal
     * @param age  the age of the animal
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the name of the animal.
     *
     * @return the name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the age of the animal.
     *
     * @return the age of the animal
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the animal.
     *
     * @param age the new age of the animal
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Displays the details of the animal.
     * Subclasses must provide an implementation for this method.
     */
    abstract void display();
}
