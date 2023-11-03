package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

// Task 3 (Job part 1)
// Code a constructor to initialize the 'id' field with a unique 'value'. This constructor should take no parameters.
    public Job() {
        id = nextId;
        nextId++;
    }

// Task 3 (Job part 2)
// Code a second constructor that takes 5 parameters and assigns values to name, employer, location, positionType, and coreCompetency.
// Also, this constructor should call the first in order to initialize the 'id' field [this();]. Make sure the parameters are defined in the specified order.
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

// Task 3 (Job part 5)
// Generate the equals and hashCode methods. Consider two Job objects equal when their id fields match. (Just id then? Passed all but the Get(parameter) tests so yeah)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

// Task 3 (Job part 3)
// Generate getters and setters for each field EXCEPT nextID and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // Task 3 (Job part 4)
// Generate a getter for the id field.
    public int getId() {
        return id;
    }

}
