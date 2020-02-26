package org.example;

import org.junit.Ignore;
import org.junit.Test;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    // i. Object equality
    @Test
    public void testingForObjectEquality() {

        List<Integer> originalGeneration = IntStream.range(0, 10)
                                                    .boxed()
                                                    .collect(Collectors.toList());

        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();

        list1.addAll(originalGeneration);
        list2.addAll(originalGeneration);

        assertEquals(list1, list2);

    }

    // ii. Object identity
    @Test
    public void doesThisObjectShareTheSameIdentity() {

        int num1 = 1;
        String randomText = "asdfghjkl";

        assertNotSame(randomText, num1);

    }

    // iii. Failing test
    @Test
    public void deliberateFailedTest() {

        fail("Deliberate Failed Test");

    }

    // iv. Timeout test
    @Test(timeout = 10000)
    public void timeOutTest() {

        int input = Integer.parseInt(JOptionPane.showInputDialog("Please give a number:"));
        // wait for user input

    }

    // v. Disabling test
    @Ignore
    @Test
    public void disabledTest() {

        int actual = 0;
        String unexpected = "0";
        assertNotSame(unexpected, actual);

    }

}
