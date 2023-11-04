package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

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

}

// 2. Test Full Constructor
//      Define test called testJobConstructorSetsAllFields
//      Declare and initialize new Job object with provided data
//              new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//      Use assertTrue and assertEquals statements to test constructor correctly assigns both the class and value of field
//      Tests should have 5 assert statements of each type (instanceof keyword can check class of object. result is a boolean)

// 3. Test equals Method
//      Define test called testJobsForEquality (equal if id value is same, regardless of other fields)
//      Generate 2 Job objects that are identical EXCEPT id. Test returns false (true is irrelevant)