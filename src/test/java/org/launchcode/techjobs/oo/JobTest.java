package org.launchcode.techjobs.oo;

import org.junit.Test;

//import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

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
        //assertTrue(exampleAllFields instanceof Job); context actions suggested changing it to line 44
        //assertTrue(true);
        //assertEquals has to be used w getValue otherwise it brings up field (org.launchcode.techjobs.oo.Employer<ACME> vs java.lang.String<ACME>)
        //why did name pass then? bc it's Job which isn't a field of Job?? reread
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



}
