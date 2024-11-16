package org.example;

/**
 * Represents a subclass of {@code Animal} that models birds.
 * In addition to the properties of an animal, birds have a wingspan.
 */
public class Bird extends Animal {

    /** The wingspan of the bird in centimeters. */
    private double wingSpan;

    /**
     * Constructs a new {@code Bird} instance with the specified name, age, and wingspan.
     *
     * @param name     the name of the bird
     * @param age      the age of the bird
     * @param wingSpan the wingspan of the bird in centimeters
     */
    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    /**
     * Returns the wingspan of the bird.
     *
     * @return the wingspan of the bird in centimeters
     */
    public double getWingSpan() {
        return wingSpan;
    }

    /**
     * Sets the wingspan of the bird.
     *
     * @param wingSpan the new wingspan of the bird in centimeters
     */
    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    /**
     * Displays the details of the bird, including its name, age, and wingspan.
     * The output format is: {@code name age wingspan cm}.
     */
    @Override
    void display() {
        System.out.println(super.getName() + " " + super.getAge() + " " + this.wingSpan + "cm");
    }
}
