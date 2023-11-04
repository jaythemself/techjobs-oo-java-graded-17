package org.launchcode.techjobs.oo;

import org.junit.Test;

//import static java.lang.System.lineSeparator;

import static org.junit.Assert.*;

public class JobTest {

// Task 4
// Create a JUnit Run Config
// 1. Test Empty Constructor
//      Define a test called testSettingJobId. annotate w @Test
//      Create 2 Job objects using empty constructor
//      Use assertNotEquals to verify IDs of the 2 objects are distinct
//      Run test using run config created
//      If test doesn't pass, try to first fix Job() constructor code
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
        //assertTrue(exampleAllFields instanceof Job); context actions suggested changing it to line 43
        //assertTrue(true);
        //assertEquals has to be used w getValue otherwise it brings up field (org.launchcode.techjobs.oo.Employer<ACME> vs java.lang.String<ACME>)
        //why did name pass then? bc it's Job/id which isn't a field of Job?? reread
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
    //      Should fail before fixing.

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        Job exampleJob = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );

        String exampleFirstChar = String.valueOf(exampleJob.toString().charAt(0));
        String exampleLastChar = String.valueOf(exampleJob.toString().charAt(exampleJob.toString().length() - 1));

        //assertEquals(exampleFirstChar, lineSeparator());
        //assertEquals(exampleLastChar, lineSeparator());

        assertEquals(exampleFirstChar, "\n");
        assertEquals(exampleLastChar, "\n");

        // Test failing again but NEW, more CONFUSING way. Progress!
        // Think I'm messing up lineSeparator() so rewriting with \n until that passes, then try to adjust for lineSep
        // Yeah all tests up to this point pass with \n, come back later

    }

    // 3. Finish TDD for toString
    //      Define test called testToStringContainsCorrectLabelsAndData (run to ensure fails)
    //      Modify toString to make test pass/old tests continue to pass
                        //    String exampleExpectedOutput = lineSeparator() + "ID: " + exampleJob.getId()
                        //            + lineSeparator() + "Name: " + exampleJob.getName()
                        //            + lineSeparator() + "Employer: " + exampleJob.getEmployer()
                        //            + lineSeparator() + "Location: " + exampleJob.getLocation()
                        //            + lineSeparator() + "Position Type: " + exampleJob.getPositionType()
                        //            + lineSeparator() + "Core Competency: " + exampleJob.getCoreCompetency()
                        //            ;
    //      String should contain a label for each field, followed by data stored in that field. Each field on its own line.
    //**      If field is empty, method should add "Data not available" after the label
    //**      (Optional) If a Job object ONLY contains data for id field, method should return "OOPS! This job does not seem to exist."

    //TODO: Last 2 tests for task 5, check and make sure things are printing correctly and older tests still pass, then task 6 & 7
    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        Job exampleJob = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );

//        assertEquals("\n" + "ID: " + exampleJob.getId()
//                        + "\n" + "Name: " + exampleJob.getName()
//                        + "\n" + "Employer: " + exampleJob.getEmployer()
//                        + "\n" + "Location: " + exampleJob.getLocation()
//                        + "\n" + "Position Type: " + exampleJob.getPositionType()
//                        + "\n" + "Core Competency: " + exampleJob.getCoreCompetency()
//                        + "\n"
//                , exampleJob.toString());
        assertEquals("\n" + "ID: " + exampleJob.getId()
                        + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n"
                , exampleJob.toString());

    }

    // 4. Define test called testToStringHandlesEmptyField
    //      No specific instructions beyond "Follow the same TDD process"

    @Test
    public void testToStringHandlesEmptyField() {
        //code here
    }

}
