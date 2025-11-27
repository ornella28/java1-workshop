package se.lexicon;

import java.util.Scanner;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; // important to include when conducting tests




public class calculatorApplicationTest { // created to conduct tests with JUnit

    @org.junit.jupiter.api.AfterEach
    void tearDown() {


    }

    @Test // this helps to see the play button
    void testAddition() {
        assertEquals(5, calculatorApplication.addition(2, 3));

    }
    @Test
    void testMultiplication() {
        assertEquals(8, calculatorApplication.multiplication(2, 4));

    }
    @Test
    void testSubtraction() {
        assertEquals(2, calculatorApplication.subtraction(4, 2));
    }
    @Test
    void testDivision() {
        assertEquals(2, calculatorApplication.division(20, 10));
    }


}