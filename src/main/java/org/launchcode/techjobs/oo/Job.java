package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;

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

// Task 5.2 (Job part 1)
// 2. Code toString in Job class to pass toString test. String should contain a label for each field, followed by data stored in that field. Each field on its own line.

    @Override
    public String toString() {
//        if ((this.getName() == null) || (this.getEmployer() == null) || (this.getLocation() == null) || (this.getPositionType() == null) || (this.getCoreCompetency() == null)) {
//            return "Data not available";
//        }
        // if (this.getName() [validate stuff here] && this.getEmployer() == null etc etc return OOPS)
        // Should be validating w .isEmpty()/.isBlank() etc too??
        if (name.isBlank()) {name = "Data not available";}
        if (employer.getValue().isBlank() || employer.getValue() == null) {employer.setValue("Data not available");}
        if (location.getValue().isBlank() || location.getValue() == null) {location.setValue("Data not available");}
        if (positionType.getValue().isBlank() || positionType.getValue() == null) {positionType.setValue("Data not available");}
        if (coreCompetency.getValue().isBlank() || coreCompetency.getValue() == null) {coreCompetency.setValue("Data not available");}
//        return String.format(lineSeparator() + "ID: " + this.getId()
//                + lineSeparator() + "Name: " + this.getName()
//                + lineSeparator() + "Employer: " + this.getEmployer()
//                + lineSeparator() + "Location: " + this.getLocation()
//                + lineSeparator() + "Position Type: " + this.getPositionType()
//                + lineSeparator() + "Core Competency: " + this.getCoreCompetency()
//                + lineSeparator()
//        );

        String formattedString = String.format(lineSeparator() + "ID: " + id
                + lineSeparator() + "Name: " + name
                + lineSeparator() + "Employer: " + employer.getValue()
                + lineSeparator() + "Location: " + location.getValue()
                + lineSeparator() + "Position Type: " + positionType.getValue()
                + lineSeparator() + "Core Competency: " + coreCompetency.getValue()
                + lineSeparator()
                //"\n" + "Field: " + this.getField() or alt "\n" + "Field: " + field.getValue(), do either work easier w tests/validation needed?
                //both fail starts/ends w new line in the same way :(
        );
        return formattedString;
    }

}
