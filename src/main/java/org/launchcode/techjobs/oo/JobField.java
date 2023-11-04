package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField jobField)) return false;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
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

// Task 6:
// DRY code. Move repeated code here and have Employer, Location, CoreCompetency, and PositionType inherit.
// What fields do ALL FOUR classes have in common? Which constructors are the same? What getters and setters do they share? Which custom methods?
// 1.1 Declare the common fields and code the constructors
// 1.2 Use Generate to create appropriate getters and setters
// 1.3 Add in custom methods
// 1.4 To prevent the creation of a JobField object, make this class abstract

// 2. Modify Employer to extend JobField as example is shown. Remove redundant code (id, value, nextId etc), getters and setters, custom methods
//      The empty constructor is shared, but not the other. Replace with provided text using super keyword

// 3. Repeat process with Location, CoreCompetency, PositionType classes. Ensure tests still pass
