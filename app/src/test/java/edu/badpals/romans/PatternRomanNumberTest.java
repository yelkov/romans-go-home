package edu.badpals.romans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternRomanNumberTest {
    @Test
    public void test_cleanRoman_simple(){
        String cleanRoman = PatternRomanNumber.sumatoryPattern("UMMMU");
        assertEquals("MMM",cleanRoman);
        String cleanRoman1 = PatternRomanNumber.sumatoryPattern("UMMU");
        assertEquals("MM",cleanRoman1);
        String cleanRoman3 = PatternRomanNumber.sumatoryPattern("UU");
        assertEquals("",cleanRoman3);
    }
}