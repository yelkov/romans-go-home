package edu.badpals.romans;

import java.util.EnumSet;

public class RomanNumber {
    String roman;
    public RomanNumber(String roman){
        this.roman = roman;
    }
    public Short toDecimal(){
        EnumSet<RomanSymbols> romanSymbols = EnumSet.allOf(RomanSymbols.class);
        if (romanSymbols.contains(RomanSymbols.valueOf(roman))){
            return (short)RomanSymbols.valueOf(roman).getValue();
        }
        return 0;
    }

}
