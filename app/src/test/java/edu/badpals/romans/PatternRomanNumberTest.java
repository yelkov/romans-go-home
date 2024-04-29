package edu.badpals.romans;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PatternRomanNumberTest {
    @Test
    public void test_cleanRoman_simple(){
        ArrayList<String> cleanRoman = PatternRomanNumber.getRomanNumbers("UMMMU");
        assertEquals("[MMM]",cleanRoman.toString());
        ArrayList<String> cleanRoman1 = PatternRomanNumber.getRomanNumbers("UMMU");
        assertEquals("[MM]",cleanRoman1.toString());
        ArrayList<String> cleanRoman3 = PatternRomanNumber.getRomanNumbers("UU");
        assertEquals("[]",cleanRoman3.toString());
    }
    @Test
    public void test_dos(){
        ArrayList<String> cleanRoman = PatternRomanNumber.getRomanNumbers("UIVU");
        assertEquals("[IV]",cleanRoman.toString());
    }
}