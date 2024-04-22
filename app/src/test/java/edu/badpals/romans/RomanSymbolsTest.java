package edu.badpals.romans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanSymbolsTest {
    @Test
    public void enumTest(){
        assertEquals(1,RomanSymbols.I.getValue());
        assertEquals(5,RomanSymbols.V.getValue());
        assertEquals(10,RomanSymbols.X.getValue());
        assertEquals(50,RomanSymbols.L.getValue());
        assertEquals(100,RomanSymbols.C.getValue());
        assertEquals(500,RomanSymbols.D.getValue());
        assertEquals(1000,RomanSymbols.M.getValue());
    }

}