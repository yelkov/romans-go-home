package edu.badpals.romans;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRomanNumber {

    public static String cleanRomanNumber(String roman){
        String regex = "([IVXLCDM]{0,3})";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(roman);

        String cleanRoman ="";
        while(m.find()){
            cleanRoman += m.group();
        }
        return cleanRoman;
    }
}
