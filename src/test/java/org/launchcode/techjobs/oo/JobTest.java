package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;

import static org.junit.Assert.*;

public class JobTest {

// Task 4
// 1. Test Empty Constructor
//      Define a test called testSettingJobId. annotate w @Test
//      Create 2 Job objects using empty constructor
//      Use assertNotEquals to verify IDs of the 2 objects are distinct
    @Test
    public void testSettingJobId() {

        Job exampleJobOne = new Job();
        Job exampleJobTwo = new Job();
        assertNotEquals(exampleJobOne.getId(), exampleJobTwo.getId());

    }

// 2. Test Full Constructor
//      Define test called testJobConstructorSetsAllFields
//      Declare and initialize new Job object with provided data
//      Use assertTrue and assertEquals statements to test constructor correctly assigns both the class and value of field
//      Tests should have 5 assert statements of each type (instanceof keyword can check class of object. result is a boolean)
    @Test
    public void testJobConstructorSetsAllFields() {

        Job exampleAllFields = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        //assertTrue(exampleAllFields instanceof Job); context actions suggested changing it to line 41
        //assertTrue(true);
        //assertEquals has to be used w getValue otherwise it brings up field (org.launchcode.techjobs.oo.Employer<ACME> vs java.lang.String<ACME>)
        assertTrue(exampleAllFields.getName() instanceof String);
        assertTrue(exampleAllFields.getEmployer() instanceof Employer);
        assertTrue(exampleAllFields.getLocation() instanceof Location);
        assertTrue(exampleAllFields.getPositionType() instanceof PositionType);
        assertTrue(exampleAllFields.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", exampleAllFields.getName());
        assertEquals("ACME", exampleAllFields.getEmployer().getValue());
        assertEquals("Desert", exampleAllFields.getLocation().getValue());
        assertEquals("Quality control", exampleAllFields.getPositionType().getValue());
        assertEquals("Persistence", exampleAllFields.getCoreCompetency().getValue());

    }

// 3. Test equals Method
//      Define test called testJobsForEquality (equal if id value is same, regardless of other fields)
//      Generate 2 Job objects that are identical EXCEPT id. Test returns false (true is irrelevant)
    @Test
    public void testJobsForEquality() {

        Job exampleJobOne = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );

        Job exampleJobTwo = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );

        //original assertFalse(exampleJobOne.equals(exampleJobTwo)); prompted to simplify
        assertNotEquals(exampleJobOne, exampleJobTwo);

    }

    // Task 5
    // 1. Define test called testToStringStartsAndEndsWithNewLine
    //      When passed a Job object should return a string that contains a blank line before and after job information
    //      Use assertEquals to verify these characters are correct and use the exact formatting provided.
    //      Be sure to use System.lineSeparator() to declare new line. Universal line break works on variety of OS. Need to use in Job class AND JobTests.
    //      Test ONLY checks if the returned string starts and ends with a blank line at this point
    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        Job exampleJob = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );

        String firstChar = String.valueOf(exampleJob.toString().charAt(0));
        String lastChar = String.valueOf(exampleJob.toString().charAt(exampleJob.toString().length() - 1));

        assertEquals(firstChar, lineSeparator());
        assertEquals(lastChar, lineSeparator());

    }

    // 3. Finish TDD for toString
    //      Define test called testToStringContainsCorrectLabelsAndData (run to ensure fails)
    //      String should contain a label for each field, followed by data stored in that field. Each field on its own line.
    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        Job exampleJob = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );

        assertEquals(lineSeparator() + "ID: " + exampleJob.getId()
                        + lineSeparator() + "Name: Product tester" + lineSeparator() + "Employer: ACME" + lineSeparator() + "Location: Desert" + lineSeparator()
                        + "Position Type: Quality control" + lineSeparator() + "Core Competency: Persistence" + lineSeparator()
                , exampleJob.toString());

    }

    // 4. Define test called testToStringHandlesEmptyField
    //      If field is empty, method should add "Data not available" after the label

    @Test
    public void testToStringHandlesEmptyField() {

        Job exampleJob = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location(""),
                new PositionType(""),
                new CoreCompetency("Persistence")
        );

        assertEquals(lineSeparator() + "ID: " + exampleJob.getId()
                        + lineSeparator() + "Name: Product tester" + lineSeparator() + "Employer: ACME" + lineSeparator() + "Location: Data not available" + lineSeparator()
                        + "Position Type: Data not available" + lineSeparator() + "Core Competency: Persistence" + lineSeparator()
                , exampleJob.toString());

    }

}
