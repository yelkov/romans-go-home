package edu.badpals.romans;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRomanNumber {

    private static String sumatory = "([IXCM]{0,3}|[VLD])";

    public static String sumatoryPattern(String roman){
        Pattern p = Pattern.compile(sumatory);
        Matcher m = p.matcher(roman);

        String cleanRoman ="";
        while(m.find()){
            cleanRoman += m.group();
        }
        return cleanRoman;
    }
}
