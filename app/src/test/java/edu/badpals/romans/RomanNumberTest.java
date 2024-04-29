package edu.badpals.romans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberTest {

    @Test
    public void toDecimal() {
        RomanNumber romanNumber = new RomanNumber("X");
        assertEquals((short)10, romanNumber.toDecimal());
    }

    @Test
    public void toDecimal2() {
        RomanNumber romanNumber = new RomanNumber("XXX");
        assertEquals((short)30, romanNumber.toDecimal());
    }
}