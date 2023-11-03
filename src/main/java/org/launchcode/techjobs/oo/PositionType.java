package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType {

    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // Task 2 (PositionType part 1)
    // Add a custom toString() method that returns the 'value' of a PositionType object.
   public String toString() {
        return value;
   }

    // Task 2 (PositionType part 2)
    // Use the Generate tool to add custom equals and hashCode methods.
    // Consider two PositionType objects "equal" when their id fields match.
    // Classes and Objects Part 2 intelliJ Generator Shortcut section for review

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
