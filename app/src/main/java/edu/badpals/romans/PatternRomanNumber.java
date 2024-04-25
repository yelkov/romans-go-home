package edu.badpals.romans;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static edu.badpals.romans.PatternRomanNumber.substractPattern;
import static edu.badpals.romans.PatternRomanNumber.sumatoryPattern;

public class PatternRomanNumber {

    private static String sumatory = "([IXCM]{1,3}|[VLD])";
    private static String substract = "(I[VX]|X[LC]|C[DM])";
    private static ArrayList<String> romanNumbers = new ArrayList<>();
    private static String romanString = "";

    public static void substractPattern(String roman){
        romanString = roman;
        Pattern p = Pattern.compile(substract);
        Matcher m = p.matcher(roman);
        while(m.find()){
            romanNumbers.add(m.group());
            romanString = romanString.replace(m.group(), "");
        }
    }
    public static void sumatoryPattern(){
        Pattern p = Pattern.compile(sumatory);
        Matcher m = p.matcher(romanString);
        while(m.find()){
            romanNumbers.add(m.group());
        }
    }

    public static ArrayList<String> getRomanNumbers(String roman){
        romanNumbers.clear();
        substractPattern(roman);
        sumatoryPattern();
        return romanNumbers;
    }
}
