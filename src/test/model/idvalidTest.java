package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdvalidTest {

    private final idvalid testPesel = new idvalid();

    @Test
    void shouldDetectWrongLengthPeselTooLong() {
        testPesel.setPesel("733420206991");
        assertFalse(testPesel.isLenghtCorrect());
        assertFalse(testPesel.veryfi());
    }

    @Test
    void shouldDetectWrongLengthPeselToShort() {
        testPesel.setPesel("7334202061");
        assertFalse(testPesel.isLenghtCorrect());
        assertFalse(testPesel.veryfi());
    }

    @Test
    void shouldDetectNonDigitOnlyPesel() {
        testPesel.setPesel("7334sd61");
        assertFalse(testPesel.isOnlyDigits());
        assertFalse(testPesel.veryfi());
    }
    @Test
    void shouldDetectWrongMonth() {
        testPesel.setPesel("73340206991");
        assertFalse(testPesel.isMonthCorrect());
        assertFalse(testPesel.veryfi());
    }
    @Test
    void shouldDetectWrongPesel() {
        testPesel.setPesel("73340206991");
        assertFalse(testPesel.veryfi());
    }



}