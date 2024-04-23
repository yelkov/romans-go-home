package edu.badpals.romans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternRomanNumberTest {
    @Test
    public void test_cleanRoman_simple(){
        String cleanRoman = PatternRomanNumber.cleanRomanNumber("UMMMU");
        assertEquals("MMM",cleanRoman);
        String cleanRoman1 = PatternRomanNumber.cleanRomanNumber("UMMU");
        assertEquals("MM",cleanRoman1);
        String cleanRoman3 = PatternRomanNumber.cleanRomanNumber("UU");
        assertEquals("",cleanRoman3);
    }
    @Test
    public void test_cleanRoman_fourSymbols() {
        String cleanRoman = PatternRomanNumber.cleanRomanNumber("UMMMMU");
        assertEquals("MMM", cleanRoman);
        String cleanRoman1 = PatternRomanNumber.cleanRomanNumber("UMMMMUCCCC");
        assertEquals("MMMCCC",cleanRoman1);
    }

}