package edu.badpals.romans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternRomanNumberTest {
    @Test
    public void test_cleanRoman(){
        String cleanRoman = PatternRomanNumber.cleanRomanNumber("UMMMU");
        assertEquals("MMM",cleanRoman);
        String cleanRoman1 = PatternRomanNumber.cleanRomanNumber("UMMU");
        assertEquals("MM",cleanRoman1);
        String cleanRoman2 = PatternRomanNumber.cleanRomanNumber("UMMMMU");
        assertEquals("MMM",cleanRoman2);
        String cleanRoman3 = PatternRomanNumber.cleanRomanNumber("UU");
        assertEquals("",cleanRoman3);
    }

}