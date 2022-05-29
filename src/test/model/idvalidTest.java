package model;

import org.junit.jupiter.api.BeforeEach;
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

    @BeforeEach
    void SetUp() {
        testPesel.setPesel("73340206991");
    }


    @Test
    void shouldDetectWrongMonth() {
        assertFalse(testPesel.isMonthCorrect());
        assertFalse(testPesel.veryfi());
    }

    @Test
    void shouldDetectWrongDayOfMonth() {
        assertFalse(testPesel.isDayOfMonthCorrect());
        assertFalse(testPesel.veryfi());
    }

    @Test
    void shouldDetectWrongPesel() {
        assertFalse(testPesel.veryfi());
    }

    // String correct and Pesel false
    @Test
    void shouldStringWrongPesel() {
        assertTrue(testPesel.PESEL_Check());
        assertFalse(testPesel.veryfi());
    }

    @Test
    void shouldDetectCorrectPesel() {
        testPesel.setPesel("73833062312");
        assertTrue(testPesel.PESEL_Check());
        assertTrue(testPesel.veryfi());
    }

    @Test
    void shouldDetect_CorrectMonth_IncorrectDayOfMonth_CorrectCheck_Incorrect_Pesel() {
        testPesel.setPesel("73833262316");
        assertTrue(testPesel.isMonthCorrect());
        assertFalse(testPesel.isDayOfMonthCorrect());
        assertTrue(testPesel.PESEL_Check());
        assertFalse(testPesel.veryfi());
    }

}