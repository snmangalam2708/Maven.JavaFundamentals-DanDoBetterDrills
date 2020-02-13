package com.zipcodewilmington.danny_do_better_exercises;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities<stringToReverse1> {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {

        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){

        return firstSegment.concat(secondSegment);
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){

        return firstSegment+secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){

        return input.substring(0,3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){


        return input.substring(input.length()-3);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){

        return inputValue == comparableValue;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){

        int i = inputValue.length()/2;
        char c;
        if (i % 2 != 0)

        {  c = inputValue.charAt(i);
        }

        else

        {  i-=1;
           c = inputValue.charAt(i);
        }
        return c;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){


        return spaceDelimitedString.substring(0,spaceDelimitedString.indexOf(" "));
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){

        return spaceDelimitedString.substring(spaceDelimitedString.indexOf(" ",0)+1);

    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){

        String output = "";

        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            output += stringToReverse.charAt(i);
        }

        return output;

    }
}
