package edu.badpals.romans;

import java.util.EnumSet;

public class RomanNumber {
    String roman;
    public RomanNumber(String roman){
        this.roman = roman;
    }
    public Short toDecimal(){
        String cleanNumber = PatternRomanNumber.cleanRomanNumber(roman);
        short value = 0;
        for (Character c : cleanNumber.toCharArray()){
            value += RomanSymbols.valueOf(c.toString()).getValue();
        }
        return value;
    }

}
