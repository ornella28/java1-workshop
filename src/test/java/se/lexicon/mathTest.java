package se.lexicon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class mathTest { // for testing advanced mathematic

    @Test
    void testPower(){ // testing Power
        assertEquals(4, calculatorApplication.power(2, 2));
    }

    @Test
    void testSin(){ // testing Sinus
        assertEquals(-0.49091654962890824, calculatorApplication.sin(1564));
    }
}
