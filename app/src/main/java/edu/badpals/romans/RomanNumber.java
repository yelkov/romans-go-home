package edu.badpals.romans;

import java.util.ArrayList;

public class RomanNumber {
    String roman;
    public RomanNumber(String roman){
        this.roman = roman;
    }
    public Short toDecimal(){
        ArrayList<String> cleanNumber = PatternRomanNumber.getRomanNumbers(roman);
        short value = 0;
        for (String pattern : cleanNumber){
            if (pattern.length() == 2 && pattern.charAt(0) != pattern.charAt(1)){
                value += RomanSymbols.valueOf(pattern).getValue();
            } else {
                value += RomanSymbols.valueOf(Character.toString(pattern.charAt(0))).getValue() * pattern.length();
            }
        }
        return value;
    }

}
